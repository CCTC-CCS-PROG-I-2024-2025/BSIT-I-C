
import java.util.Scanner;
public class MAHINAY_J_FINAL_PROJECT {
    public static void main (String [] args) {
        Scanner sc = new Scanner (System.in);
         System.out.println("Welcome to MAHINAY, J FASTFOODCHAIN!");
         int choice;
         double total = 0.0;
          do {
            // i using do instead of while 
              System.out.println("\nFast Food Chain Menu");
              System.out.println("1. Burger (₱100.00)");
              System.out.println("2. Fries (₱50.00)");
              System.out.println("3. Drink (₱30.00)");
              System.out.println("4. Total Order");
              System.out.println("5. Exit");
              System.out.println("Enter your choice:");

              choice = sc.nextInt();
              switch (choice) {
                case 1:
                total += 100.00;
                System.out.println("Burger added to your order.");
                 break;
                 case 2:
                 total += 50.00;
                 System.out.println("Fries added to your order.");
                 break;
                 case 3:
                 total += 30.00;
                 System.out.println("Drink added to your order.");
                 break;
                 case 4:
                 System.out.println("Your total order is" + total);
                 break;
                 case 5:
                 System.out.println("Thank you for visiting our fast food chain!");
                 break;
                 default:
                 System.out.println("Invalid choice. Please try again.");
                
                 sc.close();
              }
               } while ( choice != 5);


               // For loop: Thanking for costumer 

               System.out.println("\n Thank you");
                for (int i = 0; i < 5; i++) {
                  System.out.print("❤️");

                }




               
    }
    
}
