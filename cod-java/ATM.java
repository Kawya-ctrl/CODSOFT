import java.util.Scanner;
class BankAccount {
    private double balance;
    public BankAccount(double initialBalance) {
        if (initialBalance >= 0) {
            this.balance = initialBalance;
        } 
        else {
            this.balance = 0;
        }
    }
    public double getBalance() {
        return balance;
    }
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.printf("Successfully deposited  %.2f\n. New balance: %.2f\n", amount, balance);
        } 
        else {
            System.out.println("Deposit amount must be positive.");
        }
    }
    public boolean withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.printf("Successfully withdrew %.2f. New balance: %.2f\n", amount, balance);
            return true;
        } 
        else if (amount > balance) {
            System.out.println("Insufficient funds for this withdrawal.");
            return false;
        }
         else {
            System.out.println("Withdrawal amount must be positive.");
            return false;
        }
    }
}
class ATM {
    private BankAccount account;
    public ATM(BankAccount account) {
        this.account = account;
    }
    public void displayMenu() {
        System.out.println("Welcome to the ATM!");
        System.out.println("1. Check Balance");
        System.out.println("2. Deposit Money");
        System.out.println("3. Withdraw Money");
        System.out.println("4. Exit");
        System.out.print("Choose an option: ");
    }
    public void checkBalance() {
        System.out.printf("Your balance is: %.2f\n", account.getBalance());
    }
    public void deposit() {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter amount to deposit: ");
        double amount = sc.nextDouble();
        account.deposit(amount);
    }
    public void withdraw() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter amount to withdraw: ");
        double amount = sc.nextDouble();
        account.withdraw(amount);
    }
}
public class ATM {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        BankAccount account = new BankAccount(10000.00); 
        ATM atm = new ATM(account);
        while (true) {
            atm.displayMenu();
            int option = sc.nextInt();
            switch (option) {
                case 1:
                    atm.checkBalance();
                    break;
                case 2:
                    atm.deposit();
                    break;
                case 3:
                    atm.withdraw();
                    break;
                case 4:
                    System.out.println("Thank you for using the ATM. Goodbye!");
                    sc.close();
                    return;
                default:
                    System.out.println("Invalid option. Please choose again.");
            }
        }
    }
}

