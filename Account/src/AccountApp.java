public class AccountApp {

    public static int checkBalance(int balance) {
        if (balance < 0) {
            System.out.println("Balance cannot be negative");
        }
        return balance;

    }

    public static int deposit(int balance, int amount) {
        if (amount < 0) {
            System.out.println("Deposit amount cannot be negative");
        } else {
            balance += amount;
        }
        return balance;
    }

    public static int withdraw(int balance, int amount) {
        if (amount < 0) {
            System.out.println("Withdrawal amount cannot be negative");
        } else if (amount > balance) {
            System.out.println("Insufficient funds");
        } else {
            balance -= amount;
        }
        return balance;
    }

    public static void transfer(int fromBalance, int toBalance, int amount, int pin) {
        if (amount < 0) {
            System.out.println("Transfer amount cannot be negative");
        } else if (amount > fromBalance) {
            System.out.println("Insufficient funds for transfer");
        } else if (pin < 1000 || pin > 9999) {
            System.out.println("Invalid PIN");
        } else {
            fromBalance -= amount;
            toBalance += amount;
            System.out.println("Transfer successful. New balances: From Account: " + fromBalance + ", To Account: " + toBalance);
        }
    }
    
    public static void makePin(int pin) {
        if (pin < 1000 || pin > 9999) {
            System.out.println("PIN must be a 4-digit number");
        } else {
            System.out.println("PIN set successfully");
        }
    }

    public static createAccount(int accountNumber, int pin) {
        if (accountNumber < 10000000 || accountNumber > 99999999) {
            System.out.println("Account number must be an 8-digit number");
        } else if (pin < 1000 || pin > 9999) {
            System.out.println("PIN must be a 4-digit number");
        } else {
            System.out.println("Account created successfully with Account Number: " + accountNumber);
        }
    }

    public static void main(String[] args) {
        int balance = 1000;
        System.out.println("Current balance: " + checkBalance(balance));
        balance = deposit(balance, 500);
        System.out.println("Balance after deposit: " + balance);
        balance = withdraw(balance, 200);
        System.out.println("Balance after withdrawal: " + balance);
    }

}
