import java.util.Scanner;

public class EVANGELISTA_FINALS_PROJECT {

    public static void main(String[] args) {
        // Initialize variables
        Scanner scanner = new Scanner(System.in);
        String studentName;
        int studentAge;
        int numSubjects;
        double[] subjectScores;
        double totalScore = 0;
        char grade;

        // Get student information
        System.out.print("Enter student name: ");
        studentName = scanner.nextLine();

        System.out.print("Enter student age: ");
        studentAge = scanner.nextInt();

        // Get the number of subjects
        System.out.print("Enter the number of subjects: ");
        numSubjects = scanner.nextInt();

        // Create an array to store subject scores
        subjectScores = new double[numSubjects];

        // Get subject scores from the user
        System.out.println("Enter scores for each subject:");
        for (int i = 0; i < numSubjects; i++) {
            System.out.print("Subject " + (i + 1) + ": ");
            subjectScores[i] = scanner.nextDouble();
            totalScore += subjectScores[i];
        }

        // Calculate average score
        double averageScore = totalScore / numSubjects;

        // Determine the grade
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
        System.out.println("Total Score: " + totalScore);
        System.out.println("Average Score: " + averageScore);
        System.out.println("Grade: " + grade);

        // Ask the user for the passing score
        System.out.print("Enter the passing score: ");
        int passingScore = scanner.nextInt();

        // Use a while loop to check if the student passed each subject
        int numPassedSubjects = 0;
        int i = 0;
        while (i < numSubjects) {
            if (subjectScores[i] >= passingScore) {
                numPassedSubjects++;
            }
            i++;
        }

        // Print the number of subjects passed
        System.out.println("\nNumber of subjects passed: " + numPassedSubjects);

        // Use a for loop to check if the student passed each subject
        System.out.println("\nSubjects Passed:");
        for (int j = 0; j < numSubjects; j++) {
            if (subjectScores[j] >= passingScore) {
                System.out.println("Subject " + (j + 1));
            }
        }

        scanner.close();
    }
}