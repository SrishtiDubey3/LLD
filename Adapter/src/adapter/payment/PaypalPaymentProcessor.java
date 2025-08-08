package adapter.payment;

public class PaypalPaymentProcessor implements PaymentProcessor {
	
	 @Override
	 	// Integrated Interface (already)
	    public void pay(int amount) {
	        System.out.println("Processing PayPal payment of " + amount + " rupees.");
	    }
	 
}
