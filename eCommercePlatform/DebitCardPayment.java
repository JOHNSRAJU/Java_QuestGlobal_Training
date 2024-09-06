package eCommercePlatform;
class DebitCardPayment extends Payment{
	@Override
	public void processPayment(double amount) {
		actualAmount=super.actualAmount+amount;;
		System.out.println("processPayement() is executed");
	}

	@Override
	void calculateDiscount() {
		double discount = super.amount*super.discountRate;
		super.actualAmount=super.amount-discount;
		System.out.println("calculateDiscount() is executed");
	}


	@Override
	void calculateDiscount(double additionalDiscountRate) {
		double discount = super.amount*super.discountRate+super.amount*additionalDiscountRate;
		super.actualAmount=super.amount-discount;
		System.out.println("calculateDiscount(double additionalDiscountRate) is executed");
		
	}
	
	public DebitCardPayment(double amount, double discountRate, double additionalDiscount, double proceesingFee) {
		super(amount, discountRate);
		if(additionalDiscount>0) {
			calculateDiscount(additionalDiscount);
		}
		else {
			calculateDiscount();
		}
		processPayment(proceesingFee);
	}
}
