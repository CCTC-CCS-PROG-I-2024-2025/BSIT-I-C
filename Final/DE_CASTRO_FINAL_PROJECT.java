import java.util.Scanner;

public class DE_CASTRO_FINAL {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Welcome message
        System.out.println("Welcome to DE CASTRO Shop!");
        System.out.print("Please enter your name: ");
        String customerName = scanner.nextLine();

        boolean shopping = true;
        double totalCost = 0;

        while (shopping) {
            // Display menu
            System.out.println("\nMenu:");
            System.out.println("1. Oreo ($1.00)");
            System.out.println("2. Banana ($0.50)");
            System.out.println("3. Straw ($0.75)");
            System.out.println("4. Checkout");

            System.out.print("Please select an item by entering the number: ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("How many Oreo would you like? ");
                    int OreoCount = scanner.nextInt();
                    totalCost += OreoCount * 1.00;
                    break;
                case 2:
                    System.out.print("How many bananas would you like? ");
                    int bananaCount = scanner.nextInt();
                    totalCost += bananaCount * 0.50;
                    break;
                case 3:
                    System.out.print("How many Straw would you like? ");
                    int StrawCount = scanner.nextInt();
                    totalCost += StrawCount * 0.75;
                    break;
                case 4:
                    shopping = false;
                    break;
                default:
                    System.out.println("Invalid selection. Please try again.");
            }
        }

        // Apply a discount if the total is over $20
        if (totalCost > 20) {
            System.out.println("You qualify for a 10% discount!");
            totalCost *= 0.90;
        }

        // Display the final total
        System.out.printf("\nThank you, %s! Your total is: $%.2f\n", customerName, totalCost);

        // Ask if they want a receipt
        System.out.print("Would you like a receipt? (yes/no): ");
        scanner.nextLine(); // Consume leftover newline
        String receiptChoice = scanner.nextLine().toLowerCase();

        if (receiptChoice.equals("yes")) {
            System.out.println("\n--- Receipt ---");
            System.out.printf("Customer: %s\n", customerName);
            System.out.printf("Total: $%.2f\n", totalCost);
            System.out.println("Thank you for shopping with us!");
        } else {
            System.out.println("Thank you! Have a great day!");
        }

        scanner.close();
    }
}
