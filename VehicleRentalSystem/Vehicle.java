package VehicleRentalSystem;
abstract class Vehicle implements Rentable{
	String vehicleId;
	String brand;
	String model;
	double baseRent;
	@Override
	abstract public double calculateRent(int days);
	@Override
	public void displayDetails() {
		System.out.println("Vehicle Id - "+this.vehicleId);
		System.out.println("Model - "+this.model);
		System.out.println("Brand - "+this.brand);
		System.out.println("Base Rent - "+this.baseRent);
		
	}
	public Vehicle(String vehicleId, String brand, String model, double baseRent) {
		this.vehicleId = vehicleId;
		this.brand = brand;
		this.model = model;
		this.baseRent = baseRent;
	}
}
