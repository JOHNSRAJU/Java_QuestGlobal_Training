package foodDeliveryService;
import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		BillCalculator billCalculator = new BillCalculator();
		Scanner sc = new Scanner(System.in);
		Customer customer=null;
		System.out.println("Enter the amount ");
		int amount= sc.nextInt();
		System.out.println("Current bill without discount - "+billCalculator.calculateBill(amount));
		System.out.println("Enter the amount ");
		int discount= sc.nextInt();
		System.out.println("Current bill with simple discount - "+billCalculator.calculateBill(amount,discount));
		System.out.println("Enter the amount ");
		int customerType= sc.nextInt();
		switch(customerType) {
		case 1:
			customer=new RegularCustomer();
			break;
		case 2:
			customer = new PremiumCustomer();
			break;
		case 3:
			customer = new CorporateCustomer();
			break;
		default:
			System.out.println("Current bill with simple discount - "+billCalculator.calculateBill(amount,discount));
		}
		if(customer!=null) {
			System.out.println("Current bill with simple discount & customer type - "+billCalculator.calculateBill(amount,discount,customer));
		}
	}
}
