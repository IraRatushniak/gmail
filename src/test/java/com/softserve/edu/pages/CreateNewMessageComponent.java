package com.softserve.edu.pages;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import org.apache.log4j.Logger;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selectors.by;
import static com.codeborne.selenide.Selenide.$;

/**
 * In this class we have component
 * for creating new letter
 */
public class CreateNewMessageComponent {
    protected final Logger log = Logger.getLogger(this.getClass());
    private SelenideElement toWhomField;
    private SelenideElement subjectOfTheMessageField;
    private SelenideElement messageField;
    private SelenideElement sendButton;

    public CreateNewMessageComponent() {
        toWhomField = $(By.name("to"));
        subjectOfTheMessageField = $(By.name("subjectbox"));
        messageField = $(by("class","Am Al editable LW-avf"));
        sendButton = $(by("class","T-I J-J5-Ji aoO v7 T-I-atl L3"));
    }

    //toWhomField
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

    //subjectOfTheMessageField
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

    //messageField
    public SelenideElement getMessageField() {
        return messageField;
    }

    public void setMessageField(String message) {
        messageField.setValue(message);
    }

    public void clickMessageField() {
        messageField.click();
    }

    public void clearMessageField() {
        messageField.clear();
    }

    public void getTextFromMessageField() {
        messageField.getText();
    }

    //sendButton
    public void clickSendButton() {
        sendButton.shouldBe(Condition.visible).click();
    }

    public CreateNewMessageComponent fillToWhomField(String toWhom) {
        clickToWhomField();
        clearToWhomField();
        setToWhomField(toWhom);
        toWhomField.pressEnter();
        return this;
    }

    public CreateNewMessageComponent fillSubjectOfTheMessageField(String subjectOfTheMessage) {
        clickSubjectOfTheMessageField();
        clearSubjectOfTheMessageField();
        setSubjectOfTheMessageField(subjectOfTheMessage);
        subjectOfTheMessageField.pressEnter();
        return this;
    }

    public CreateNewMessageComponent fillMessageField(String message) {
        clickMessageField();
        clearMessageField();
        setMessageField(message);
        messageField.pressEnter();
        return this;
    }

    public void sendMessage(String toWhom, String subjectOfTheMessage, String message) {
        fillToWhomField(toWhom);
        fillSubjectOfTheMessageField(subjectOfTheMessage);
        fillMessageField(message);
        clickSendButton();
        log.info("Message was send!");
    }
}
