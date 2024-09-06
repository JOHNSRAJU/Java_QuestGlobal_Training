package VehicleRentalSystem;
public class Main {
	public static void main(String[] args) {
		Rentable[] rentables = {new Car("C001", "BMW", "2023", 750, false),new Bike("B001", "Himalayan", "2022", 550, 125), new Truck("T003", "TATA", "2020", 1250, 6),new ElectricScooter("E004", "OLA", 20, 350)};
		for(Rentable rentable: rentables) {
			rentable.calculateRent(5);
			rentable.displayDetails();
		}
	}

}
