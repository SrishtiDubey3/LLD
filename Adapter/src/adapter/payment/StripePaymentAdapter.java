package adapter.payment;

// Adapter class extending existing Interface
public class StripePaymentAdapter implements PaymentProcessor {
	
	// making object of StripeAPI class (incompatible interface)
	private StripeAPI stripeAPI;

	// Setter function
    public StripePaymentAdapter(StripeAPI stripeAPI) {
        this.stripeAPI = stripeAPI;
    }

    @Override
    public void pay(int amount) {
        // Convert int to double, adapt method call
        stripeAPI.makePayment((double) amount);
    }
    
}
