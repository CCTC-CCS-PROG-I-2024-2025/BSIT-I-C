import java.util.Scanner; // For taking user input

public class BELVESTRE_FINALS_PROJECT {
    
        // Program Structure: Every Java program starts with a main method.
    public static void main(String[] args) {

        // Variables and Variable Types
        double num1, num2, result;
        int choice;

        // Taking User Input
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to the Simple Calculator by BELVESTRE!");
        
        // Getting two numbers from the user
        System.out.print("Enter the first number: ");
        num1 = scanner.nextDouble(); // Assigning a double value
        System.out.print("Enter the second number: ");
        num2 = scanner.nextDouble(); // Assigning a double value

        // Displaying the menu for operations
        System.out.println("Choose an operation:");
        System.out.println("1. Addition");
        System.out.println("2. Subtraction");
        System.out.println("3. Multiplication");
        System.out.println("4. Division");
        System.out.println("Enter your choice (1-4): ");
        choice = scanner.nextInt(); // Assigning an integer value

        // Performing the chosen operation
        switch (choice) {
            case 1:
                result = num1 + num2;
                System.out.println("Result: " + num1 + " + " + num2 + " = " + result);
                break;
            case 2:
                result = num1 - num2;
                System.out.println("Result: " + num1 + " - " + num2 + " = " + result);
                break;
            case 3:
                result = num1 * num2;
                System.out.println("Result: " + num1 + " * " + num2 + " = " + result);
                break;
            case 4:
                if (num2 != 0) {
                    result = num1 / num2;
                    System.out.println("Result: " + num1 + " / " + num2 + " = " + result);
                } else {
                    System.out.println("Error: Division by zero is not allowed.");
                }
                break;
            default:
                System.out.println("Invalid choice. Please select a number between 1 and 4.");
        }

        // Asking the user if they want to perform another calculation
        System.out.print("Do you want to perform another calculation? (yes/no): ");
        String response = scanner.next(); // Taking a string response

        // While Loop for repeated calculations
        while (response.equalsIgnoreCase("yes")) {
            System.out.print("Enter the first number: ");
            num1 = scanner.nextDouble();
            System.out.print("Enter the second number: ");
            num2 = scanner.nextDouble();

            System.out.println("Choose an operation:");
            System.out.println("1. Addition");
            System.out.println("2. Subtraction");
            System.out.println("3. Multiplication");
            System.out.println("4. Division");
            System.out.print("Enter your choice (1-4): ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    result = num1 + num2;
                    System.out.println("Result: " + num1 + " + " + num2 + " = " + result);
                    break;
                case 2:
                    result = num1 - num2;
                    System.out.println("Result: " + num1 + " - " + num2 + " = " + result);
                    break;
                case 3:
                    result = num1 * num2;
                    System.out.println("Result: " + num1 + " * " + num2 + " = " + result);
                    break;
                case 4:
                    if (num2 != 0) {
                        result = num1 / num2;
                        System.out.println("Result: " + num1 + " / " + num2 + " = " + result);
                    } else {
                        System.out.println("Error: Division by zero is not allowed.");
                    }
                    break;
                default:
                    System.out.println("Invalid choice. Please select a number between 1 and 4.");
            }

            // Asking again if the user wants to continue
            System.out.print("Do you want to perform another calculation? (yes/no): ");
            response = scanner.next();
        }

        // Closing the scanner
        scanner.close();
        System.out.println("Thank you for using the Simple Calculator. Goodbye!");
    }
}