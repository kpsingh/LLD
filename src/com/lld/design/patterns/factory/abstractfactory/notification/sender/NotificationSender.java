package com.lld.design.patterns.factory.abstractfactory.notification.sender;

import com.lld.design.patterns.factory.abstractfactory.notification.NotificationType;
import com.lld.design.patterns.factory.abstractfactory.notification.notification.Notification;

public abstract class NotificationSender {
    private final Notification notification;

    public NotificationSender(Notification notification) {
        this.notification = notification;
    }

    public Notification getNotification() {
        return notification;
    }

    public abstract void send();

    public abstract NotificationType notificationType();

}