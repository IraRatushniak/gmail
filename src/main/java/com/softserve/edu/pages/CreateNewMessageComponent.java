package com.softserve.edu.pages;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import org.apache.log4j.Logger;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selectors.by;
import static com.codeborne.selenide.Selenide.$;

/**
 * In this class we have component
 * for creating new letter.
 *
 * @author Iryna Ratushniak
 */
public class CreateNewMessageComponent {
    private final Logger log = Logger.getLogger(this.getClass());
    private SelenideElement toWhomField;
    private SelenideElement subjectOfTheMessageField;
    private SelenideElement messageField;
    private SelenideElement sendButton;

    public CreateNewMessageComponent() {
        toWhomField = $(By.name("to"));
        subjectOfTheMessageField = $(By.name("subjectbox"));
        messageField = $(".Am.Al.editable.LW-avf");
        sendButton = $(".T-I.J-J5-Ji.aoO.v7.T-I-atl.L3");
    }


    public SelenideElement getToWhomField() {
        return toWhomField;
    }

    public void setToWhomField(String toWhom) {
        toWhomField.setValue(toWhom);
    }

    public void clickToWhomField() {
        toWhomField.shouldBe(Condition.visible).click();
    }

    public void clearToWhomField() {
        toWhomField.clear();
    }

    public void getTextFromToWhomeField() {
        toWhomField.getText();
    }


    public SelenideElement getSubjectOfTheMessageField() {
        return subjectOfTheMessageField;
    }

    public void setSubjectOfTheMessageField(String subjectOfTheMessage) {
        subjectOfTheMessageField.setValue(subjectOfTheMessage);
    }

    public void clickSubjectOfTheMessageField() {
        subjectOfTheMessageField.shouldBe(Condition.visible).click();
    }

    public void clearSubjectOfTheMessageField() {
        subjectOfTheMessageField.clear();
    }

    public void getTextFromSubjectOfTheMessageField() {
        subjectOfTheMessageField.getText();
    }


    public SelenideElement getMessageField() {
        return messageField;
    }

    public void setMessageField(String message) {
        messageField.setValue(message);
    }

    public void clickMessageField() {
        messageField.shouldBe(Condition.visible).click();
    }

    public void clearMessageField() {
        messageField.clear();
    }

    public void getTextFromMessageField() {
        messageField.getText();
    }


    public void clickSendButton() {
        sendButton.shouldBe(Condition.visible).click();
    }

    public CreateNewMessageComponent fillToWhomField(String toWhom) {
        clickToWhomField();
        clearToWhomField();
        setToWhomField(toWhom);
        toWhomField.pressEnter();
        log.info("To whom field was filled (to " + toWhom + ")!");
        return this;
    }

    public CreateNewMessageComponent fillSubjectOfTheMessageField(String subjectOfTheMessage) {
        clickSubjectOfTheMessageField();
        clearSubjectOfTheMessageField();
        setSubjectOfTheMessageField(subjectOfTheMessage);
        subjectOfTheMessageField.pressEnter();
        log.info("Subject of the message was filled (subject : " + subjectOfTheMessage + ")!");
        return this;
    }

    public CreateNewMessageComponent fillMessageField(String message) {
        clickMessageField();
        clearMessageField();
        setMessageField(message);
        messageField.pressEnter();
        log.info("Message field was filled( message :" + message + ")!");
        return this;
    }

    /**
     * Here we have method for sending new message.
     *
     * @param toWhom              - the person you want to send a message
     * @param subjectOfTheMessage - name of the message
     * @param message             - the message
     */
    public void sendMessage(String toWhom, String subjectOfTheMessage, String message) {
        fillToWhomField(toWhom).
                fillSubjectOfTheMessageField(subjectOfTheMessage).
                fillMessageField(message).
                clickSendButton();
        log.info("Message was send!");
    }
}
