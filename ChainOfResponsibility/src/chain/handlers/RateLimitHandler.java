package chain.handlers;

import chain.BaseHandler;
import client.Request;

public class RateLimitHandler extends BaseHandler {

	@Override
	public void handle(Request request) {

		if (request.isRateLimitOk()) {
            System.out.println("RateLimitHandler: ✅ Within rate limit.");
            forward(request);
        } else {
            System.out.println("RateLimitHandler: ❌ Rate limit exceeded.");
        }

	}

}
