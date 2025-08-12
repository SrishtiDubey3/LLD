package payment.main;

import payment.PaymentService;
import payment.strategies.CreditCardPayment;
import payment.strategies.PayPalPayment;

public class Main {

	public static void main(String[] args) {
		
		PaymentService service = new PaymentService();

        // Pay using Credit Card
        service.setPaymentStrategy(new CreditCardPayment("1234-5678-9876-5432", "Srishti Dubey", "123"));
        service.checkout(2500.00);

        // Pay using PayPal
        service.setPaymentStrategy(new PayPalPayment("sid@example.com"));
        service.checkout(1500.50);


	}

}
