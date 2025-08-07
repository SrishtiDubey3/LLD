package builder.components;

import builder.cars.Car;

public class TripComputer {
	private Car car;

    public void setCar(Car car) {
        this.car = car;
    }

    public void showFuelLevel() {
        System.out.println("Fuel level: " + car.getFuel());
    }

    public void showStatus() {
        System.out.println(car.getEngine().isStarted() ? "Car is started" : "Car isn't started");
    }
}
