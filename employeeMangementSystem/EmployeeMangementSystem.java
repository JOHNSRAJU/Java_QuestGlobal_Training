package employeeMangementSystem;
public class EmployeeMangementSystem {
	public static void main(String[] args) {
//		FullTimeEmployee fullTimeEmployee = new FullTimeEmployee("F001", "Johns", 5000, 2000);
//		PartTimeEmployee partTimeEmployee = new PartTimeEmployee("P002", "Toms", 5000, 8, 2000);
//		Contractor contractor = new Contractor("C003", "Alan", 2500);
//		Payable[] payableList = {fullTimeEmployee,partTimeEmployee,contractor};
		Payable[] payableList = {new FullTimeEmployee("F001", "Johns", 5000, 2000),new PartTimeEmployee("P002", "Toms", 5000, 8, 2000),new Contractor("C003", "Alan", 2500)};
		for(Payable i : payableList) {
			i.calculateSalary();
			i.displayDetails();
		}
	}

}
