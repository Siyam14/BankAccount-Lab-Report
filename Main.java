package Report;

public class Main {

	public static void main(String[] args) {
		BankAccount savings = new SavingsAccount("SS123", "Shadman", 1000);
        BankAccount current = new CurrentAccount("CA456", "Siyam", 500);
        BankAccount fixedDeposit = new FixedDepositAccount("FD789", "Afifa", 5000, 1);

        System.out.println("\n--- Savings Account ---");
        savings.deposit(500);
        savings.withdraw(1100);
        savings.calculateInterest();

        System.out.println("\n--- Current Account ---");
        current.deposit(1000);
        current.withdraw(2500);
        current.calculateInterest();

        System.out.println("\n--- Fixed Deposit Account ---");
        fixedDeposit.calculateInterest();
        fixedDeposit.withdraw(2000);
	}

}
