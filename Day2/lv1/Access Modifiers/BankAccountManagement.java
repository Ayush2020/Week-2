class BankAccount{
    public int accountNumber;
    protected String accountHolder;
    private double balance;

    //Constructor
    public BankAccount(int  accountNumber, String accountHolder, double balance){
        this.accountNumber = accountNumber;
        this.accountHolder = accountHolder;
        this.balance = balance;
    }
    //getter setter
    public double getBalance(){
        return balance;
    }
    public void setBalance(double balance){
        this.balance = balance;
    }
}
class SavingAccount extends BankAccount{

    public SavingAccount(int accountNumber, String accountHolder, double balance) {
        super(accountNumber, accountHolder, balance);
    }
    public void displayDetails() {
        System.out.println("Account Number: " + accountNumber);  // Accessing public field 'accountNumber'
        System.out.println("Account Holder: " + accountHolder);  // Accessing protected field 'accountHolder'
        System.out.println("Balance: $" + getBalance());  // Accessing 'balance' via public method
    }
}
public class BankAccountManagement {
    public static void main(String[] args) {
        // Creating a SavingsAccount object
        SavingAccount savingsAccount = new SavingAccount(12367640, "Tony Stark", 1000000.00);

        savingsAccount.displayDetails();

        savingsAccount.setBalance(200000.00);
        // Displaying updated account details
        System.out.println("\nUpdated Account Details:");
        savingsAccount.displayDetails();
    }

}