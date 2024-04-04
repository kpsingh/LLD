package com.lld.design.patterns.prototype.documentmanager;

public class Letter extends  Document{
    private String recipient;

    public String getRecipient() {
        return recipient;
    }

    public void setRecipient(String recipient) {
        this.recipient = recipient;
    }

    @Override
    public String toString() {
        return "Letter{" +
                "recipient='" + recipient + '\'' +
                ", text='" + text + '\'' +
                '}';
    }
}
