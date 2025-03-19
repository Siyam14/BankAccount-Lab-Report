package Report;

public class SavingsAccount extends BankAccount {
	 private static final double INTEREST_RATE = 0.04;
	    private static final double MIN_BALANCE = 500;
	    private static final double PENALTY = 50;

	    public SavingsAccount(String accountNumber, String holderName, double balance) {
	        super(accountNumber, holderName, balance);
	    }

	    @Override
	    public void withdraw(double amount) {
	        if (balance - amount < MIN_BALANCE) {
	            System.out.println("Withdrawal denied! Minimum balance of $" + MIN_BALANCE + " required.");
	            balance -= PENALTY;
	            System.out.println("Penalty of $" + PENALTY + " applied.");
	        } else {
	            balance -= amount;
	            System.out.println("Withdrawn: $" + amount);
	        }
	        displayBalance();
	    }

	    @Override
	    public void calculateInterest() {
	        double interest = balance * INTEREST_RATE;
	        balance += interest;
	        System.out.println("Interest of $" + interest + " added.");
	        displayBalance();
	    }

}
