package adapter.payment;

public class StripeAPI {
	
	// Incompatible interface
	public void makePayment(double money) {
        System.out.println("Processing Stripe payment of " + money + " rupees.");
    }
	
}
