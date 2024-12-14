import java.util.Scanner;

public class StudentGradeTracker {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Variables to store student information
        String studentName = "";
        int studentID = 0;
        int numCourses = 0;
        double[] courseGrades = null;
        double averageGrade = 0;
        char letterGrade = ' ';

        // Main program loop
        while (true) {
            // Display menu options
            System.out.println("\nStudent Grade Tracker");
            System.out.println("1. Add Student");
            System.out.println("2. View Student Details");
            System.out.println("3. Update Student Grades");
            System.out.println("4. Calculate Average Grade");
            System.out.println("5. Determine Letter Grade");
            System.out.println("6. Exit");
            System.out.print("Enter your choice: ");

            // Get user choice
            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            switch (choice) {
                case 1:
                    // Add a new student
                    System.out.print("Enter student name: ");
                    studentName = scanner.nextLine();
                    System.out.print("Enter student ID: ");
                    studentID = scanner.nextInt();
                    scanner.nextLine(); // Consume newline

                    System.out.print("Enter number of courses: ");
                    numCourses = scanner.nextInt();
                    scanner.nextLine(); // Consume newline

                    // Create an array to store course grades
                    courseGrades = new double[numCourses];

                    // Input grades for each course
                    System.out.println("Enter grades for each course:");
                    for (int i = 0; i < numCourses; i++) {
                        System.out.print("Course " + (i + 1) + ": ");
                        courseGrades[i] = scanner.nextDouble();
                        scanner.nextLine(); // Consume newline
                    }

                    System.out.println("Student added successfully!");
                    break;

                case 2:
                    // View student details
                    if (studentName.isEmpty()) {
                        System.out.println("No student data available.");
                    } else {
                        System.out.println("\nStudent Details:");
                        System.out.println("Name: " + studentName);
                        System.out.println("ID: " + studentID);
                        System.out.println("Number of Courses: " + numCourses);
                        if (courseGrades != null) {
                            System.out.println("Course Grades:");
                            for (int i = 0; i < numCourses; i++) {
                                System.out.println("Course " + (i + 1) + ": " + courseGrades[i]);
                            }
                        }
                        if (averageGrade != 0) {
                            System.out.println("Average Grade: " + averageGrade);
                        }
                        if (letterGrade != ' ') {
                            System.out.println("Letter Grade: " + letterGrade);
                        }
                    }
                    break;

                case 3:
                    // Update student grades
                    if (courseGrades == null) {
                        System.out.println("No student data available to update.");
                    } else {
                        System.out.println("\nUpdate Student Grades:");
                        System.out.print("Enter the course number to update (1-" + numCourses + "): ");
                        int courseToUpdate = scanner.nextInt();
                        scanner.nextLine(); // Consume newline

                        if (courseToUpdate >= 1 && courseToUpdate <= numCourses) {
                            System.out.print("Enter the new grade for Course " + courseToUpdate + ": ");
                            courseGrades[courseToUpdate - 1] = scanner.nextDouble();
                            scanner.nextLine(); // Consume newline
                            System.out.println("Grade updated successfully!");
                        } else {
                            System.out.println("Invalid course number.");
                        }
                    }
                    break;

                case 4:
                    // Calculate average grade
                    if (courseGrades != null) {
                        averageGrade = calculateAverage(courseGrades);
                        System.out.println("\nAverage Grade: " + averageGrade);
                    } else {
                        System.out.println("No course grades available to calculate average.");
                    }
                    break;

                case 5:
                    // Determine letter grade
                    if (averageGrade != 0) {
                        letterGrade = determineLetterGrade(averageGrade);
                        System.out.println("\nLetter Grade: " + letterGrade);
                    } else {
                        System.out.println("Average grade is not available.");
                    }
                    break;

                case 6:
                    // Exit the program
                    System.out.println("Exiting program...");
                    scanner.close();
                    System.exit(0);

                default:
                    // Handle invalid choice
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }

    // Method to calculate the average grade
    public static double calculateAverage(double[] grades) {
        double sum = 0;
        for (double grade : grades) {
            sum += grade;
        }
        return sum / grades.length;
    }

    // Method to determine letter grade based on average grade
    public static char determineLetterGrade(double averageGrade) {
        if (averageGrade >= 90) {
            return 'A';
        } else if (averageGrade >= 80) {
            return 'B';
        } else if (averageGrade >= 70) {
            return 'C';
        } else if (averageGrade >= 60) {
            return 'D';
        } else {
            return 'F';
        }
    }
}