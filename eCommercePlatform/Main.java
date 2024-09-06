package eCommercePlatform;
public class Main {

	public static void main(String[] args) {
		Payment[] payment = new Payment[3];
		System.out.println("CreditCard object");
		payment[0]= new CreditCardPayment(5000, 0.07 ,0.03, 5);
		System.out.println("\nDebitCard object");
		payment[1]= new DebitCardPayment(5000, 0.06 ,0.04, 4);
		System.out.println("\nDigitalWallet object");
		payment[2]= new DigitalWalletPayment(5000, 0.05 ,0, 3);
		System.out.println("\n");
		for(Payment p:payment) {
			System.out.println(p.getClass().getSimpleName()+" - "+p.actualAmount);
		}
		
	}

}
