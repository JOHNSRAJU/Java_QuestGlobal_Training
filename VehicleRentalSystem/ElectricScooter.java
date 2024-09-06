package VehicleRentalSystem;
public class ElectricScooter implements Rentable{
	String scooterId;
	String brand;
	int batteryCapacity;
	double baseRent;
	public ElectricScooter(String scooterId, String brand, int batteryCapacity, double baseRent) {
		this.scooterId = scooterId;
		this.brand = brand;
		this.batteryCapacity = batteryCapacity;
		this.baseRent = baseRent;
	}
	@Override
	public double calculateRent(int days) {
		double rent = days*this.baseRent*(batteryCapacity>20?1.3:1.0);
		return rent;
	}
	@Override
	public void displayDetails() {
		System.out.println("Scooter Id - "+this.scooterId);
		System.out.println("Brand - "+this.brand);
		System.out.println("Battery Capacity - "+this.batteryCapacity);
		System.out.println("Base Rent - "+this.baseRent);
	}
}
