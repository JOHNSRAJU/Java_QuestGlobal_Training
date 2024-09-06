package VehicleRentalSystem;

public class Car extends Vehicle{
	boolean hasAirConditioner;
	public Car(String vehicleId, String brand, String model, double baseRent, boolean hasAirConditioner) {
		super(vehicleId, brand, model, baseRent);
		this.hasAirConditioner = hasAirConditioner;
	}

	public double calculateRent(int days) {
		double rent = days*super.baseRent*(hasAirConditioner?1.2:1.0);
		return rent;
		
	}
	
	

}
