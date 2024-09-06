package employeeMangementSystem;
public abstract class Employee implements Payable{
	String employeeId;
	String name;
	double basicSalary;
	public Employee(String employeeId, String name, double basicSalary) {
		this.employeeId = employeeId;
		this.name = name;
		this.basicSalary = basicSalary;
	}
	@Override
	public void displayDetails() {
		System.out.println("ID - "+this.employeeId);
		System.out.println("Name - "+this.name);
		
	}
	@Override
	public abstract double calculateSalary();


}
