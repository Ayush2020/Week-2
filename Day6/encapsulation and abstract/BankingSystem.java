interface Loanable {
    void applyForLoan(double loanAmount);
    double calculateLoanEligibility();
}


abstract class BankAccount {
    private String accountNumber;
    private String holderName;
    private double balance;

    // Constructor
    public BankAccount(String accountNumber, String holderName, double balance) {
        this.accountNumber = accountNumber;
        this.holderName = holderName;
        this.balance = balance;
    }

    // Concrete methods for deposit and withdrawal
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited: " + amount);
        } else {
            System.out.println("Invalid deposit amount.");
        }
    }

    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Withdrew: " + amount);
        } else {
            System.out.println("Invalid withdrawal amount or insufficient balance.");
        }
    }

    // Abstract method for calculating interest
    public abstract double calculateInterest();

    // Getters and setters for encapsulation
    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public String getHolderName() {
        return holderName;
    }

    public void setHolderName(String holderName) {
        this.holderName = holderName;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }
}


// SavingsAccount now implements Loanable
class SavingsAccount extends BankAccount implements Loanable {
    private static final double INTEREST_RATE = 0.04; // 4% interest

    public SavingsAccount(String accountNumber, String holderName, double balance) {
        super(accountNumber, holderName, balance);
    }

    @Override
    public double calculateInterest() {
        return getBalance() * INTEREST_RATE;
    }

    @Override
    public void applyForLoan(double loanAmount) {
        System.out.println("Applying for loan of: " + loanAmount);
    }

    @Override
    public double calculateLoanEligibility() {
        return getBalance() * 0.5; // Eligible for 50% of the balance
    }
}

// CurrentAccount now implements Loanable
class CurrentAccount extends BankAccount implements Loanable {
    private static final double INTEREST_RATE = 0.02; // 2% interest

    public CurrentAccount(String accountNumber, String holderName, double balance) {
        super(accountNumber, holderName, balance);
    }

    @Override
    public double calculateInterest() {
        return getBalance() * INTEREST_RATE;
    }

    @Override
    public void applyForLoan(double loanAmount) {
        System.out.println("Applying for loan of: " + loanAmount);
    }

    @Override
    public double calculateLoanEligibility() {
        return getBalance() * 0.3; // Eligible for 30% of the balance
    }
}

public class BankingSystem {

    // Method to display account details, calculate interest and loan eligibility
    public static void processAccount(BankAccount account) {
        System.out.println("Account Number: " + account.getAccountNumber());
        System.out.println("Account Holder: " + account.getHolderName());
        System.out.println("Balance: " + account.getBalance());

        // Calculate and print interest
        double interest = account.calculateInterest();
        System.out.println("Interest: " + interest);

        // If the account is loanable, process loan details
        if (account instanceof Loanable) {
            Loanable loanableAccount = (Loanable) account;
            double loanEligibility = loanableAccount.calculateLoanEligibility();
            System.out.println("Loan Eligibility: " + loanEligibility);
            loanableAccount.applyForLoan(loanEligibility);
        }

        System.out.println();
    }

    public static void main(String[] args) {
        // Creating account objects
        BankAccount savingsAccount = new SavingsAccount("SA123", "Alice", 5000);
        BankAccount currentAccount = new CurrentAccount("CA456", "Bob", 10000);

        // Processing the accounts
        processAccount(savingsAccount);
        processAccount(currentAccount);
    }
}

