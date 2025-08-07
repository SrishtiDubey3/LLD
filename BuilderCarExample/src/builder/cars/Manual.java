package builder.cars;

import builder.components.*;

public class Manual {

	private final CarType carType;
    private final int seats;
    private final Engine engine;
    private final Transmission transmission;
    private final TripComputer tripComputer;
    private final GPS gpsNavigator;

    public Manual(CarType carType, int seats, Engine engine, Transmission transmission,
                  TripComputer tripComputer, GPS gpsNavigator) {
        this.carType = carType;
        this.seats = seats;
        this.engine = engine;
        this.transmission = transmission;
        this.tripComputer = tripComputer;
        this.gpsNavigator = gpsNavigator;
    }

    public String print() {
        return """
                Type of car: %s
                Count of seats: %d
                Engine: volume - %.1f; mileage - %.1f
                Transmission: %s
                Trip Computer: %s
                GPS Navigator: %s
                """.formatted(
                carType,
                seats,
                engine.getVolume(),
                engine.getMileage(),
                transmission,
                tripComputer != null ? "Functional" : "N/A",
                gpsNavigator != null ? "Functional" : "N/A"
        );
    }
    
}
