package com.softserve.edu.pages;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$;

/**
 * Here we have class for dropdown element
 * "google account", thankfully to this element
 * we can logout, add new account, to see others
 * accounts and do other things
 */
public class GoogleAccountDropdownComponent {
    private SelenideElement logoutElement;

    public GoogleAccountDropdownComponent() {
        logoutElement = $("#gb_71");
    }
    //logout element
    public SelenideElement getLogoutElement(){
        return logoutElement;
    }
    public String getTextFromLogoutElement(){
        return logoutElement.getText();
    }
    public void clickLogoutElement(){
        logoutElement.click();
    }
}
