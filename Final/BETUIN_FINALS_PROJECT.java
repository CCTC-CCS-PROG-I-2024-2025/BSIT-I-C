import java.util.Scanner;

class BETUIN_FINALS_PROJECT {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Getting started with Java
        System.out.println("Hello, Java World!"); // The first line I learned in Java

        // Student information
        String studentName = "BETUIN, LYREL";
        char middleInitial = 'N';
        String birthDate = "2005-12-16"; // Representing the birthdate as a string
        double height = 165.14; // Height in cm
        float weight = 63.0f; // Weight in kg
        boolean isPurePinoy = false; // Boolean flag for nationality

        // Display student information
        System.out.println("Student Name: " + studentName);
        System.out.println("Middle Initial: " + middleInitial);
        System.out.println("Birth Date: " + birthDate);
        System.out.println("Height: " + height + " cm");
        System.out.println("Weight: " + weight + " kg");
        System.out.println("Is Pure Pinoy: " + isPurePinoy);

        // Doing math
        System.out.println("(Doing math)");
        int num1 = 20;
        int num2 = 7;
        int sum = num1 + num2;
        int difference = num1 - num2;
        int product = num1 * num2;
        double quotient = (double) num1 / num2; // Casting for precise division
        int remainder = num1 % num2;

        // Display math operations
        System.out.println("Sum: " + sum);
        System.out.println("Difference: " + difference);
        System.out.println("Product: " + product);
        System.out.println("Quotient: " + quotient);
        System.out.println("Remainder: " + remainder);

        // Conditionals
        System.out.println("(Doing Conditionals)");
        System.out.print("Enter your age: ");
        int age = scanner.nextInt();
        if (age >= 18) {
            System.out.println("You are eligible to vote!");
        } else {
            System.out.println("You are not eligible to vote.");
        }

        // Switch statement
        System.out.println("(Doing Switch Statement)");
        System.out.print("Enter a number (1, 2, or 3): ");
        int emotion = scanner.nextInt();
        switch (emotion) {
            case 1:
                System.out.println("You are feeling Happy!");
                break;
            case 2:
                System.out.println("You are feeling Sad.");
                break;
            case 3:
                System.out.println("You are feeling Angry!");
                break;
            default:
                System.out.println("Invalid emotion.");
        }

        // Loops
        System.out.println("(Doing Loops)");
        System.out.print("Enter a number to count up to: ");
        int count = scanner.nextInt();
        for (int i = 1; i <= count; i++) {
            System.out.println(i);
        }

        // Multiple conditions
        System.out.println("(Doing Multiple Conditions)");
        System.out.print("Enter the city's population: ");
        int population = scanner.nextInt();
        System.out.print("Enter the city's area (in square km): ");
        int area = scanner.nextInt();
        if (population > 1000000 && area > 500) {
            System.out.println("The city is large.");
        } else {
            System.out.println("The city is small.");
        }

        // Factorial using a while loop
        System.out.println("(Calculating Factorial using While Loop)");
        System.out.print("Enter a number to find its factorial: ");
        
        int factorial = 1;
        int number = scanner.nextInt();
        int i = 1;
        while (i <= number) {
            factorial *= i;
            i++;
        }
        System.out.println("Factorial of " + number + " is: " + factorial);

        // Factorial using a for loop
        System.out.println("(Calculating Factorial using For Loop)");
        System.out.print("Enter another number to find its factorial: ");
        number = scanner.nextInt();
        int factorial2 = 1;
        for (int j = 1; j <= number; j++) {
            factorial2 *= j;
        }
        System.out.println("Factorial of " + number + " is: " + factorial2);

        
        scanner.close();
    }
}
