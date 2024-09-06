package VehicleRentalSystem;
public class Truck extends Vehicle {
	int loadCapacity;
	public Truck(String vehicleId, String brand, String model, double baseRent, int loadCapacity) {
		super(vehicleId, brand, model, baseRent);
		this.loadCapacity = loadCapacity;
	}
	@Override
	public double calculateRent(int days) {
		double rent = days*super.baseRent*(loadCapacity>5?1.5:1.2);
		return rent;
	}
	
}
