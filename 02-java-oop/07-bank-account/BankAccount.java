import java.util.Random;

public class BankAccount {
    private double checkingBalance;
    private double savingBalance;
    private String acctNumber;
    private static int numberOfAccts = 0;
    protected static double total = 0;

    public BankAccount(){
        this.acctNumber =  BankAccount.newAcctNumber();
        this.checkingBalance = 0;
        this.savingBalance = 0;
        numberOfAccts ++;
    }
    private String newAcctNumber(){
        String accountNumber = "";
        Random r = new Random();
        for(int i=0; i<10; i++) {
            acctNumber = acctNumber.concat(String.valuseOf(r.nextInt(10)));
        }
        return acctNumber;
    }

    //Methods
    public void deposit(double amount, String acctType){
        if (acctType.equals("Checking")) {
            this.setCheckingBalance(this.getCheckingBalance() + amount);
            total += amount;
        } else if (acctType.equals("Savings")){
            this.setSavingingBalance(this.getSavingBalance() + amount);
            total += amount;
        }else{
            System.out.println("Invalid account type!");
            return;
        }
    }
    public void withdraw(double amount, String acctType){
        if (acctType.equals("Checking")) {
            if (this.getCheckingBalance - amount < 0) {
                System.out.println("Insufficent Funds!");
            } else {
            this.setCheckingBalance(this.getCheckingBalance() - amount);
            total -= amount;
            }
        } else if (acctType.equals("Savings")){
            if (this.savingBalance - amount < 0) {
                System.out.println("Insufficent Funds!");
            } else {
            this.setSavingingBalance(this.getSavingBalance() - amount);
            total -= amount;
            }
        }else{
            System.out.println("Invalid account type!");
            return;
        }
    }
    public static void displayBalance(){
        System.out.println(String.format("Savings: %.2f, Checking: %.2f", this.savingBalance, this.checkingBalance));
    }
    public String getAcctNumber(){
        return acctNumber;
    } 
    public void setAcctNumber(String acctNumber){
        this.acctNumber = acctNumber;
    }
    public double getCheckingBalance(){
        return this.checkingBalance;
    }
    public void setCheckingBalance(double checkingBalance){
        this.checkingBalance = checkingBalance;
    }
    public double getSavingBalance(){
        return this.savingBalance;
    }
    public void setSavingBalance(double savingBalance){
        this.savingBalance = savingBalance;
    }
    public static int getNumberofAccts(){
        return numberOfAccts;
    }
}    