package foodDeliveryService;
public class BillCalculator {
	double calculateBill(double orderAmount) {
		return orderAmount;
	}
	double calculateBill(double orderAmount,double discount) {
		return orderAmount-orderAmount*discount;
	}
	double calculateBill(double orderAmount,double discount, Customer customerType) {
		return orderAmount-orderAmount*discount-orderAmount*customerType.getDiscountRate();
	}
}
