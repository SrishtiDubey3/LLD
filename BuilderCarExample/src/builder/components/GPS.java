package builder.components;

public class GPS {
	
	private final String route;

    public GPS() {
        this.route = "221b Baker Street to Scotland Yard";
    }

    public GPS(String manualRoute) {
        this.route = manualRoute;
    }

    public String getRoute() {
        return route;
    }

}
