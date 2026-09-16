package Statements;

import java.util.Scanner;
public class BankApplication {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int balance = 10000;

        System.out.println("1. Check balance");
        System.out.println("2. Deposit balance");
        System.out.println("3. Withdraw balance");
        System.out.println("4. Exit");

        System.out.print("Enter your choice: ");
        int choice = sc.nextInt();

        switch (choice) {
            case 1:
                System.out.println("Total balance = " + balance);
                break;

            case 2:
                System.out.print("Enter amount to deposit: ");
                int deposit = sc.nextInt();
                balance = balance + deposit;
                System.out.println("Deposit successfully!");
                System.out.println("Total balance = " + balance);
                break;

            case 3:
                System.out.print("Enter amount to withdraw: ");
                int withdraw = sc.nextInt();

                if (withdraw <= balance) {
                    balance = balance - withdraw;
                    System.out.println("Please collect cash.");
                    System.out.println("Remaining balance = " + balance);
                } else {
                    System.out.println("Insufficient balance! Current balance: " + balance);
                }
                break;

            case 4:
                System.out.println("Thank you for using our service!");
                break;

            default:
                System.out.println("Invalid choice!");
        }

        sc.close();
    }
}
