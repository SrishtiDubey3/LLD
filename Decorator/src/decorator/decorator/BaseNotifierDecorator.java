package decorator.decorator;

import decorator.notifier.DatabaseService;
import decorator.notifier.INotifier;

public abstract class BaseNotifierDecorator implements INotifier {
	private final INotifier wrapped;
    protected final DatabaseService databaseService;

    public BaseNotifierDecorator(INotifier wrapped) {
        this.wrapped = wrapped;
        this.databaseService = new DatabaseService();
    }

    @Override
    public void send(String msg) {
        wrapped.send(msg);
    }

    @Override
    public String getUsername() {
        return wrapped.getUsername();
    }
}
