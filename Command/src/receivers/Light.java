package receivers;

public class Light {

	private boolean switchedOn = false;

    public void switchLights() {
        switchedOn = !switchedOn;
        System.out.println("Light is now " + (switchedOn ? "ON" : "OFF"));
    }
    
}
