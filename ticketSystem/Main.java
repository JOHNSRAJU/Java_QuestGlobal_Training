package ticketSystem;
public class Main {
	public static void main(String[] args) {
		Ticket ticket = new Ticket();
		Movie twoD = new TwoD();
		Movie threeD = new ThreeD();
		Customer child = new ChildCustomer();
		Customer adult = new AdultCustomer();
		Customer senior = new SeniorCustomer();
		System.out.println("Cost without Discount of 2D - "+ticket.calculateTotalCost(6, twoD.getRate()));
		System.out.println("Cost without Discount of 3D - "+ticket.calculateTotalCost(6, threeD.getRate()));
		double child2DRate=twoD.getRate()-(twoD.getRate()*child.getDiscount());
		double child3DRate=threeD.getRate()-(threeD.getRate()*child.getDiscount());
		double adult2DRate=twoD.getRate()-(twoD.getRate()*adult.getDiscount());
		double adult3DRate=threeD.getRate()-(threeD.getRate()*adult.getDiscount());
		double senior2DRate=twoD.getRate()-(twoD.getRate()*senior.getDiscount());
		double senior3DRate=threeD.getRate()-(threeD.getRate()*senior.getDiscount());
		System.out.println("Cost without Discount of 2D - "+ticket.calculateTotalCost(3,child2DRate,2,adult2DRate,1,senior2DRate));
		System.out.println("Cost without Discount of 3D - "+ticket.calculateTotalCost(3,child3DRate,2,adult3DRate,1,senior3DRate));
		
		}
}
