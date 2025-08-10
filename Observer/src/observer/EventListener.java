package observer;

// A generic interface for all listeners/observers.
public interface EventListener<T> {

	// called by the 'publisher' when something changes
	void update(EventType eventType, T data);
	
}



// Generic <T>: means listeners can handle different kinds of data — e.g., Double for stock prices, String for news messages.