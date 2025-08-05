package com.example.factory;

public class EmailNotificationCreator extends NotificationCreator {

	@Override
	public Notification createNotification() {
		
		return new EmailNotification();
	}

}
