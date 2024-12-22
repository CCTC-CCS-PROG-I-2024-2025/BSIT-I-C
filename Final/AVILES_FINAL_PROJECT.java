import java.util.Scanner;

public class AVILES_FINAL_PROJECT {
    public static void main(String[]args){
          // 1. Variables 
        Scanner scanner = new Scanner(System.in);
          // Scanner for user input
        String productName = "";
        double originalPrice = 0.0;
        double discountPercentage = 0.0;
        double discountprice = 0.0;
        int quantity = 0;
        double totalPrice = 0.0;
        char choice = 'c';
          //For user choice (continue shopping or checkout)
          // 2. Welcome message 
        System.out.println("Welcome to our Online Store!");
          // 3. Main shopping loop 
        while (choice == 'c'){
              // Continue shopping until user chooses 'c' for checkout
            System.out.println("\n--- Shop Now ---");
            System.out.println("Enter product name: ");
            productName = scanner.nextLine();
            System.out.println("Enter original price: ");
            originalPrice = scanner.nextDouble();
            System.out.println("Enter discount percentage (enter 0 for no discount): ");
            discountPercentage = scanner.nextDouble();
              // 4. Calculate discount price 
            discountprice = originalPrice * (1 - discountPercentage / 100);
              // 5. Loop for multiple items of the same product 
            System.out.println("Enter quantity: ");
            quantity = scanner.nextInt();
              // 6. Calculate total price for the current item 
            totalPrice += discountprice * quantity;
            System.out.println("\nItem added to cart!");
            System.out.println("Current total price: $" + totalPrice);
              // 7. User choice: continue shopping or checkout
            scanner.nextLine(); 
              // Consume newline character 
            System.out.println("Do you want to continue shopping (s) or checkout (c)?");
            choice = scanner.nextLine().toLowerCase().charAt(0);
              // Get user choice and convert to lowercase
              // 8. Coditional statement for user choice using switch
            switch (choice) {
                case 's':
                System.out.println("continue shopping...");

                    break;
                case 'c':
                System.out.println( "Product name = " +productName);
                System.out.println("Originak price = " +originalPrice);
                System.out.println( "Discount percentage = " +discountPercentage + "%");
                System.out.println("checking out...");
                    break;
                default: 
                System.out.println("Invalid choice. Please enter 's' or 'c'.");
                    break;
            }
        }
                  // 9. Display final checkout summary
                System.out.println("\n--- Checkout Summary---");
                System.out.println("Total Price: $" + totalPrice);
                System.out.println("Thank you for shopping with us!");  
                scanner.close();
    }
}