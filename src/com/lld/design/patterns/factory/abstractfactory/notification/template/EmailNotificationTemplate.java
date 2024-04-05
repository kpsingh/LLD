package com.lld.design.patterns.factory.abstractfactory.notification.template;

import com.lld.design.patterns.factory.abstractfactory.notification.NotificationType;

public class EmailNotificationTemplate extends NotificationTemplate {
    public EmailNotificationTemplate(String message) {
        super(message);
    }

    @Override
    public String applyTemplate() {
        System.out.println("Applying Email notification template");
        return getMessage();
    }

    @Override
    public NotificationType notificationType() {
        return NotificationType.EMAIL;
    }
}