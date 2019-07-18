package com.softserve.edu.tests;

import org.apache.log4j.Logger;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;

import static com.codeborne.selenide.Selenide.open;

public class ATestRunner {
    protected final Logger log = Logger.getLogger(this.getClass());
    private final Integer MESSAGE_NAME_LENGTH = 10;

    @BeforeSuite
    public void beforeSuite() {
        System.setProperty("webdriver.chrome.driver",
                ".\\src\\test\\resources\\lib\\chromedriver.exe");
        System.setProperty("selenide.browser", "Chrome");
        log.info("ChromeDriver loaded.");


    }
}
