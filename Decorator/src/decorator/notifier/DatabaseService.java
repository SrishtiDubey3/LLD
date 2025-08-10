package decorator.notifier;

public class DatabaseService {
	public String getMailFromUsername(String username) {
        return username + "@mail.com";
    }

    public String getPhoneNbrFromUsername(String username) {
        return "+1234567890";
    }

    public String getFacebookNameFromUsername(String username) {
        return username + "_fb";
    }
}
