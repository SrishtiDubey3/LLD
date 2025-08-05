package com.example.factory;

public abstract class NotificationCreator {
	 
    // Factory method
    public abstract Notification createNotification();

    // Common logic (template)
    public void send() {
        Notification nf = createNotification();
        nf.notifyUser();
    }
}
