package employeeMangementSystem;
class PartTimeEmployee extends Employee{
	int hoursWorked;
	double hourlyRate;
	public double calculateSalary() {
		double salary = hoursWorked*hourlyRate;
		return salary;
	}
	public PartTimeEmployee(String employeeId, String name, double basicSalary, int hoursWorked, double hourlyRate) {
		super(employeeId, name, basicSalary);
		this.hoursWorked = hoursWorked;
		this.hourlyRate = hourlyRate;
	}
	
}
