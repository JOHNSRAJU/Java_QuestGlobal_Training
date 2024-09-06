package vehicleManagementSystem;
public class RentalService {
	double calculateRentalService(int days, double baseRent){
		return 	days*baseRent;
	}
	double calculateRentalService(int days, double baseRent,boolean gps, boolean childSeat){
		double cost=0;
		if(gps) {
			cost+=100;
		}
		if(childSeat) {
			cost+=200;
		}
		return days*baseRent+cost;
	}
	double calculateRentalService(int days, double baseRent,boolean gps, boolean childSeat, Vehicle vehicleType){
		double cost=0;
		if(gps) {
			cost+=100;
		}
		if(childSeat) {
			cost+=200;
		}
		return days*baseRent+cost+days*vehicleType.baseRentalRate();
	}
	
}
