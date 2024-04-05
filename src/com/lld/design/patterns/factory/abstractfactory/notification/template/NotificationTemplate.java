package com.lld.design.patterns.factory.abstractfactory.notification.template;

import com.lld.design.patterns.factory.abstractfactory.notification.NotificationType;

public abstract class NotificationTemplate {
    private String message;

    public NotificationTemplate(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }

    public abstract String applyTemplate();
    public abstract NotificationType notificationType();

}
