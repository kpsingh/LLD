package com.lld.design.patterns.factory.abstractfactory.notification;

import com.lld.design.patterns.factory.abstractfactory.notification.notification.Notification;
import com.lld.design.patterns.factory.abstractfactory.notification.notification.PushNotification;
import com.lld.design.patterns.factory.abstractfactory.notification.sender.NotificationSender;
import com.lld.design.patterns.factory.abstractfactory.notification.sender.PushNotificationSender;
import com.lld.design.patterns.factory.abstractfactory.notification.template.NotificationTemplate;
import com.lld.design.patterns.factory.abstractfactory.notification.template.PushNotificationTemplate;

public class PushNotificationFactory extends NotificationFactory {
    @Override
    public NotificationType notificationType() {
        return NotificationType.PUSH;
    }

    @Override
    public NotificationSender createNotificationSender(Notification notification) {
        return new PushNotificationSender(notification);
    }

    @Override
    public PushNotificationTemplate createNotificationTemplate(String message) {
        return new PushNotificationTemplate(message);
    }

    @Override
    public Notification createNotification(String recipient, String sender, NotificationTemplate template) {
        return new PushNotification(recipient, template);
    }
}
