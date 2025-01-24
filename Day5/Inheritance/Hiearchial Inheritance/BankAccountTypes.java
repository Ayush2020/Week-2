class BankAccount{
    int accountNumber;
    double balance;
    //Constructor
    public BankAccount(int accountNumber, double balance){
        this.accountNumber = accountNumber;
        this.balance = balance;
    }
    public String displayDetails(){
        return "Account Number: " + accountNumber + " Account balance : " + balance;
    }
}

class SavingsAccount extends BankAccount{
    double interestRate;
    public SavingsAccount(int accountNumber, double balance, double interestRate) {
        super(accountNumber, balance);
        this.interestRate = interestRate;
    }
    @Override
    public String displayDetails(){
         return super.displayDetails() + " Savinga Account INterest Rate: " + interestRate;
    }

    public void displayAccountType(){
        System.out.println("Account Type : Savings Account ");
    }
}

class CheckingAccount extends BankAccount{
    double withdrawalLimit;
    public CheckingAccount(int accountNumber, double balance, double withdrawalLimit) {
        super(accountNumber, balance);
        this.withdrawalLimit = withdrawalLimit;
    }
    @Override
    public String displayDetails() {
        return super.displayDetails() + ", Withdrawal Limit: " + withdrawalLimit;
    }

    public void displayAccountType() {
        System.out.println("Account Type: Checking Account");
    }
}

class FixedDepositAccount extends BankAccount {
    int depositTerm; // in months

    public FixedDepositAccount(int accountNumber, double balance, int depositTerm) {
        super(accountNumber, balance);
        this.depositTerm = depositTerm;
    }

    @Override
    public String displayDetails() {
        return super.displayDetails() + ", Deposit Term: " + depositTerm + " months";
    }

    public void displayAccountType() {
        System.out.println("Account Type: Fixed Deposit Account");
    }
}

public class BankAccountTypes{
    public static void main(String[] args) {
        // Create instances of different account types
        SavingsAccount savingsAccount =   new SavingsAccount(19026762, 100000.00,3.4);
        CheckingAccount checkingAccount = new CheckingAccount(12782782,102393.00,2.1);
        FixedDepositAccount fixedDepositAccount = new FixedDepositAccount(19283223,12000.00,670000);

        System.out.println(savingsAccount.displayDetails());
        savingsAccount.displayAccountType();

        System.out.println(checkingAccount.displayDetails());
        checkingAccount.displayAccountType();

        System.out.println(fixedDepositAccount.displayDetails());
        fixedDepositAccount.displayAccountType();
    }
}