package com.softserve.edu.pages;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import org.apache.log4j.Logger;

import static com.codeborne.selenide.Selectors.by;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.*;

/**
 * In this class we have common things for
 * MessagePage and IncomingMessagePage
 *
 * @author Iryna Ratushniak
 */
public abstract class AHeaderPart {
    private final Logger log = Logger.getLogger(this.getClass());
    private SelenideElement writeButton;
    private CreateNewMessageComponent createNewMessageComponent;
    private SelenideElement amountUnreadedMessages;
    private SelenideElement googleAccountDropdownElement;

    AHeaderPart() {
        writeButton = $(byText("Написати"));
        amountUnreadedMessages = $(".bsU");
        googleAccountDropdownElement = $(".gb_za.gbii");
    }

    public SelenideElement getWriteButton() {
        return writeButton;
    }

    public CreateNewMessageComponent clickWriteButton() {
        writeButton.shouldBe(Condition.visible).click();
        log.info("Write button was clicked");
        return new CreateNewMessageComponent();
    }

    public String getTextFromWriteButton() {
        return writeButton.getText();
    }


    public SelenideElement getAmountUnreadedMessages() {
        return amountUnreadedMessages;
    }

    public Integer getNumberOfUnreadedMesseges() {
        return Integer.parseInt(amountUnreadedMessages.getText());
    }


    public SelenideElement getGoogleAccountDropdownElement() {
        return googleAccountDropdownElement;
    }

    public String getText() {
        return googleAccountDropdownElement.getText();
    }

    public GoogleAccountDropdownComponent clickGoogleAccountDropdownElement() {
        googleAccountDropdownElement.click();
        log.info("Google Account Dropdown Element was clicked!");
        return new GoogleAccountDropdownComponent();
    }


}
