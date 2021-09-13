public class BalanceAccountTester {
    public static void main(String[] args) {
        BankAccount b = new BankAccount();
        b.deposit(100.00, "Checking");
        b.deposit(3.00, "Savings");
        b.displayBalance();

        System.out.println(BankAccount.total);

        b.withdraw(50.00, "Checking");
        b.withdraw(50.00, "Savings");
        b.displayBalance();

        System.out.println(BankAccount.total);
    }
}