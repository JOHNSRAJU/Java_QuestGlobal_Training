package VehicleRentalSystem;

public class Bike extends Vehicle{
	int engineCapacity;
	public Bike(String vehicleId, String brand, String model, double baseRent, int engineCapacity) {
		super(vehicleId, brand, model, baseRent);
		this.engineCapacity = engineCapacity;
	}
	@Override
	public double calculateRent(int days) {
		double rent = days*super.baseRent*(engineCapacity>150?1.1:1.0);
		return rent;
	}
	
}
