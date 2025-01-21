import java.util.Scanner;

public class BETUIN_ACTIVITY_I {
    public static void main(String[] args) {
        String[] names = new String[5];
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter 5 names:");

        for (int i = 0; i < 5; i++) {
            System.out.print("Enter name " + (i + 1) + ": ");
            names[i] = scanner.nextLine(); 
        }
        System.out.println("Enter a number (0 to 4) to display the corresponding name:");
        int choice = scanner.nextInt(); 
        
        if (choice >= 0 && choice < names.length) {
            System.out.println("You selected: " + names[choice-1]); 
        } else {
            System.out.println("Invalid number. Please enter a number between 0 and 4.");
        }
        
    
        scanner.close();
    }
}
