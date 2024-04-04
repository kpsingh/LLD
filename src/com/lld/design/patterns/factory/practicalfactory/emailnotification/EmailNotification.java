package com.design.patterns.factory.practicalfactory.emailnotification;

public class EmailNotification extends Notification {
    private String sender;

    public EmailNotification(String recipient, String message, String sender) {
        super(recipient, message);
        this.sender = sender;
    }

    @Override
    public NotificationType notificationType() {
        return NotificationType.EMAIL;
    }

    @Override
    public void sendNotification() {
        // Logic to send an email
        System.out.println("Email sent to " + recipient + " from " + sender);
        System.out.println("Message: " + message);
    }

    public String getSender() {
        return sender;
    }
}
