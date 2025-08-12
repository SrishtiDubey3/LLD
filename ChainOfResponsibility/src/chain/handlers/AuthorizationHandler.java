package chain.handlers;

import chain.BaseHandler;
import client.Request;

public class AuthorizationHandler extends BaseHandler {

	@Override
    public void handle(Request request) {
        if (request.isAuthorized()) {
            System.out.println("AuthorizationHandler: ✅ Authorized.");
            forward(request);
        } else {
            System.out.println("AuthorizationHandler: ❌ User not authorized.");
        }
    }
	
}
