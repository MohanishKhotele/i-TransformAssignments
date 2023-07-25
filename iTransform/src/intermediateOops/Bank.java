package intermediateOops;

abstract class BankAccount {
	protected double balance;

	public BankAccount(double balance) {
		this.balance = balance;
	}

	public abstract double calculateTotalCashInBank();
}

class SavingAccount extends BankAccount {
	private double fixedDeposits;

	public SavingAccount(double balance, double fixedDeposits) {
		super(balance);
		this.fixedDeposits = fixedDeposits;
	}

	@Override
	public double calculateTotalCashInBank() {
		return balance + fixedDeposits;
	}
}

class CurrentAccount extends BankAccount {
	private double cashCredit;

	public CurrentAccount(double balance, double cashCredit) {
		super(balance);
		this.cashCredit = cashCredit;
	}

	@Override
	public double calculateTotalCashInBank() {
		return balance + cashCredit;
	}
}

public class Bank {
	public static void main(String[] args) {
		SavingAccount savingAccount = new SavingAccount(50000, 10000);
		CurrentAccount currentAccount = new CurrentAccount(70000, 20000);

		double totalCashInBank = getTotalCashInBank(savingAccount) + getTotalCashInBank(currentAccount);

		System.out.println("Total cash in the bank: " + totalCashInBank);
	}

	public static double getTotalCashInBank(BankAccount account) {
		return account.calculateTotalCashInBank();
	}
}
