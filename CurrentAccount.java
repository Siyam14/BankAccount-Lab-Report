package Report;

public class CurrentAccount extends BankAccount {
	 private static final double OVERDRAFT_LIMIT = 2000;

	    public CurrentAccount(String accountNumber, String holderName, double balance) {
	        super(accountNumber, holderName, balance);
	    }

	    @Override
	    public void withdraw(double amount) {
	        if (balance - amount < -OVERDRAFT_LIMIT) {
	            System.out.println("Withdrawal denied! Overdraft limit of $" + OVERDRAFT_LIMIT + " exceeded.");
	        } else {
	            balance -= amount;
	            System.out.println("Withdrawn: $" + amount);
	        }
	        displayBalance();
	    }

	    @Override
	    public void calculateInterest() {
	        System.out.println("No interest provided for Current Accounts.");
	    }

}
