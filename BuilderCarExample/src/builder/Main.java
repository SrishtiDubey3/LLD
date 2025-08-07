package builder;

import builder.builders.*;
import builder.cars.*;
import builder.director.Director;

public class Main {

	public static void main(String[] args) {

		Director director = new Director();

        // Build the car
        CarBuilder carBuilder = new CarBuilder();
        director.constructHyperCar(carBuilder);
        Car car = carBuilder.getResult();
        System.out.println("Car built:\n" + car.getCarType());

        // Build the manual
        CarManualBuilder manualBuilder = new CarManualBuilder();
        director.constructHyperCar(manualBuilder);
        Manual manual = manualBuilder.getResult();
        System.out.println("\nCar manual built:\n" + manual.print());

	}

}
