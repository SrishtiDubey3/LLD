package client;

public class Request {

	private boolean authenticated;
    private boolean authorized;
    private boolean rateLimitOk;
    private boolean validData;

    public Request(boolean authenticated, boolean authorized, boolean rateLimitOk, boolean validData) {
        this.authenticated = authenticated;
        this.authorized = authorized;
        this.rateLimitOk = rateLimitOk;
        this.validData = validData;
    }

    public boolean isAuthenticated() { return authenticated; }
    public boolean isAuthorized() { return authorized; }
    public boolean isRateLimitOk() { return rateLimitOk; }
    public boolean isValidData() { return validData; }
    
}
