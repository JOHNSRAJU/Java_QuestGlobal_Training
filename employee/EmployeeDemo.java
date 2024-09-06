package employee;
public class EmployeeDemo {
	public static void main(String[] args) {
		Manager manager = new Manager("Alan", 20000);
		Developer developer = new Developer("Johns", 10000);
		Intern intern = new Intern("Toms", 5000);
		manager.calculateSalary();
		manager.getDetails();
		developer.calculateSalary();
		developer.getDetails();
		intern.calculateSalary();
		intern.getDetails();
	}
}
