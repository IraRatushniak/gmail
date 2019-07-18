package com.softserve.edu.pages;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;

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
    private SelenideElement writeButton;
    private CreateNewMessageComponent createNewMessageComponent;
    private SelenideElement amountUnreadedMessages;
    private SelenideElement googleAccountDropdownElement;

    AHeaderPart() {
        writeButton = $(byText("Написати"));
        amountUnreadedMessages = $(".bsU");
        googleAccountDropdownElement = $(by("class", "gb_za gbii"));
    }

    //writeButton
    public SelenideElement getWriteButton() {
        return writeButton;
    }

    public CreateNewMessageComponent clickWriteButton() {
        writeButton.shouldBe(Condition.visible).click();
        return new CreateNewMessageComponent();
    }
    public String getTextFromWriteButton(){
        return writeButton.getText();
    }

    //amountUnreadedMessages
    public SelenideElement getAmountUnreadedMessages() {
        return amountUnreadedMessages;
    }
    public Integer getNumberOfUnreadedMesseges() {
        return Integer.parseInt(amountUnreadedMessages.getText());
    }

    //googleAccountDropdownElement
    public SelenideElement getGoogleAccountDropdownElement(){
        return googleAccountDropdownElement;
    }
    public String getText(){
        return googleAccountDropdownElement.getText();
    }
    public GoogleAccountDropdownComponent clickGoogleAccountDropdownElement(){
        googleAccountDropdownElement.click();
        return new GoogleAccountDropdownComponent();
    }


}
