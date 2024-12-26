import java.util.Scanner;

public class GABASA_FINALS_PROJECT {

    // Menu with food items and prices
    static String[] foodItems = {"Pizza", "Burger", "Spaghetti", "Halo-Halo", "Coke"};
    static double[] foodPrices = {295.99, 58.99, 102.29, 89.99, 19.99};
    static String[] order = new String[10];  // Array to hold the ordered items
    static double[] orderPrices = new double[10];  // Array to hold the prices of ordered items
    static int orderCount = 0;  // Counter to track the number of items in the order

    // Display the menu
    public static void displayMenu() {
        System.out.println("====== WELCOME TO SPEEDEE SERVICE SYSTEM ======");
        System.out.println("\n=== Food Menu ===");
        for (int i = 0; i < foodItems.length; i++) {
            System.out.println((i + 1) + ". " + foodItems[i] + " - $" + foodPrices[i]);
        }
    }

    // Add a food item to the order
    public static void addItemToOrder(int choice) {
        if (orderCount < order.length) {
            order[orderCount] = foodItems[choice - 1];
            orderPrices[orderCount] = foodPrices[choice - 1];
            orderCount++;
            System.out.println(foodItems[choice - 1] + " has been added to your order.");
        } else {
            System.out.println("Your order is full! Can't add more items.");
        }
    }
    // Checkout and complete the order
    public static void checkout() {
        if (orderCount == 0) {
            System.out.println("You cannot checkout with an empty order.");
        } else {
            double totalPrice = 0;
            for (int i = 0; i < orderCount; i++) {
                totalPrice += orderPrices[i];
            }
            System.out.println("\n=== Checkout ===");
            System.out.println("Your total amount is: $" + totalPrice);
            System.out.print("Do you want to confirm your order? (yes/no): ");
            Scanner scanner = new Scanner(System.in);
            String confirm = scanner.nextLine();

            if (confirm.equalsIgnoreCase("yes")) {
                System.out.println("Thank you for your order! Your order has been confirmed.");
                 // Clear the order after checkout
            } else {
                System.out.println("Your order has been canceled.");
            }
            scanner.close();
        }
    }

    // Handle the user interaction
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice = 0;  // To store the user's menu choice
        boolean continueOrdering = true;  // Control the main loop

        while (continueOrdering) {
            // Display menu and get user's choice
            displayMenu();
            System.out.println("\n1. Add an item to your order");
            System.out.println("2. Checkout");
            System.out.println("3. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();

            // Handle the user's choice
            switch (choice) {
                case 1:  // Add an item to the order
                    System.out.print("Enter the item number to add to your order: ");
                    int itemChoice = scanner.nextInt();
                    if (itemChoice >= 1 && itemChoice <= foodItems.length) {
                        addItemToOrder(itemChoice);
                    } else {
                        System.out.println("Invalid item number. Please try again.");
                    }
                    break;

                case 2:  // Checkout
                    checkout();
                    break;

                case 3:  // Exit
                    System.out.println("Thank you for visiting! Goodbye.");
                    continueOrdering = false;  // Exit loop and end the program
                    break;

                default:
                    System.out.println("Invalid choice. Please select a valid option.");
            }
        }
        scanner.close();
    }
}