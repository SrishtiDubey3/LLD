package adapter.payment;

/*
 
You’ve built an e-commerce application that processes payments through a standard interface -> PaymentProcessor.
Currently, it works with PayPal, but now a new client wants Stripe integration.
Stripe’s SDK has a different method signature, so instead of rewriting your payment logic, 
you adapt Stripe’s interface to your existing one.

 */

public class Main {

	public static void main(String[] args) {
		
		PaymentProcessor paypal = new PaypalPaymentProcessor();
        paypal.pay(50);

        PaymentProcessor stripeAdapter = new StripePaymentAdapter(new StripeAPI());
        stripeAdapter.pay(75);

	}

}
