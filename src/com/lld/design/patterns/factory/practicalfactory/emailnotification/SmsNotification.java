package com.lld.design.patterns.factory.practicalfactory.emailnotification;

public class SmsNotification extends Notification {
    public SmsNotification(String recipient, String message) {
        super(recipient, message);
    }

    @Override
    public NotificationType notificationType() {
        return NotificationType.SMS;
    }

    @Override
    public void sendNotification() {
        // Logic to send an SMS
        System.out.println("SMS sent to " + recipient);
        System.out.println("Message: " + message);
    }
}
