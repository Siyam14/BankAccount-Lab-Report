package Report;

public class FixedDepositAccount extends BankAccount {
	private static final double INTEREST_RATE = 0.06;
    private int years;

    public FixedDepositAccount(String accountNumber, String holderName, double balance, int years) {
        super(accountNumber, holderName, balance);
        this.years = years;
    }

    @Override
    public void withdraw(double amount) {
        if (years < 1) {
            System.out.println("Withdrawal denied! Fixed Deposit must mature for at least 1 year.");
        } else if (amount > balance) {
            System.out.println("Withdrawal denied! Insufficient balance.");
        } else {
            balance -= amount;
            System.out.println("Withdrawn: $" + amount);
        }
        displayBalance();
    }
        @Override
        public void calculateInterest() {
            if (years >= 1) {
                double interest = balance * INTEREST_RATE;
                balance += interest;
                System.out.println("Interest of $" + interest + " added.");
            } else {
                System.out.println("No interest earned before 1 year.");
            }
            displayBalance();
        }

}
