package employee;
public class Developer extends Employee{

	Developer(String name, int baseSalary) {
		super(name, baseSalary);
	}

	@Override
	void calculateSalary() {
		double salary=this.baseSalary+0.10*this.baseSalary;
		System.out.println("Total Salary for Developer "+this.name+" :"+salary);
	}
}
