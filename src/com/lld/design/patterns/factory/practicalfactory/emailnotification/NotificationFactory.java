package com.lld.design.patterns.factory.practicalfactory.emailnotification;

public class NotificationFactory {
    public static Notification getNotificationType(NotificationType type, String recipient, String sender, String message) {
        if (type == NotificationType.EMAIL) {
            return new EmailNotification(recipient, sender, message);
        } else if (type == NotificationType.PUSH) {
            return new PushNotification(recipient, message);
        } else if (type == NotificationType.SMS) {
            return new SmsNotification(recipient, message);
        }
        throw new IllegalArgumentException("Invalid notification type");

    }
}

