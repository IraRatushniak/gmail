package com.softserve.edu.pages;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import org.apache.log4j.Logger;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;

/**
 * Here we have class for LoginPage
 * (Page where we have to input correct email,
 * to have possibility to go into password page )
 */
public class LoginPage {
    private SelenideElement emailField;
    private SelenideElement continueButton;

    public LoginPage() {
        emailField = $(By.name("identifier"));
        continueButton = $(byText("Далі"));
    }

    //continue button
    public void clickContinueButton() {
        continueButton.shouldBe(Condition.visible).click();
    }

    //email field
    public SelenideElement getEmailField() {
        return emailField;
    }

    public void setEmailField(String email) {
        emailField.setValue(email);
    }

    public void getTextFromEmailField() {
        emailField.getText();
    }

    public void clearEmailField() {
        emailField.clear();
    }

    public void clickEmailField() {
        emailField.shouldBe(Condition.visible).click();
    }

    /**
     * method for login with correct email
     *
     * @param email - email for login
     * @return next page(password page)
     */
    public PasswordPage enterCorrectEmail(String email) {
        clickEmailField();
        clearEmailField();
        setEmailField(email);
        clickContinueButton();
        return new PasswordPage();
    }

}
