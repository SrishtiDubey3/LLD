package client;

import commands.SwitchLightsCommand;
import invokers.Room;
import receivers.Light;

public class Main {

	public static void main(String[] args) {
		
		Room livingRoom = new Room();
        Light light = new Light();

        livingRoom.setCommand(new SwitchLightsCommand(light));
        livingRoom.executeCommand(); // Turns ON
        livingRoom.executeCommand(); // Turns OFF

	}

}
