import java.util.*;
public class Program_110 {
    static Scanner sc = new Scanner(System.in);
    static ArrayList<Account> bank = new ArrayList<>();
    public static void main(String[] args) {
        int choice;
        do {
            System.out.println("\n===== Bank Account System =====");
            System.out.println("1. Create Account");
            System.out.println("2. Deposit Money");
            System.out.println("3. Withdraw Money");
            System.out.println("4. Check Balance / Display Accounts");
            System.out.println("5. Close Account");
            System.out.println("6. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();
            switch (choice) {
                case 1:
                    createAccount();
                    break;
                case 2:
                    deposit();
                    break;
                case 3:
                    withdraw();
                    break;
                case 4:
                    displayAccounts();
                    break;
                case 5:
                    closeAccount();
                    break;
                case 6:
                    System.out.println("Thank you for banking with us!");
                    break;
                default:
                    System.out.println("Invalid choice.");
            }
        } while (choice != 6);
        sc.close();
    }
    static void createAccount() {
        System.out.print("Enter Account Number: ");
        int accNo = sc.nextInt();
        sc.nextLine();
        System.out.print("Enter Account Holder Name: ");
        String holderName = sc.nextLine();
        System.out.print("Enter Initial Balance: ");
        double balance = sc.nextDouble();
        bank.add(new Account(accNo, holderName, balance));
        System.out.println("Account created successfully.");
    }
    static void deposit() {
        System.out.print("Enter Account Number: ");
        int accNo = sc.nextInt();
        Account acc = findAccount(accNo);
        if (acc != null) {
            System.out.print("Enter Deposit Amount: ");
            double amount = sc.nextDouble();
            acc.deposit(amount);
        } else {
            System.out.println("Account not found.");
        }
    }
    static void withdraw() {
        System.out.print("Enter Account Number: ");
        int accNo = sc.nextInt();
        Account acc = findAccount(accNo);
        if (acc != null) {
            System.out.print("Enter Withdrawal Amount: ");
            double amount = sc.nextDouble();
            acc.withdraw(amount);
        } else {
            System.out.println("Account not found.");
        }
    }
    static void displayAccounts() {
        if (bank.isEmpty()) {
            System.out.println("No active bank accounts found.");
        } else {
            System.out.println("\nActive Bank Accounts:");
            for (Account a : bank) {
                a.display();
            }
        }
    }
    static void closeAccount() {
        System.out.print("Enter Account Number to close: ");
        int accNo = sc.nextInt();
        boolean removed = false;
        for (int i = 0; i < bank.size(); i++) {
            if (bank.get(i).accNo == accNo) {
                bank.remove(i);
                removed = true;
                break;
            }
        }
        if (removed) {
            System.out.println("Account closed successfully.");
        } else {
            System.out.println("Account not found.");
        }
    }
    static Account findAccount(int accNo) {
        for (Account a : bank) {
            if (a.accNo == accNo) {
                return a;
            }
        }
        return null;
    }
    static class Account {
        int accNo;
        String holderName;
        double balance;
        Account(int accNo, String holderName, double balance) {
            this.accNo = accNo;
            this.holderName = holderName;
            this.balance = balance;
        }
        void deposit(double amount) {
            if (amount > 0) {
                balance += amount;
                System.out.println("Successfully deposited. New Balance: " + balance);
            } else {
                System.out.println("Invalid deposit amount.");
            }
        }
        void withdraw(double amount) {
            if (amount > 0 && amount <= balance) {
                balance -= amount;
                System.out.println("Successfully withdrawn. Remaining Balance: " + balance);
            } else {
                System.out.println("Invalid amount or insufficient balance.");
            }
        }
        void display() {
            System.out.println("---------------------------------");
            System.out.println("Account Number : " + accNo);
            System.out.println("Holder Name    : " + holderName);
            System.out.println("Balance        : " + balance);
        }
    }
}