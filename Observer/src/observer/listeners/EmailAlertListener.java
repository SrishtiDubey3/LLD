package observer.listeners;

import observer.EventListener;
import observer.EventType;

public class EmailAlertListener implements EventListener<String> {

	private final String email;

    public EmailAlertListener(String email) {
        this.email = email;
    }

    @Override
    public void update(EventType eventType, String data) {
        System.out.println("Email to " + email + ": " + eventType + " - " + data);
    }
    
}
