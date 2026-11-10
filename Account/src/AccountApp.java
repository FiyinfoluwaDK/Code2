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

    public static int withdraw(int balance, int amount, int pin) {
        if (amount < 0) {
            System.out.println("Withdrawal amount cannot be negative");
        } else if (amount > balance) {
            System.out.println("Insufficient funds for withdrawal");
        } else if (pin < 1000 || pin > 9999) {
            System.out.println("Invalid PIN");
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


    public static void main(String[] args) {
        int balance = 1000;
        int pin = 1234;

        System.out.println("Current balance: " + checkBalance(balance));

        balance = deposit(balance, 500);
        System.out.println("Balance after deposit: " + balance);

        balance = withdraw(balance, 200, pin);
        System.out.println("Balance after withdrawal: " + balance);

        int toBalance = 500;
        transfer(balance, toBalance, 300, pin);

        makePin(5678);
    }
}
