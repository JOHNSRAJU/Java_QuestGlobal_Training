package employee;
public class Manager extends Employee{

	Manager(String name, int baseSalary) {
		super(name, baseSalary);
	}

	@Override
	void calculateSalary() {
		double salary=this.baseSalary+0.10*this.baseSalary;
		System.out.println("Total Salary for Manager "+this.name+" :"+salary);
	}
}
