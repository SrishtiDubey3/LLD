package chain;

import client.Request;

public interface Handler {
    void setNext(Handler next);
    void handle(Request request);
}
