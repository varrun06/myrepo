//Static variable
package Examples;

 
public class BankAccount {
    
    private static int numberOfAccounts = 0;

    
    private String accountNumber;
    private double balance;

    
    public BankAccount(String accountNumber, double initialBalance) {
        this.accountNumber = accountNumber;
        this.balance = initialBalance;
        numberOfAccounts++; 
    }

   
    public String getAccountNumber() {
        return accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    
    public static int getNumberOfAccounts() {
        return numberOfAccounts;
    }

    
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
        }
    }

    public void withdraw(double amount) {
        if (amount > 0 && balance >= amount) {
            balance -= amount;
        }
    }

    public void displayInfo() {
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Balance: $" + balance);
    }

    public static void main(String[] args) {
        
        BankAccount account1 = new BankAccount("12345", 1000.0);
        BankAccount account2 = new BankAccount("67890", 500.0);

        
        System.out.println("Account 1 Information:");
        account1.displayInfo();

        System.out.println("Account 2 Information:");
        account2.displayInfo();

        
        System.out.println("Total Number of Bank Accounts: " + BankAccount.getNumberOfAccounts());
    }
}

