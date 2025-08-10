package observer.publisher;

import observer.EventManager;
import observer.EventType;

// Publisher
public class StockExchange {

	public EventManager<Double> priceEvents = new EventManager<>(EventType.PRICE_CHANGE);
    public EventManager<String> newsEvents = new EventManager<>(EventType.DIVIDEND_ANNOUNCEMENT);

    // Updates the price and Notifies all subscribed price listeners.
    public void changePrice(double newPrice) {
        System.out.println("StockExchange: Price changed to $" + newPrice);
        priceEvents.notify(EventType.PRICE_CHANGE, newPrice);
    }
    
    // Announces a message and Notifies all subscribed news listeners.
    public void announceDividend(String message) {
        System.out.println("StockExchange: " + message);
        newsEvents.notify(EventType.DIVIDEND_ANNOUNCEMENT, message);
    }

}
