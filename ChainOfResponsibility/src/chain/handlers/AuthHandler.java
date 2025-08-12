package chain.handlers;

import chain.BaseHandler;
import client.Request;

public class AuthHandler extends BaseHandler {

	 @Override
	    public void handle(Request request) {
	        if (request.isAuthenticated()) {
	            System.out.println("AuthHandler: Authenticated.");
	            forward(request);
	        } else {
	            System.out.println("AuthHandler: User not authenticated.");
	        }
	    }
	 
}
