package client;

import chain.Handler;
import chain.handlers.*;

public class Main {

	public static void main(String[] args) {
		
		// Create handlers
        Handler auth = new AuthHandler();
        Handler authorization = new AuthorizationHandler();
        Handler rateLimit = new RateLimitHandler();
        Handler validation = new ValidationHandler();
        Handler businessLogic = new BusinessLogicHandler();

        // Assemble chain
        auth.setNext(authorization);
        authorization.setNext(rateLimit);
        rateLimit.setNext(validation);
        validation.setNext(businessLogic);

        // Valid request
        Request validRequest = new Request(true, true, true, true);
        System.out.println("--- Processing valid request ---");
        auth.handle(validRequest);

        // Invalid request (authentication fails)
        Request invalidRequest = new Request(false, true, true, true);
        System.out.println("\n--- Processing invalid request ---");
        auth.handle(invalidRequest);
        
	}

}
