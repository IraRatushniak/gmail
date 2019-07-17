package com.softserve.edu.pages;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;

import java.util.ArrayList;
import java.util.List;

import static com.codeborne.selenide.Selectors.by;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$$;

/**
 * Here we have class for List of message
 * (which are present on some pages)
 * and methods for them
 * @author Iryna Ratushniak
 */
public class MessageContainerComponent {
    private List<MessageComponent> messageComponents;

    public MessageContainerComponent() {
        messageComponents = new ArrayList<>();
        for (SelenideElement current : getMessageSelenideElement()) {
            current.shouldBe(Condition.visible);
            messageComponents.add(new MessageComponent(current));
        }
    }

    private List<SelenideElement> getMessageSelenideElement() {
        $(byText("Основні")).shouldBe(Condition.visible);
        return $$(by("class", "zA zE"));
    }

    //messageComponents
    public List<MessageComponent> getMessageComponents() {
        return messageComponents;
    }

    public List<String> getMessageComponentsSubjectOfTheMessage() {
        List<String> messageComponentsSubjectOfTheMessage =
                new ArrayList<>();
        for (MessageComponent messageComponent : messageComponents) {
            messageComponentsSubjectOfTheMessage.
                    add(messageComponent.getTextSubjectOfTheMessage());
        }
        return messageComponentsSubjectOfTheMessage;
    }

    /**
     * Method for checking, that the message
     * with particular name is present on the page
     */
    public Boolean isMessage(String subjectThatWeWantToFind) {
//        $$(by("class", "zA zE")).
//                first().waitUntil(Condition.appear, 100000);
        $(".bsU").waitUntil(Condition.visible,7000);
        return getMessageComponentsSubjectOfTheMessage().
                contains(subjectThatWeWantToFind);
    }

    /**
     * Method for printing names of all message,
     * which are present on the page
     */
    public void printMessagesNames() {
        for (String messageName :
                getMessageComponentsSubjectOfTheMessage()) {
            System.out.println(messageName);
        }
    }
}
