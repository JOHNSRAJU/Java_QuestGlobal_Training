package bankAccount;
public class BankDemo {
	public static void main(String[] args) {
		SavingAccount savingAccount = new SavingAccount(427845, 1000);
		CurrentAccount currentAccount = new CurrentAccount(478468, 3000);
		savingAccount.calculateInterest();
		savingAccount.deposit(4000);
		savingAccount.withdraw(2000);
		currentAccount.calculateInterest();
		currentAccount.deposit(4000);
		currentAccount.withdraw(8000);
	}
}
