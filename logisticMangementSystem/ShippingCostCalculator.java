package logisticMangementSystem;
public class ShippingCostCalculator {
	double calculateShippingCost(double weight, double distance) {
		return weight*distance;
	}
	double calculateShippingCost(double weight, double distance, boolean priority) {
		if(priority) {
			return weight*distance+200;
		}
		return calculateShippingCost(weight, distance);
	}
	double calculateShippingCost(double weight, double distance, PackageType packageType) {
		return weight*distance+(weight*distance*packageType.getExtraRate());
	}
}
