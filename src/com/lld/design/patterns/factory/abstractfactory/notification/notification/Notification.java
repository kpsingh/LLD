package com.lld.design.patterns.factory.abstractfactory.notification.notification;

import com.lld.design.patterns.factory.abstractfactory.notification.NotificationType;
import com.lld.design.patterns.factory.abstractfactory.notification.template.NotificationTemplate;

public abstract class Notification {

    private String recipient;
    private NotificationTemplate template;

    public Notification(String recipient, NotificationTemplate template) {
        this.recipient = recipient;
        this.template = template;
    }

    public String getRecipient() {
        return recipient;
    }

    public NotificationTemplate getTemplate() {
        return template;
    }

    public abstract NotificationType notificationType();

    public abstract void sendNotification();
}
