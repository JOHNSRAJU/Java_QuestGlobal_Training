package employeeMangementSystem;
class FullTimeEmployee extends Employee{
	double bonus;
	public FullTimeEmployee(String employeeId, String name, double basicSalary, double bonus) {
		super(employeeId, name, basicSalary);
		this.bonus = bonus;
	}
	@Override
	public double calculateSalary() {
		double salary = super.basicSalary+this.bonus;
		return salary;
	}
}
