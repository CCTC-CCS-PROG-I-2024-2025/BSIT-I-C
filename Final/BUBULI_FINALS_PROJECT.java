import java.util.Scanner;

public class BUBULI_FINALS_PROJECT {
    public static void main(String[] args) {
        // Declare variables
        String studentName = "Joshua Bubuli";
        String studentBirthdate = "February 01 2006";
        int studentID = 20242009;
        int userPoints = 0;
        int mathResult = 0;
        String grade = "";

        // Create a Scanner object for user input
        Scanner scanner = new Scanner(System.in);

        // Print student information
        System.out.println("Student Name: " + studentName);
        System.out.println("Student Birthdate: " + studentBirthdate);
        System.out.println("Student ID: " + studentID);

        // Ask user for points
        System.out.print("Enter your points (1-100): ");
        userPoints = scanner.nextInt();

        // Check if user points are within the valid range
        if (userPoints >= 1 && userPoints <= 100) {
            // Perform math operation
            mathResult = userPoints * 2;
            System.out.println("Math Result: " + mathResult);

            // Determine grade based on user points
            if (userPoints >= 90) {
                grade = "A";
            } else if (userPoints >= 80) {
                grade = "B";
            } else if (userPoints >= 70) {
                grade = "C";
            } else if (userPoints >= 60) {
                grade = "D";
            } else {
                grade = "F";
            }

            System.out.println("Grade: " + grade);
        } else {
            System.out.println("Invalid points, Please enter a value between 1 and 100.");
        }

        // Use switch statement to determine grade level
        int gradeLevel = userPoints / 10;
        switch (gradeLevel) {
            case 10:
            case 9:
                System.out.println("Grade Level: Excellent");
                break;
            case 8:
                System.out.println("Grade Level: Good");
                break;
            case 7:
                System.out.println("Grade Level: Fair");
                break;
            case 6:
                System.out.println("Grade Level: Poor");
                break;
            default:
                System.out.println("Grade Level: Failing");
                break;
        }

        // Use while loop to print numbers from 1 to 10
        int i = 1;
        while (i <= 10) {
            System.out.println("Number: " + i);
            i++;
        }

        // Use for loop to print numbers from 1 to 10
        for (int j = 1; j <= 10; j++) {
            System.out.println("Number: " + j);
        }
    }
}