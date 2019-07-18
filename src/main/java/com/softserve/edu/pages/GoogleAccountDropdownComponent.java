package com.softserve.edu.pages;

import com.codeborne.selenide.SelenideElement;
import org.apache.log4j.Logger;

import static com.codeborne.selenide.Selenide.$;

/**
 * Here we have class for dropdown element
 * "google account", thankfully to this element
 * we can logout, add new account, to see others
 * accounts and do other things
 */
public class GoogleAccountDropdownComponent {
    private SelenideElement logoutElement;
    private final Logger log = Logger.getLogger(this.getClass());

    public GoogleAccountDropdownComponent() {
        logoutElement = $("#gb_71");
    }


    public SelenideElement getLogoutElement() {
        return logoutElement;
    }

    public String getTextFromLogoutElement() {
        return logoutElement.getText();
    }

    public void clickLogoutElement() {
        log.info("Logout component was clicked!");
        logoutElement.click();
    }
}
