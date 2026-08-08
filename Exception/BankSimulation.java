package Exception;


class InsufficientFundsException extends Exception {
    public InsufficientFundsException(String message) {
        super(message);
    }
}

// BankAccount class handling withdrawal rules
class BankAccount {
    private double balance;

    public BankAccount(double initialBalance) {
        this.balance = initialBalance;
    }

    public double getBalance() {
        return balance;
    }

    // Explicitly declaring possible exceptions using 'throws'
    public void withdraw(double amount) throws InsufficientFundsException, IllegalArgumentException {
        if (amount < 0) {
            throw new IllegalArgumentException("Withdrawal amount cannot be negative.");
        }
        if (amount > balance) {
            throw new InsufficientFundsException("Insufficient funds. Requested: $" + amount + ", Available: $" + balance);
        }
        
        balance -= amount;
        System.out.println("Successfully withdrew: $" + amount);
    }
}

// Main class to demonstrate execution and exception handling
public class BankSimulation {
    public static void main(String[] args) {
        BankAccount account = new BankAccount(500.00);

        try {
            System.out.println("Current Balance: $" + account.getBalance());
            
            // Test Case 1: Overdrawing balance (Triggers InsufficientFundsException)
            //account.withdraw(650.00); 

            // Test Case 2: Negative amount (Triggers IllegalArgumentException)
             account.withdraw(-50.00);

            // Test Case 3: Valid withdrawal
            // account.withdraw(200.00);

        } catch (InsufficientFundsException e) {
            System.out.println("Error: " + e.getMessage());
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        } finally {
            // Always executes regardless of exceptions
            System.out.println("Final Account Balance: $" + account.getBalance());
        }
    }
}