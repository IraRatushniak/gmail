package com.softserve.edu.pages;


/**
 * Here we have class for IncomingMessagesPage
 */
public class IncomingMessagesPage extends AHeaderPart {
    private MessageContainerComponent messages;

    public IncomingMessagesPage() {
        messages = new MessageContainerComponent();
    }

    public MessageContainerComponent getMessageContainerComponent() {
        return messages;
    }

    public IncomingMessagesPage refreshPage() {
        return new IncomingMessagesPage();
    }


}
