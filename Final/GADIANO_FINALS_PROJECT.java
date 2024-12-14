import java.util.Scanner;

public class StudentInfo {
    public static void main(String[] args) {
        // Student information
        String studentName = "Jesryl Gadiano";
        String birthDate = "August 11, 2006";
        int studentID = 20242011;

        // Display student information
        System.out.println("Student Name: " + studentName);
        System.out.println("Birth Date: " + birthDate);
        System.out.println("Student ID: " + studentID);

        // Taking user points
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of points you have earned: ");
        int points = scanner.nextInt();

        // Conditional to check points
        if (points >= 90) {
            System.out.println("You have an A grade.");
        } else if (points >= 80) {
            System.out.println("You have a B grade.");
        } else if (points >= 70) {
            System.out.println("You have a C grade.");
        } else if (points >= 60) {
            System.out.println("You have a D grade.");
        } else {
            System.out.println("You have failed.");
        }

        // Switch statement for feedback based on points
        switch (points / 10) {
            case 10:
            case 9:
                System.out.println("Excellent work!");
                break;
            case 8:
                System.out.println("Great job!");
                break;
            case 7:
                System.out.println("Good effort!");
                break;
            case 6:
                System.out.println("You can do better!");
                break;
            default:
                System.out.println("Keep trying!");
                break;
        }

        // While loop to ask for points until valid input is given
        int validPoints = -1;
        while (validPoints < 0 || validPoints > 100) {
            System.out.print("Please enter your points (0-100): ");
            validPoints = scanner.nextInt();
            if (validPoints < 0 || validPoints > 100) {
                System.out.println("Invalid input. Points must be between 0 and 100.");
            }
        }

        // For loop to display points
        System.out.println("You have entered the following points:");
        for (int i = 1; i <= validPoints; i++) {
            System.out.print(i + " ");
        }
        System.out.println(); // New line for better output formatting

        // Closing the scanner
        scanner.close();
    }
}