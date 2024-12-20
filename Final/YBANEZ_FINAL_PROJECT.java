import java.util.Scanner;

public class StudentGrading {

    public static void main(String[] args) {

        // Variables
        Scanner input = new Scanner(System.in); //For user input
        int numStudents;
        String studentName;
        double score;
        char grade;
        int i = 0;


        // Get the number of students from the user.
        System.out.print("Enter the number of students: ");
        numStudents = input.nextInt();
        input.nextLine(); // Consume newline


        //Input validation: Ensure a positive number of students
        while (numStudents <= 0) {
            System.out.println("Invalid number of students. Please enter a positive integer:");
            numStudents = input.nextInt();
            input.nextLine();
        }


        // Loop through each student
        while (i < numStudents) {
            System.out.print("Enter student's name: ");
            studentName = input.nextLine();

            System.out.print("Enter student's score (0-100): ");
            score = input.nextDouble();
            input.nextLine(); // Consume newline

            // Input validation: Ensure score is within range
            while (score < 0 || score > 100) {
                System.out.println("Invalid score. Please enter a score between 0 and 100:");
                score = input.nextDouble();
                input.nextLine();
            }

            // Determine the grade using a switch statement (alternative method)
            grade = calculateGradeSwitch(score);

            // Output the student's name and grade
            System.out.println(studentName + "'s grade is: " + grade);
            i++;
        }
        input.close(); // Close Scanner to prevent resource leak.
        System.out.println("Grading complete.");
    }

    // Helper method to calculate the grade based on the score using a switch statement.
    public static char calculateGradeSwitch(double score) {
        char grade;
        int scoreRange;

        //Determine score range for switch statement
        if (score >= 90) scoreRange = 90;
        else if (score >= 80) scoreRange = 80;
        else if (score >= 70) scoreRange = 70;
        else if (score >=60) scoreRange = 60;
        else scoreRange = 0;


        switch (scoreRange) {
            case 90:
                grade = 'A';
                break;
            case 80:
                grade = 'B';
                break;
            case 70:
                grade = 'C';
                break;
            case 60:
                grade = 'D';
                break;
            default:
                grade = 'F';
                break;
        }
        return grade;
    }
}