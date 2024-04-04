package com.design.patterns.factory.practicalfactory.emailnotification;

public class PushNotification extends Notification {
    public PushNotification(String recipient, String message) {
        super(recipient, message);
    }

    @Override
    public NotificationType notificationType() {
        return NotificationType.PUSH;
    }

    @Override
    public void sendNotification() {
        // Logic to send a push notification
        System.out.println("Push notification sent to device " + recipient);
        System.out.println("Message: " + message);
    }
}
