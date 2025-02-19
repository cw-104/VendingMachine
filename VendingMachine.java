// Jason Jackson
// Vending Machine Project
// Int Version Ctrl
// 2/12/2025

//Features Set 1:Ryan 
/*
 * Large Variety of Snacks
 * Price associated with each snack
 * User given welcome msg, and given usage instructions
 * User can select which snack to buy
 */

//Features Set 2: Jason 
/*
 * User can insert as much money as they want, can only be $1 bills DONE
 Exact change is needed if they insert too much, give after purchase is made DONE
 Ask for transaction confirmation, if canceled give full refund DONE
 Give user departure method after transaction is either completed or canceled and refund is given. DONE?
 */

import java.util.Scanner;

public class VendingMachine {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double wallet = 0.0;
        double balance = 0.0;
        double requiredBalance = 0.0;
        boolean validChoice = false;

        System.out.println(
                "Welcome! To start, select your choice of snack. After that, insert the amount of money needed to purchase the item.");

        // using this mainly for refunding just to show something happening
        System.out.println("How much money is in your wallet?");
        wallet = scanner.nextDouble();
        scanner.nextLine(); // consume new line so choice can actually be typed
        System.out.println(""); // spacing

        String choice = " ";

        while (!validChoice) {
            System.out.println("Available Snacks:");
            System.out.println("Doritos ($1.50)");
            System.out.println("Ruffles ($1.50)");
            System.out.println("Lays ($1.50)");
            System.out.println("Reese's Buttercup ($1.00)");
            System.out.println("Snicker's Bar ($1.00)");
            System.out.println("Chips Ahoy ($1.00)");
            System.out.println("M&Ms ($1.00)");
            System.out.println("Pop-Tarts ($1.50)");
            System.out.println("Sour Patch ($1.50)");
            System.out.println("Kit-Kat ($1.00)");
            System.out.println("Twix ($1.00)");

            System.out.println("");

            System.out.println("Enter choice");

            System.out.println("");

            choice = scanner.nextLine();

            System.out.println("");

            switch (choice.trim().toLowerCase()) {
                case "doritos":
                    System.out.println("You selected Doritos. That will be $1.50.");
                    requiredBalance = 1.50;
                    validChoice = true;
                    break;
                case "ruffles":
                    System.out.println("You selected Ruffles. That will be $1.50.");
                    requiredBalance = 1.50;
                    validChoice = true;
                    break;
                case "lays":
                    System.out.println("You selected Lays. That will be $1.50.");
                    requiredBalance = 1.50;
                    validChoice = true;
                    break;
                case "reese's buttercup":
                    System.out.println("You selected Reese's Buttercup. That will be $1.00.");
                    requiredBalance = 1.00;
                    validChoice = true;
                    break;
                case "snicker's bar":
                    System.out.println("You selected Snicker's Bar. That will be $1.00.");
                    requiredBalance = 1.00;
                    validChoice = true;
                    break;
                case "chips ahoy":
                    System.out.println("You selected Chips Ahoy. That will be $1.00.");
                    requiredBalance = 1.00;
                    validChoice = true;
                    break;
                case "m&ms":
                    System.out.println("You selected M&Ms. That will be $1.00.");
                    requiredBalance = 1.00;
                    validChoice = true;
                    break;
                case "pop-tarts":
                    System.out.println("You selected Pop-Tarts. That will be $1.50.");
                    requiredBalance = 1.50;
                    validChoice = true;
                    break;
                case "sour patch":
                    System.out.println("You selected Sour Patch . That will be $1.50.");
                    requiredBalance = 1.50;
                    validChoice = true;
                    break;
                case "kit-kat":
                    System.out.println("You selected Kit-Kat. That will be $1.00.");
                    requiredBalance = 1.00;
                    validChoice = true;
                    break;
                case "twix":
                    System.out.println("You selected Twix. That will be $1.00.");
                    requiredBalance = 1.00;
                    validChoice = true;
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
                    System.out.println("");
            }
        }

        // Cash Insertion System
        System.out.println(""); // spacing
        System.out.println("The required payment is: $" + requiredBalance);

        while (true) {
            System.out.println("You have $" + wallet + " in your wallet.");
            System.out.println("Your current balance is: $" + balance);
            System.out.println(""); // spacing

            if (wallet > 1.0) {
                System.out.println("Please insert $1. (Press ENTER)");
                System.out.println("Once finished adding funds, type 'done'.");
                String cash = scanner.nextLine().trim().toLowerCase();

                if (cash.equals("done")) {
                    break;
                }

                balance += 1.0;
                wallet -= 1.0;
            } else {
                System.out.println("You have less than $1 in your wallet.");
                if (wallet < 0.0) {
                    wallet = 0.0;
                    // cannot have -money in your wallet, shouldn't happen but just in case
                }
                break;
            }

        }

        // Transaction Verification and Refund System
        System.out.println("");
        System.out.println("Are you sure you want to purchase: " + choice + " (Y/N)");

        boolean tLoopCtrl = false;
        while (!tLoopCtrl) {
            String answer = scanner.nextLine().trim().toLowerCase();
            switch (answer) {
                case "y":
                    System.out.println("Authorizing transaction...");
                    balance -= requiredBalance;
                    System.out.println("Dispensing " + choice + "...");
                    System.out.println("Transaction complete, dispensing any change: $" + balance);
                    wallet += balance;
                    System.out.println("You have $" + wallet + " in your wallet.");
                    System.out.println("Operations complete, have a nice day!");
                    tLoopCtrl = true;
                    break;
                case "n":
                    System.out.println("Transaction canceled, issuing refund...");
                    System.out.println("Refunding: $" + balance);
                    wallet += balance;
                    System.out.println("Refund complete.");
                    System.out.println("You have $" + wallet + " in your wallet.");
                    System.out.println("Operations complete, have a nice day!");
                    tLoopCtrl = true;
                    break;
                default:
                    System.out.println("Invalid answer, please enter Y or N.");

            }

        }
        scanner.close();
    }

}