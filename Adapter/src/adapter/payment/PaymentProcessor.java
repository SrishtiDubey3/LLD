package adapter.payment;

public interface PaymentProcessor {

	//Existing Target Interface (what app expects)
	void pay(int amount);
}
