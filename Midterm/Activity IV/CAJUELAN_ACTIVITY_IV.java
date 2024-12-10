import java.util.Scanner;

public class CAJUELAN_ACTIVITY_IV {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a non-negative integer: ");
        int num = input.nextInt();
        input.close();

        if (num < 0) {
            System.out.println("Error: Input must be non-negative.");
            return;
        }

        long factorial = 1; // Initialize factorial to 1 (long to handle larger factorials)
        for (int i = 1; i <= num; i++) {
            factorial *= i;
        }

        System.out.println("The factorial of " + num + " is: " + factorial);
    }
}

