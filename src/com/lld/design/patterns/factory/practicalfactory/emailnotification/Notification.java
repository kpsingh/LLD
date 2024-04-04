package com.design.patterns.factory.practicalfactory.emailnotification;

public abstract class Notification {
    public String recipient;
    public String message;

    public Notification(String recipient, String message) {
        this.recipient = recipient;
        this.message = message;
    }

    public abstract NotificationType notificationType();

    public abstract void sendNotification();

    public String getRecipient() {
        return recipient;
    }

    public String getMessage() {
        return message;
    }

}
