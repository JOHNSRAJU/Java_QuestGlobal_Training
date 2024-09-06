package bankAccount;
public class SavingAccount extends BankAccount{

	SavingAccount(long accountNumber, int balance) {
		super(accountNumber, balance);
	}

	@Override
	void calculateInterest() {
		double interest = this.balance*0.04;
		System.out.println("Interest per annum = "+interest);
	}

}
