package chain.handlers;

import chain.BaseHandler;
import client.Request;

public class ValidationHandler extends BaseHandler {

	@Override
	public void handle(Request request) {
		
		if (request.isValidData()) {
            System.out.println("ValidationHandler: ✅ Payload valid.");
            forward(request);
        } else {
            System.out.println("ValidationHandler: ❌ Invalid payload.");
        }
        
	}

}
