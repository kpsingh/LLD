package com.lld.design.patterns.factory.abstractfactory.notification.sender;

import com.design.patterns.factory.abstractfactory.notification.NotificationType;
import com.design.patterns.factory.abstractfactory.notification.notification.Notification;

public class EmailNotificationSender extends NotificationSender {

    public EmailNotificationSender(Notification notification) {
        super(notification);
    }

    @Override
    public void send() {
        System.out.println("Sending Email notification to " + getNotification().getRecipient());
    }

    @Override
    public NotificationType notificationType() {
        return NotificationType.EMAIL;
    }
}