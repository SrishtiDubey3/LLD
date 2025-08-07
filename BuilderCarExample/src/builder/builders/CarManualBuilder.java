package builder.builders;

import builder.cars.*;
import builder.components.*;


public class CarManualBuilder implements Builder {

	 private CarType type;
	    private int seats;
	    private Engine engine;
	    private Transmission transmission;
	    private TripComputer tripComputer;
	    private GPS gpsNavigator;

	    public void setCarType(CarType type) {
	        this.type = type;
	    }

	    public void setSeats(int seats) {
	        this.seats = seats;
	    }

	    public void setEngine(Engine engine) {
	        this.engine = engine;
	    }

	    public void setTransmission(Transmission transmission) {
	        this.transmission = transmission;
	    }

	    public void setTripComputer(TripComputer tripComputer) {
	        this.tripComputer = tripComputer;
	    }

	    public void setGPSNavigator(GPS gpsNavigator) {
	        this.gpsNavigator = gpsNavigator;
	    }

	    public Manual getResult() {
	        return new Manual(type, seats, engine, transmission, tripComputer, gpsNavigator);
	    }
	    
}
