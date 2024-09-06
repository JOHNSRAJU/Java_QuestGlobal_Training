package logisticMangementSystem;
import java.util.Scanner;
public class Main {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the weight");
		double weight=sc.nextDouble();
		System.out.println("Enter the distance in KM");
		double distance=sc.nextDouble();
		System.out.println("Enter the PackageType\n1.Standard\n2.Express\n3.International");
		int packageType=sc.nextInt();
		PackageType package1;
		switch(packageType) {
			case 1:
				package1=new Standard();
				break;
			case 2:
				package1=new Express();
				break;
			case 3:
				package1=new International();
				break;
			default:
				package1=null;
		}
		System.out.println("Need more priority then type '1'");
		int priorityInt=sc.nextInt();
		sc.close();
		boolean priority = priorityInt==1?true:false;
		
		ShippingCostCalculator calculator = new ShippingCostCalculator();
		if(package1!=null) {
			System.out.println(calculator.calculateShippingCost(weight, distance, package1));
		}
		else {
			System.out.println(calculator.calculateShippingCost(weight, distance, priority));;
		}
	}

}
