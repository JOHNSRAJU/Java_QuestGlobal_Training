package employeeMangementSystem;
public class Contractor implements Payable{
	String contractId;
	String name;
	double contractAmount;
	public double calculateSalary() {
		return this.contractAmount;
	}
	public void displayDetails() {
		System.out.println("Contract Id - "+this.contractId);
		System.out.println("Name - "+this.name);
		System.out.println("Contract Amount - "+this.contractAmount);
		
	}
	public Contractor(String contractId, String name, double contractAmount) {
		super();
		this.contractId = contractId;
		this.name = name;
		this.contractAmount = contractAmount;
	}
	
}
