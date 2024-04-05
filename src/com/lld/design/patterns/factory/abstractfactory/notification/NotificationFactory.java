package com.lld.design.patterns.factory.abstractfactory.notification;

import com.lld.design.patterns.factory.abstractfactory.notification.notification.Notification;
import com.lld.design.patterns.factory.abstractfactory.notification.sender.NotificationSender;
import com.lld.design.patterns.factory.abstractfactory.notification.template.EmailNotificationTemplate;
import com.lld.design.patterns.factory.abstractfactory.notification.template.NotificationTemplate;

public abstract class NotificationFactory {
    public abstract NotificationType notificationType();

    public abstract NotificationSender createNotificationSender(Notification notification);

    public abstract EmailNotificationTemplate createNotificationTemplate(String message);

    public abstract Notification createNotification(String recipient, String sender, NotificationTemplate template);


}