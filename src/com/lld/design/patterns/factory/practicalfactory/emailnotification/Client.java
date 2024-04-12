package com.lld.design.patterns.factory.practicalfactory.emailnotification;

public class Client {

    public static void main(String[] args) {

        Notification notification = NotificationFactory.getNotificationType(NotificationType.SMS, "rohit", "tarun", "Hello");
        notification.sendNotification();

    }
}
