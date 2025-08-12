package chain;

import client.Request;

public abstract class BaseHandler implements Handler {

	private Handler next;

    @Override
    public void setNext(Handler next) {
        this.next = next;
    }

    protected void forward(Request request) {
        if (next != null) {
            next.handle(request);
        }
    }

}
