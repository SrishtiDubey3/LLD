package com.example.factory;

public class Main {

	public static void main(String[] args) {
		
		NotificationCreator email = new EmailNotificationCreator();
        email.send();  // Output: Sending an Email Notification

        NotificationCreator sms = new SMSNotificationCreator();
        sms.send();    // Output: Sending an SMS Notification

	}

}
