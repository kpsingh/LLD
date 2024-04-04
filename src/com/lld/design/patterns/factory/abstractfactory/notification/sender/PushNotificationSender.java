package com.lld.design.patterns.factory.abstractfactory.notification.sender;


import com.design.patterns.factory.abstractfactory.notification.NotificationType;
import com.design.patterns.factory.abstractfactory.notification.notification.Notification;

public class PushNotificationSender extends NotificationSender {

    public PushNotificationSender(Notification notification) {
        super(notification);
    }

    @Override
    public void send() {
        System.out.println("Sending Push notification to " + getNotification().getRecipient());
    }

    @Override
    public NotificationType notificationType() {
        return NotificationType.PUSH;
    }
}