import java.util.Scanner;

public class RestaurantMenu {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //food choice display1
        
        System.out.println("******************************Welcome to the Prince Darbar!******************");
        System.out.println("1. Burger");
        System.out.println("2. Pitza");
        System.out.println("3. Exit");
        
        System.out.print("Enter your choice: ");
        int choice = scanner.nextInt();
        //Bruger menu
        if (choice == 1) {
        //price list with flaovr
        double PaneerPrice = 40.00;
        double AaloPrice = 30.00;
        System.out.println("1. Paneer Tikka - $" + PaneerPrice);
        System.out.println("2. Aalo Tikka - $" + AaloPrice);
        System.out.print("Enter your flavour  choice: ");
        int ch = scanner.nextInt();
        //quantity
        int quantity;
        System.out.print("Enter quantity: ");
        quantity = scanner.nextInt();
        // total cost
        double totalCost = 0.0;
        if (ch == 1) {
            totalCost = PaneerPrice * quantity;
        } else if (ch == 2) {
            totalCost = AaloPrice * quantity;
        } else {
            System.out.println("Invalid choice!");
            System.exit(0);
        }
        //bill display
        System.out.println("\nBill:");
        System.out.println("Item: " + (ch == 1 ? "Paneer Tikka Burger" : "Aalo tikka Burger" ));
        System.out.println("Quantity: " + quantity);
        System.out.println("Total Cost: $" + totalCost);
        System.out.println("You've chosen Pizza. Enjoy your meal!");
        System.out.println("               PrinceDarbar@2023copyright        ");
        }
        //pitza
        else if (choice == 2)
        {
            //flavour choice display with price
        double PaneerPitzaPrice = 240.00;
        double CornPitzaPrice = 200.00;
        double OnionPitzaPrice = 180.00;
        System.out.println("1. Paneer  - $" + PaneerPitzaPrice);
        System.out.println("2. Corn - $" + CornPitzaPrice);
        System.out.println("2. Onion - $" + OnionPitzaPrice);
        System.out.print("Enter your flavour  choice: ");
        int ch1 = scanner.nextInt();
        //quantity
        int quantity1;
        System.out.print("Enter quantity: ");
        quantity1 = scanner.nextInt();
        // total cost
        double totalCost1 = 0.0;
        if (ch1 == 1) {
            totalCost1 = PaneerPitzaPrice * quantity1;
        } else if (ch1 == 2) {
            totalCost1 = CornPitzaPrice * quantity1;
        }
            else if (ch1 == 3) {
            totalCost1 = OnionPitzaPrice * quantity1;
        } else {
            System.out.println("Invalid choice!");
            System.exit(0);
        }
        //bill display
        System.out.println("\nBill:");
        System.out.println("Item: " + (ch1 == 1 ? "Paneer Pitza" : (ch1==2? "Corn Pitza":"OnionPitza")));
        System.out.println("Quantity: " + quantity1);
        System.out.println("Total Cost1: $" + totalCost1);
        System.out.println("You've chosen Pitza. Enjoy your meal!");
        System.out.println("                 PrinceDarbar@2023copyright     ");
        }
        //exit choice
        else if (choice == 3) {
            System.out.println("Thank you for visiting. Have a great day!");
            System.out.println("            PrinceDarbar@2023copyright         ");
        }
        // invaild choice
        else {
            System.out.println("Invalid choice. Please select a valid option.");
            System.out.println("            PrinceDarbar@2023copyright      ");
        }
        
        scanner.close();
    }
}