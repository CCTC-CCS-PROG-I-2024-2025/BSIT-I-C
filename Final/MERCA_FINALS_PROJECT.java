import java.util.Scanner;

public class MERCA_FINALS_PROJECT {

    public static void main(String[] args) {

        // Variables with different data types
        int age;
        double weight;
        String name;
        boolean isAdult;


        // Taking user input
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your name: ");
        name = input.nextLine();
        System.out.print("Enter your age: ");
        age = input.nextInt();
        System.out.print("Enter your weight (in kg): ");
        weight = input.nextDouble();
        input.close(); // closing scanner to prevent resource leak


        // Conditional statement (if-else)
        isAdult = age >= 18; // Multiple conditions in a single statement

        if (isAdult) {
            System.out.println("You are an adult.");
        } else {
            System.out.println("You are a minor.");
        }


        // Switch statement
        int dayOfWeek = 3; //Example day of week
        String dayName;
        switch (dayOfWeek) {
            case 1:
                dayName = "Monday";
                break;
            case 2:
                dayName = "Tuesday";
                break;
            case 3:
                dayName = "Wednesday";
                break;
            case 4:
                dayName = "Thursday";
                break;
            case 5:
                dayName = "Friday";
                break;
            case 6:
                dayName = "Saturday";
                break;
            case 7:
                dayName = "Sunday";
                break;
            default:
                dayName = "Invalid day";
        }
        System.out.println("Today is: " + dayName);


        //While loop, multiple statements and math operations inside
        int counter = 0;
        double bmi = 0; // Initialize BMI

        while (counter < 5) { //While loop condition
            bmi = weight / (age * age); //Mathematical operations
            System.out.println("BMI calculation iteration " + (counter + 1) + ": " + bmi);
            counter++; //Increment counter
        }


        // Multiple statements, variables and math
        double height = 1.75; //Example height
        double bmi2 = weight / (height * height);
        System.out.println("Your BMI is: " + bmi2);

        //Java comment: This is a multi-line comment.  It explains what the code does.

        //More statements and variables.
        int x = 10;
        int y = 5;
        int sum = x + y;
        int difference = x - y;
        int product = x * y;
        if (y != 0) {
            int quotient = x / y;
            System.out.println("The sum of x and y is: " + sum);
            System.out.println("The difference between x and y is: " + difference);
            System.out.println("The product of x and y is: " + product);
            System.out.println("The quotient of x and y is: " + quotient);
        } else {
            System.out.println("Cannot divide by zero");
        }

    }
}