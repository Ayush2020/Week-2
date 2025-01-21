class BankAccount{
    static String bankName = "Maghdha Bank ";
    static int totalAccounts = 0;

    final int accountNumber;
    String accountHolderName;
    double balance;

    public BankAccount(String accountHolderName, int accountNumber, double balance){
        this.accountHolderName = accountHolderName;
        this.accountNumber = accountNumber;
        this.balance = balance;
        totalAccounts++;
    }

    public static void getTotalAccountd(){
        System.out.println("Totsl Number of Accountd: " + totalAccounts);
    }

    public void displayAccountDetails(){
        if (this instanceof BankAccount){
            System.out.println("Bank Name : " + bankName);
            System.out.println("Account Holder : " + accountHolderName);
            System.out.println("Account Number : " + accountNumber);
            System.out.println("balance : $ " + balance);
        }
    }
}

 public class BankAccountManagement{
    public static void main(String[] args) {
        BankAccount account1 = new BankAccount("Tony Stark ", 1943562904,100000.00);
        BankAccount account2 = new BankAccount("Bruce Banner", 187453672, 3000000.00);
        account1.displayAccountDetails();
        System.out.println();class BankAccount{
    static String bankName = "Maghdha Bank ";
    static int totalAccounts = 0;

    final int accountNumber;
    String accountHolderName;
    double balance;

    //Constructor to intialize Account Details
    public BankAccount(String accountHolderName, int accountNumber, double balance){
        this.accountHolderName = accountHolderName;
        this.accountNumber = accountNumber; //Final Variable can only be set once
        this.balance = balance;
        totalAccounts++; // Increment the static totalAccounts counter
    }
    //Static method to get the total number of accounts
    public static void getTotalAccountd(){
        System.out.println("Totsl Number of Accountd: " + totalAccounts);
    }
    //Instance Method to display the account details
    public void displayAccountDetails(){
        if (this instanceof BankAccount){
            System.out.println("Bank Name : " + bankName);
            System.out.println("Account Holder : " + accountHolderName);
            System.out.println("Account Number : " + accountNumber);
            System.out.println("balance : $ " + balance);
        }
    }
}

public class BankAccountManagement{
    public static void main(String[] args) {
        BankAccount account1 = new BankAccount("Tony Stark ", 1943562904,100000.00);
        BankAccount account2 = new BankAccount("Bruce Banner", 187453672, 3000000.00);
        account1.displayAccountDetails();
        System.out.println();
        account2.displayAccountDetails();

        BankAccount.getTotalAccountd();
    }
}
        account2.displayAccountDetails();

        BankAccount.getTotalAccountd();
    }
}