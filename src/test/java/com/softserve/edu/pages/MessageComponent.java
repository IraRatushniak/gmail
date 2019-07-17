package com.softserve.edu.pages;
import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import static com.codeborne.selenide.Selectors.by;

/**
 * Here we have class for message
 * (it is a component for few pages),
 * which have few methods, for action
 * which are connected with message
 */
public class MessageComponent {
    private SelenideElement messageLayout;
    private SelenideElement fromWhom;
    private SelenideElement subjectOfTheMessage;
    private SelenideElement partialMessage;
    private SelenideElement time;

    public MessageComponent(SelenideElement messageLayout) {
        this.messageLayout = messageLayout.waitUntil(Condition.visible,10000);
        fromWhom = messageLayout.$(by("class", "yX xY"));
        subjectOfTheMessage = messageLayout.
                $(by("class", "xY a4W")).$(".xS").$(".xT").$(".y6");
        partialMessage = messageLayout.
                $(by("class", "xY a4W")).$(".xS").$(".xT").$(".y2");
        time = messageLayout.$(by("class", "xW xY"));
    }

    public SelenideElement getMessageLayout() {
        return messageLayout;
    }


    //fromWhom
    public SelenideElement getFromWhom() {
        return fromWhom;
    }

    public void clickFromWhom() {
        fromWhom.click();
    }

    public String getNameFromWhom() {
        return fromWhom.getText();
    }

    //subjectOfTheMessage
    public SelenideElement getSubjectOfTheMessage() {
        return subjectOfTheMessage;
    }

    public void clickSubjectOfTheMessage() {
        subjectOfTheMessage.shouldBe(Condition.visible).click();
    }

    public String getTextSubjectOfTheMessage() {
        return subjectOfTheMessage.waitUntil(Condition.visible,10000).getText();
    }

    //message
    public SelenideElement getPartialMessage() {
        return partialMessage;
    }

    public void clickPartialMessage() {
        partialMessage.click();
    }

    public String getTextPartialMessage() {
        return partialMessage.getText();
    }

    //time
    public SelenideElement getTime() {
        return time;
    }

    public void clickTime() {
        time.click();
    }

    public String getTextTime() {
        return time.getText();
    }


}
