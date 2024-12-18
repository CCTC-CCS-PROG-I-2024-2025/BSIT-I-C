import java.util.Scanner;

public class ROJO_FINALS_PROJECT {

    public static void main(String[] args) {
        // Initialize scanner and variables
        Scanner scanner = new Scanner(System.in);
        String studentName;
        int studentAge;
        int numSubjects;
        double[] scores;  // Renamed to scores for simplicity
        double totalScore = 0;
        char grade;

        // Get student information
        System.out.print("Enter student name: ");
        studentName = scanner.nextLine();

        // Input validation for student age
        System.out.print("Enter student age: ");
        while (!scanner.hasNextInt()) {
            System.out.println("Invalid input. Please enter a valid integer for age.");
            scanner.next();  // Consume invalid input
        }
        studentAge = scanner.nextInt();

        // Get the number of subjects
        System.out.print("Enter the number of subjects: ");
        while (!scanner.hasNextInt()) {
            System.out.println("Invalid input. Please enter a valid integer for the number of subjects.");
            scanner.next();  // Consume invalid input
        }
        numSubjects = scanner.nextInt();

        // Ensure the number of subjects is positive
        if (numSubjects <= 0) {
            System.out.println("The number of subjects must be greater than 0.");
            scanner.close();  // Close the scanner before exiting
            return;  // Exit the program if the number of subjects is invalid
        }

        // Create an array to store subject scores
        scores = new double[numSubjects];

        // Get subject scores from the user
        System.out.println("Enter scores for each subject:");
        for (int i = 0; i < numSubjects; i++) {
            System.out.print("Subject " + (i + 1) + ": ");
            while (!scanner.hasNextDouble()) {
                System.out.println("Invalid input. Please enter a valid score.");
                scanner.next();  // Consume invalid input
            }
            scores[i] = scanner.nextDouble();
            totalScore += scores[i];
        }

        // Calculate average score
        double averageScore = totalScore / numSubjects;

        // Determine the grade based on average score
        if (averageScore >= 90) {
            grade = 'A';
        } else if (averageScore >= 80) {
            grade = 'B';
        } else if (averageScore >= 70) {
            grade = 'C';
        } else if (averageScore >= 60) {
            grade = 'D';
        } else {
            grade = 'F';
        }

        // Print student information and grade
        System.out.println("\nStudent Information:");
        System.out.println("Name: " + studentName);
        System.out.println("Age: " + studentAge);
        System.out.printf("Total Score: %.2f\n", totalScore);
        System.out.printf("Average Score: %.2f\n", averageScore);
        System.out.println("Grade: " + grade);

        // Ask the user for the passing score
        System.out.print("Enter the passing score: ");
        while (!scanner.hasNextInt()) {
            System.out.println("Invalid input. Please enter a valid integer for the passing score.");
            scanner.next();  // Consume invalid input
        }
        int passingScore = scanner.nextInt();

        // Ensure passing score is non-negative
        if (passingScore < 0) {
            System.out.println("Passing score cannot be negative.");
            scanner.close();  // Close the scanner before exiting
            return;  // Exit the program if passing score is invalid
        }

        // Count the number of subjects passed using a while loop
        int numPassedSubjects = 0;
        int i = 0;
        while (i < numSubjects) {
            if (scores[i] >= passingScore) {
                numPassedSubjects++;
            }
            i++;
        }

        // Print the number of subjects passed
        System.out.println("\nNumber of subjects passed: " + numPassedSubjects);

        // Print subjects that were passed using a for loop
        System.out.println("\nSubjects Passed:");
        for (int j = 0; j < numSubjects; j++) {
            if (scores[j] >= passingScore) {
                System.out.println("Subject " + (j + 1));
            }
        }

        // Close the scanner after use
        scanner.close();
    }
}
