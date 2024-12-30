import java.util.Scanner;

public class DACUYAN_FINAL_PROJECT {

    public static void main(String[] args) {
        // Java Comments: This program demonstrates various Java features.

        // Variables and Variable Types:
        Scanner input = new Scanner(System.in); // Taking user input
        double length, width, radius, base, height;  //Declare variables
        int shapeChoice;


        // Taking user input and doing math
        System.out.println("Select a shape:");
        System.out.println("1. Rectangle");
        System.out.println("2. Circle");
        System.out.println("3. Triangle");
        shapeChoice = input.nextInt();  //Storing user input

        // Conditionals (if-else if-else) and Multiple Conditions:
        if (shapeChoice == 1) {  //Rectangle
            System.out.print("Enter length: ");
            length = input.nextDouble();
            System.out.print("Enter width: ");
            width = input.nextDouble();
            double area = length * width; // Doing math
            System.out.println("Area of rectangle: " + area);
        } else if (shapeChoice == 2) { // Circle
            System.out.print("Enter radius: ");
            radius = input.nextDouble();
            double area = 3.14159 * radius * radius; //Doing Math
            System.out.println("Area of circle: " + area);
        } else if (shapeChoice == 3) { // Triangle
            System.out.print("Enter base: ");
            base = input.nextDouble();
            System.out.print("Enter height: ");
            height = input.nextDouble();
            double area = 0.5 * base * height; // Doing Math
            System.out.println("Area of triangle: " + area);
        } else {
            System.out.println("Invalid shape choice.");
        }


        //For Loop Example (Illustrative - not directly related to shape calculation)

        System.out.println("\nExample of a For Loop:");
        System.out.print("Enter a number to count to: ");
        int limit = input.nextInt();
        for (int i = 1; i <= limit; i++) {
            System.out.print(i + " ");
        }
        System.out.println();


        //Switch Statement (Alternative to if-else if) -  Could replace the if-else if block above.
        /*
        switch (shapeChoice){
            case 1: //Rectangle
                //Rectangle area calculation
                break;
            case 2: //Circle
                //Circle area calculation
                break;
            case 3: //Triangle
                //Triangle area calculation
                break;
            default:
                System.out.println("Invalid shape choice.");
        }
        */

        input.close(); // Good practice to close the scanner
    }
}