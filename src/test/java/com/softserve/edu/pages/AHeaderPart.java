package com.softserve.edu.pages;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.*;

/**
 * In this class we have common things for
 * MessagePage and IncomingMessagePage
 */
public abstract class AHeaderPart {
    private SelenideElement writeButton;
    private CreateNewMessageComponent createNewMessageComponent;

     AHeaderPart() {
        writeButton = $(byText("Написати"));
    }

    //writeButton
    public CreateNewMessageComponent clickWriteButton() {
        writeButton.shouldBe(Condition.visible).click();
        return new CreateNewMessageComponent();
    }


}
