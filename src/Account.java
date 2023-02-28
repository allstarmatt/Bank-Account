package src;
import java.util.Scanner;
public class Account {
    int balance;
    int previousTransaction;
    String customerName;
    String customerID;

    Account(String cname,String cid) {
        customerName = cname;
        customerID = cid;
    }

    void deposit(int amount) {   //deposit function
        if(amount != 0) {
            balance = balance + amount;
            previousTransaction = amount;
        }
    }
    void withdraw(int amount) {   //withdraw function
        if (amount != 0 ){
            balance = balance - amount;
            previousTransaction = -amount;
        }
    }

    void getPreviousTransaction() {  //get previous transaction fucntion
        if (previousTransaction > 0) {
            System.out.println("You just deposited: " + previousTransaction + " into your account.");
        } else if (previousTransaction < 0) {
            System.out.println("You just withdrew: " + previousTransaction + " from your account");
        } else {
            System.out.println("There has been no change to your account!");
        }
    }
    void showMenu() {           //show menu function
        char option = '\0';
        Scanner scan = new Scanner(System.in);
        System.out.println("Welcome " + customerName + "!");
        System.out.println("Your ID is: " + customerID + ".");
        System.out.println("================================");
        System.out.println("What would you like to do?");
        System.out.println("================================");
        System.out.println("A. Check Your Balance");
        System.out.println("B. Make A Deposit");
        System.out.println("C. Make A Withdrawal");
        System.out.println("D. View Previous Transaction");
        System.out.println("E. Exit");

        do {
            System.out.println("================================");
            System.out.println("Enter an option: ");
            char option1 = scan.next().charAt(0);
            option = Character.toUpperCase(option1);
            System.out.println("================================");


            switch (option) {
                case 'A':
                    System.out.println("================================");
                    System.out.println("Balance: $" + balance);
                    System.out.println("================================");
                    break;

                case 'B':
                    System.out.println("Enter an amount to deposit: ");
                    int amount = scan.nextInt();
                    deposit(amount);
                    System.out.println("================================");
                    break;

                case 'C':
                    System.out.println("Enter an amount to withdraw: ");
                    int amount2 = scan.nextInt();
                    withdraw(amount2);
                    System.out.println("================================");
                    break;

                case 'D':
                    System.out.println("================================");
                    getPreviousTransaction();
                    System.out.println("================================");
                    break;

                case 'E':
                    System.out.println("================================");
                    break;

                default:
                    System.out.println("Error: Invalid option. Please select options A-D");
                    break;


            }

        } while (option != 'E');
        System.out.print("Thank you for banking with me :)");
    }



}
