package eCommercePlatform;
abstract class Payment implements PaymentProcessor{
	double amount;
	double discountRate;
	double actualAmount;
	abstract void calculateDiscount();
	abstract void calculateDiscount(double additionalDiscountRate);
	public Payment(double amount, double discountRate) {
		this.amount = amount;
		this.discountRate = discountRate;
	}
	
}
