package observer.listeners;

import observer.EventListener;
import observer.EventType;

public class MobileAppListener implements EventListener<Double> {

	private final String appName;

    public MobileAppListener(String appName) {
        this.appName = appName;
    }

    @Override
    public void update(EventType eventType, Double data) {
        System.out.println(appName + " received " + eventType + " update: Stock price is now $" + data);
    }
    
}
