package com.softserve.edu.pages;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import static com.codeborne.selenide.Selenide.$;

/**
 * Here we have class for passwordPage
 * (Page where we have to input correct password,
 * to have possibility to use gmail )
 */
public class PasswordPage {
    private SelenideElement passwordField;
    private SelenideElement continueButton;

    public PasswordPage() {
        passwordField = $(By.name("password"));
        continueButton = $("#passwordNext");
    }

    //continue button
    public void clickContinueButton() {
        continueButton.shouldBe(Condition.visible).click();
    }

    //password field
    public SelenideElement getPasswordField() {
        return passwordField;
    }

    public void setPasswordField(String password) {
        passwordField.setValue(password);
    }

    public void getTextFromPasswordField() {
        passwordField.getText();
    }

    public void clearPasswordField() {
        passwordField.clear();
    }

    public void clickPasswordField() {
        passwordField.shouldBe(Condition.visible).click();
    }

    /**
     * method for login with correct password
     * @param password - password for login
     * @return next page(incomingMessagePage page)
     */
    public IncomingMessagesPage enterCorrectPassword(String password) {
        clearPasswordField();
        clearPasswordField();
        setPasswordField(password);
        clickContinueButton();
        return new IncomingMessagesPage();
    }




}
