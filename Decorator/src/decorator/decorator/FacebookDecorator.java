package decorator.decorator;

import decorator.notifier.INotifier;

public class FacebookDecorator extends BaseNotifierDecorator {

	public FacebookDecorator(INotifier wrapped) {
		super(wrapped);
	}

	@Override
    public void send(String msg) {
        super.send(msg);
        String fbName = databaseService.getFacebookNameFromUsername(getUsername());
        System.out.println("Sending " + msg + " by Facebook to " + fbName);
    }
}
