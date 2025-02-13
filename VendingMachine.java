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
 * User can insert as much money as they want, can only be $1 bills
 Exact change is needed if they insert too much, give after purchase is made
 Ask for transaction confirmation, if canceled give full refund
 Give user departure method after transaction is either completed or canceled and refund is given.
 */


import java.util.Scanner;

public class VendingMachine {



    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Available Snacks: \nChips ($1.50) \nChocolate ($1.00) \nCookies ($1.50) \nSoda ($2.00))");
        System.out.println("Enter choice");

        String choice = scanner.nextLine();

        switch (choice) {
            case "Chips" :
                System.out.println("You selected chips. That will be $1.50.");
                break;
            case "Chocolate" :
                System.out.println("You selected chocolate. That will be $1.00.");
                break;
            case "Cookies" :
                System.out.println("You selected cookies. That will be $1.50.");
                break;
            case "Soda" :
                System.out.println("You selected soda. That will be $2.00.");
                break;
            default:
                System.out.println("Invalid choice.");
        }






    }

}
