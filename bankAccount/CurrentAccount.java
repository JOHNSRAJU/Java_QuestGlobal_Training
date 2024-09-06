package bankAccount;

public class CurrentAccount extends BankAccount {

	CurrentAccount(long accountNumber, int balance) {
		super(accountNumber, balance);
	}

	@Override
	void calculateInterest() {
		System.out.println("No interest for Current Account");
	}
	

}
