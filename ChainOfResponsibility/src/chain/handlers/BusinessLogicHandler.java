package chain.handlers;

import chain.BaseHandler;
import client.Request;

public class BusinessLogicHandler extends BaseHandler {

	@Override
	public void handle(Request request) {
	    System.out.println("BusinessLogicHandler: 🚀 Processing request...");
	}

}
