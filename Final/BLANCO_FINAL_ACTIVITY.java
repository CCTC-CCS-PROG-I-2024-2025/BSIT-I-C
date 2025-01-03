import java.util.Scanner;

public class BLANCO_FINAL_ACTIVITY {

    public static void main(String[] args) {
        System.out.println("WEllcome to Blanco's SPEED CALCULATOR");
        // Create a Scanner object to read input from the user
        Scanner scanner = new Scanner(System.in);
        
        // Prompt the user to input the distance traveled (in kilometers)
        System.out.print("Enter the distance traveled (in kilometers): ");
        double distance = scanner.nextDouble();
        
        // Prompt the user to input the time taken (in hours)
        System.out.print("Enter the time taken (in hours): ");
        double time = scanner.nextDouble();
        
        // Close the scanner as it's no longer needed
        scanner.close();
        
        // Calculate the speed
        double speed = distance / time;
        
        // Display the result
        System.out.printf("The speed is %.2f km/h\n", speed);
    }
}
