package com.softserve.edu.tests;

import com.softserve.edu.data.MessageRepository;
import com.softserve.edu.data.User;
import com.softserve.edu.data.UserRepository;
import com.softserve.edu.pages.*;
import com.softserve.edu.tools.RandomText;

import org.testng.Assert;

import org.testng.annotations.*;
import static com.codeborne.selenide.Selenide.*;


public class sendMessageTest {
    private final Integer MESSAGE_NAME_LENGTH = 10;

    @BeforeClass
    public void beforeClass() {
        System.setProperty("webdriver.chrome.driver",
                ".\\lib\\chromedriver.exe");
        System.setProperty("selenide.browser", "Chrome");
        open("https://gmail.com");

    }



    /**
     * Data for send message test
     * @return Object, which consist from message,
     * that we want to send and user, which send message
     */
    @DataProvider
    public Object[][] dataForSendMessageTest() {
        return new Object[][]{
                {RandomText.subjectOfTheMessage(MESSAGE_NAME_LENGTH), UserRepository.ira()}
        };
    }

    /**
     * This test is for checking
     * that email is really send.
     *
     * @param subjectOfTheMessage-name of the message
     * @param user-person?who          send message
     */
    @Test(dataProvider = "dataForSendMessageTest")
    public void sendingMessageTest(String subjectOfTheMessage, User user) {
        //Steps
        LoginPage loginPage = new LoginPage();
        IncomingMessagesPage incomingMessagesPage = loginPage
                .enterCorrectEmail(user.getLogin())
                .enterCorrectPassword(user.getPassword());
        incomingMessagesPage.clickWriteButton()
                .sendMessage(UserRepository.ira().getLogin(),
                        subjectOfTheMessage, MessageRepository.someMessage());
        Integer numberOfUnreadedMessages=incomingMessagesPage.getNumberOfUnreadedMesseges();
        //check
        Assert.assertTrue(incomingMessagesPage.
                refreshPage().
                getMessageContainerComponent().
                isMessage(subjectOfTheMessage));
        Assert.assertEquals(incomingMessagesPage.getNumberOfUnreadedMesseges(),numberOfUnreadedMessages++);
    }


}

