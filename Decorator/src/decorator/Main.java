package decorator;

import decorator.decorator.FacebookDecorator;
import decorator.decorator.WhatsAppDecorator;
import decorator.notifier.INotifier;
import decorator.notifier.Notifier;

public class Main {

	public static void main(String[] args) {
		INotifier notifier = new FacebookDecorator(
                new WhatsAppDecorator(
                    new Notifier("Geekific")
                )
             );

		notifier.send("Like and Subscribe!!!");

	}

}
