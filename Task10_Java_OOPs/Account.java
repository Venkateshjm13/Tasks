package task10_programs;

public class Account {
    private double balance; // Data member

    // Constructor with no arguments
    public Account() {
        balance = 0;  
    }

    // Constructor with balance as argument
    public Account(double initialBalance) {
        this.balance = initialBalance;
    }

    // Method to deposit balance
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposit successful. New balance: " + balance);
        } else {
            System.out.println("Invalid amount for deposit.");
        }
    }

    // Method to withdraw balance
    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawal successful. New balance: " + balance);
        } else {
            System.out.println("Insufficient funds or invalid amount for withdrawal.");
        }
    }

     
    public double getBalance() {
        return balance;
    }

     
    public static void main(String[] args) {
        
        Account account1 = new Account(); // No-argument constructor
        Account account2 = new Account(1000.0); // Constructor with initial balance

        
        account1.deposit(500);
        account1.withdraw(200);
        System.out.println("Account1 balance: " + account1.getBalance());

        account2.withdraw(1500);
        account2.deposit(2000);
        System.out.println("Account2 balance: " + account2.getBalance());
    }
}

