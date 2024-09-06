package bankAccount;
abstract class BankAccount {
	protected double accountNumber;
	protected double balance;
	BankAccount(long accountNumber, int balance){
		this.accountNumber=accountNumber;
		this.balance = balance;
	}
	abstract void calculateInterest();
	void deposit(double amount) {
		this.balance+=amount;
		System.out.println("New balance - "+this.balance);
	}
	void withdraw(double amount) {
		if(amount<=this.balance) {
			this.balance-=amount;
			System.out.println("New balance - "+this.balance);
		}
		else {
			System.out.println("Insufficient balance");
		}
	}
	
}
