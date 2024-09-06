package vehicleManagementSystem;
import java.util.Scanner;

import logisticMangementSystem.Express;
import logisticMangementSystem.International;
import logisticMangementSystem.PackageType;
import logisticMangementSystem.Standard;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Duration in days - ");
		int days=sc.nextInt();
		System.out.println("Is gps needed '1' for yes");
		int gpsInt=sc.nextInt();
		boolean gps=gpsInt==1?true:false;
		System.out.println("Is Child Seat needed '1' for yes");
		int childSeatInt=sc.nextInt();
		boolean childSeat=childSeatInt==1?true:false;
		System.out.println("Enter the Vehicle Type\n1. Car\n2. Bike\n3. Truck");
		int vehicleInt=sc.nextInt();
		Vehicle vehicle;
		switch(vehicleInt) {
			case 1:
				vehicle=new Car();
				break;
			case 2:
				vehicle=new Bike();
				break;
			case 3:
				vehicle=new Truck();
				break;
			default:
				vehicle=null;
		}
		RentalService rentalService = new RentalService();
		if(vehicle!=null) {
			System.out.println("Total rental cost - "+rentalService.calculateRentalService(days,100, gps, childSeat, vehicle));
		}
		else {
			System.out.println("Total rental cost - "+rentalService.calculateRentalService(days,100, gps, childSeat));
		}
	}
}
