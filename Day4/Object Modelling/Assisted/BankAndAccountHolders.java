import java.util.ArrayList;

class BankAccount {
    private String accountNumber;
    private double balance;

    //Constructor for account number and balance
    public BankAccount(String accountNumber, double initialBalance){
        this.accountNumber = accountNumber;
        this.balance = initialBalance;
    }

    //getter
    public double getBalance(){
        return balance;
    }
    public void deposit(double amount){
        if (amount <= balance){
            balance -= amount;
        }else {
            System.out.println("Insufficient");
        }
    }

    //getter
    public String getAccountNumber(){
        return accountNumber;
    }
}

class Customer{
    private String name;
    private String customerId;
    //Association
    private ArrayList<BankAccount> accounts;

    //Constructor
    public Customer(String name, String customerId){
        this.name = name;
        this.customerId = customerId;
        this.accounts = new ArrayList<>();
    }

    public void openAccount(BankAccount account){
        accounts.add(account);
    }

    //Method to open a new account
    public void viewBalance(){
        System.out.println("Customer : " + name + " ID " + customerId);
        for (BankAccount account : accounts){
            System.out.println("Account Number : " + account.getAccountNumber() + "balance" + account.getBalance());
        }
    }
}

class Bank{
    private String bankName;
    private ArrayList<Customer> customers;

    //Constructors
     public Bank(String bankName){
         this.bankName = bankName;
         this.customers = new ArrayList<>();
     }

     public void addCustomer(Customer customer){
         customers.add(customer);
     }

     public void openAccount(Customer customer, BankAccount account){
         customer.openAccount(account);
     }
     //method to display
     public void displaybankDetails(){
         System.out.println("Bank: " + bankName);
         System.out.println("Customer of the Bank ");
         for (Customer customer : customers){
             customer.viewBalance();;
         }
     }
}

public class BankAndAccountHolders{
    public static void main(String[] args) {
        //Create Bank object
        Bank bank = new Bank("Magdha Bank");

        //Create customers
        Customer customer1 = new Customer("Lucky", "1231B12");
        Customer customer2 = new Customer("Rajeev Sheikh", "124RF54");

        //Add Customers to the bank
        bank.addCustomer(customer1);
        bank.addCustomer(customer2);

        //open bank Accounts
        BankAccount account1 = new BankAccount("A001", 5000);
        BankAccount account2 = new BankAccount("A002", 3000);
        BankAccount account3 = new BankAccount("B001", 10000);

        bank.openAccount(customer1, account1);
        bank.openAccount(customer1, account2);
        bank.openAccount(customer2, account3);

        //Display
        bank.displaybankDetails();
    }
}