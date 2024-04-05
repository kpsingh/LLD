package com.lld.design.patterns.factory.abstractfactory.notification;

import com.lld.design.patterns.factory.abstractfactory.notification.notification.EmailNotification;
import com.lld.design.patterns.factory.abstractfactory.notification.notification.Notification;
import com.lld.design.patterns.factory.abstractfactory.notification.sender.EmailNotificationSender;
import com.lld.design.patterns.factory.abstractfactory.notification.sender.NotificationSender;
import com.lld.design.patterns.factory.abstractfactory.notification.template.EmailNotificationTemplate;
import com.lld.design.patterns.factory.abstractfactory.notification.template.NotificationTemplate;
import com.lld.design.patterns.factory.abstractfactory.notification.template.PushNotificationTemplate;

public class EmailNotificationFactory extends NotificationFactory{

    @Override
    public NotificationType notificationType() {
        return NotificationType.EMAIL;
    }

    @Override
    public NotificationSender createNotificationSender(Notification notification) {
        return new EmailNotificationSender(notification);
    }

    @Override
    public PushNotificationTemplate createNotificationTemplate(String message) {
        return new EmailNotificationTemplate(message);
    }

    @Override
    public Notification createNotification(String recipient, String sender, NotificationTemplate template) {
        return new EmailNotification(sender, recipient, template);
    }

}
