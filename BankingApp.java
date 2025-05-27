import java.util.Scanner;

class BankAccount {
    String name, accNo, contact, address;
    double balance, interestRate;

    void createAccount(Scanner sc) {
        System.out.print("Enter Name: ");
        name = sc.nextLine();
        System.out.print("Enter Account Number: ");
        accNo = sc.nextLine();
        System.out.print("Enter Initial Balance: ");
        balance = sc.nextDouble();
        System.out.print("Enter Interest Rate: ");
        interestRate = sc.nextDouble();
        sc.nextLine();
        System.out.print("Enter Contact Number: ");
        contact = sc.nextLine();
        System.out.print("Enter Address: ");
        address = sc.nextLine();
        System.out.println("Account Created Successfully!");
    }

    void deposit(Scanner sc) {
        System.out.print("Enter amount to deposit: ");
        double amount = sc.nextDouble();
        balance += amount;
        System.out.println("Amount deposited successfully.");
    }

    void withdraw(Scanner sc) {
        System.out.print("Enter amount to withdraw: ");
        double amount = sc.nextDouble();
        if (amount <= balance) {
            balance -= amount;
            System.out.println("Amount withdrawn successfully.");
        } else {
            System.out.println("Insufficient balance.");
        }
    }

    void computeInterest() {
        double interest = (balance * interestRate) / 100;
        System.out.println("Interest: " + interest);
    }

    void displayBalance() {
        System.out.println("Current Balance: " + balance);
    }
}

public class BankingApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        BankAccount account = new BankAccount();
        int choice;
        do {
            System.out.println("\n--- Banking Menu ---");
            System.out.println("1. Create Account");
            System.out.println("2. Deposit");
            System.out.println("3. Withdraw");
            System.out.println("4. Compute Interest");
            System.out.println("5. Display Balance");
            System.out.println("6. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {
                case 1 -> account.createAccount(sc);
                case 2 -> account.deposit(sc);
                case 3 -> account.withdraw(sc);
                case 4 -> account.computeInterest();
                case 5 -> account.displayBalance();
                case 6 -> System.out.println("Exiting...");
                default -> System.out.println("Invalid choice!");
            }
        } while (choice != 6);
    }
}

/* 1. private
 Accessible only within the same class.

 Used for data hiding.

 Good for security (like balance, password, etc

 2. public
 Accessible from anywhere (any class, any package).

 Used when you want to make something globally accessible

 3. protected
 Accessible:

 In the same package

 In subclasses (even in different packages) */



 