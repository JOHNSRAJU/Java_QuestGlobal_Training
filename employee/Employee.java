package employee;
abstract class Employee {
	protected String name;
	protected int baseSalary;
	Employee(String name,int baseSalary){
		this.name=name;
		this.baseSalary=baseSalary;
	}
	abstract void calculateSalary();
	void getDetails(){
		System.out.println("Name - "+this.name);
		System.out.println("Base Salary - "+this.baseSalary);
	}
}
