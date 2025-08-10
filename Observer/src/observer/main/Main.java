package observer.main;

import observer.EventType;
import observer.listeners.EmailAlertListener;
import observer.listeners.MobileAppListener;
import observer.publisher.StockExchange;

public class Main {

	public static void main(String[] args) {
		
		// Creates publisher
		StockExchange exchange = new StockExchange();

		// Creates listeners(2)
        MobileAppListener mobileApp = new MobileAppListener("StockTracker Pro");
        EmailAlertListener emailAlert = new EmailAlertListener("investor@example.com");

        // Subscription to respective events
        exchange.priceEvents.subscribe(EventType.PRICE_CHANGE, mobileApp);
        exchange.newsEvents.subscribe(EventType.DIVIDEND_ANNOUNCEMENT, emailAlert);

        // Simulation of events
        exchange.changePrice(150.75);
        exchange.announceDividend("NYAY announces $1.50 dividend per share!");

	}

}
