package com.lld.design.patterns.factory.abstractfactory.notification;

import com.design.patterns.factory.abstractfactory.notification.notification.Notification;
import com.design.patterns.factory.abstractfactory.notification.sender.NotificationSender;
import com.design.patterns.factory.abstractfactory.notification.template.NotificationTemplate;

public abstract class NotificationFactory {
    public abstract NotificationType notificationType();

    public abstract NotificationSender createNotificationSender(Notification notification);

    public abstract NotificationTemplate createNotificationTemplate(String message);

    public abstract Notification createNotification(String recipient, String sender, NotificationTemplate template);


}