package observer;

import java.util.*;
import java.util.concurrent.CopyOnWriteArrayList;

// Handles all registering, removing, and notifying observers
public class EventManager<T> {
	
	// Stores listeners for each event type
	private final Map<EventType, List<EventListener<T>>> listeners = new HashMap<>();

	// Prepares an empty listener list for each event type we want to support
	public EventManager(EventType... eventTypes) {
		for (EventType eventType : eventTypes) {
            listeners.put(eventType, new CopyOnWriteArrayList<>());   // CopyOnWriteArrayList : Thread-safe list for listeners (avoids problems if listeners are added/removed while notifying)
        }	
	}
	
	// Add a listener
	public void subscribe(EventType eventType, EventListener<T> listener) {
	    listeners.get(eventType).add(listener);
	}

	// Remove a listener
	public void unsubscribe(EventType eventType, EventListener<T> listener) {
	    listeners.get(eventType).remove(listener);
	}

	// Calls update(...) on all listeners for the event
	public void notify(EventType eventType, T data) {
	    for (EventListener<T> listener : listeners.get(eventType)) {
	        listener.update(eventType, data);
	    }
	}
}
