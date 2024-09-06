package employee;
public class Intern extends Employee {

	Intern(String name, int baseSalary) {
		super(name, baseSalary);
	}

	@Override
	void calculateSalary() {
		double salary=this.baseSalary;
		System.out.println("Total Salary for Intern "+this.name+" :"+salary);
	}
	
}
