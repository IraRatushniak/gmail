package com.softserve.edu.pages;


import org.apache.log4j.Logger;

/**
 * Here we have class for IncomingMessagesPage.
 *
 * @author Iryna Ratushniak
 */
public class IncomingMessagesPage extends AHeaderPart {
    private MessageContainerComponent messages;
    private final Logger log = Logger.getLogger(this.getClass());

    public IncomingMessagesPage() {
        messages = new MessageContainerComponent();
    }

    public MessageContainerComponent getMessageContainerComponent() {
        return messages;
    }

    public IncomingMessagesPage refreshPage() {
        log.info("Page was refreshed!");
        return new IncomingMessagesPage();
    }


}
