package com.softserve.edu.pages;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selectors.by;

/**
 * Here we have class for message
 * (it is a component for few pages),
 * which have few methods, for action
 * which are connected with message.
 *
 * @author Iryna Ratushniak
 */
public class MessageComponent {
    private SelenideElement messageLayout;
    private SelenideElement fromWhom;
    private SelenideElement subjectOfTheMessage;
    private SelenideElement partialMessage;
    private SelenideElement time;

    public MessageComponent(SelenideElement messageLayout) {
        this.messageLayout = messageLayout.waitUntil(Condition.visible, 10000);
        fromWhom = messageLayout.$(".yX.xY");
        subjectOfTheMessage = messageLayout.
                $(".xY.a4W .xS .xT .y6");
        partialMessage = messageLayout.
                $("xY.a4W .xS .xT .y2");
        time = messageLayout.$(".xW.xY");
    }

    public SelenideElement getMessageLayout() {
        return messageLayout;
    }

    public SelenideElement getFromWhom() {
        return fromWhom;
    }

    public void clickFromWhom() {
        fromWhom.click();
    }

    public String getNameFromWhom() {
        return fromWhom.getText();
    }

    public SelenideElement getSubjectOfTheMessage() {
        return subjectOfTheMessage;
    }

    public void clickSubjectOfTheMessage() {
        subjectOfTheMessage.shouldBe(Condition.visible).click();
    }

    public String getTextSubjectOfTheMessage() {
        return subjectOfTheMessage.waitUntil(Condition.visible, 10000)
                .getText();
    }

    public SelenideElement getPartialMessage() {
        return partialMessage;
    }

    public void clickPartialMessage() {
        partialMessage.click();
    }

    public String getTextPartialMessage() {
        return partialMessage.getText();
    }

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
