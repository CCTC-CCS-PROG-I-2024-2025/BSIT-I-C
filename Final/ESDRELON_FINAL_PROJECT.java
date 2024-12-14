
import java.util.ArrayList;
import java.util.Scanner;

public class ESDRELON_FINAL_PROJECT {

    static ArrayList<Student> students = new ArrayList<>(); // Store student data

    public static void main(String[] args) {
        // Initialize variables
        Scanner scanner = new Scanner(System.in);
        int choice;

        // Welcome message
        System.out.println("Welcome to the ESDRELON Finals Project - Student Management System!");

        // Main loop to keep the program running until the user chooses to exit
        while (true) {
            // Display menu options
            System.out.println("\nChoose an action:");
            System.out.println("1. Add Student Information");
            System.out.println("2. Display Student Information");
            System.out.println("3. Search for Student");
            System.out.println("4. Update Student Information");
            System.out.println("5. Delete Student Information");
            System.out.println("6. Exit");
            System.out.print("Enter your choice: ");

            // Get user's choice
            choice = scanner.nextInt();
            scanner.nextLine(); // Consume the newline character

            // Process user's choice using a switch statement
            switch (choice) {
                case 1:
                    addStudent(scanner);
                    break;
                case 2:
                    displayAllStudents();
                    break;
                case 3:
                    searchStudent(scanner);
                    break;
                case 4:
                    updateStudent(scanner);
                    break;
                case 5:
                    deleteStudent(scanner);
                    break;
                case 6:
                    // Exit the program
                    System.out.println("Exiting the Student Management System.");
                    scanner.close();
                    return; // Exit the program
                default:
                    System.out.println("Invalid choice. Please enter a number between 1 and 6.");
            }
        }
    }

    // Method to add a new student
    private static void addStudent(Scanner scanner) {
        System.out.print("Enter student name: ");
        String studentName = scanner.nextLine();

        System.out.print("Enter student age: ");
        int studentAge = scanner.nextInt();
        scanner.nextLine(); // Consume the newline character

        System.out.print("Enter math grade: ");
        double mathGrade = scanner.nextDouble();

        System.out.print("Enter science grade: ");
        double scienceGrade = scanner.nextDouble();

        System.out.print("Enter english grade: ");
        double englishGrade = scanner.nextDouble();

        // Create a new Student object
        Student newStudent = new Student(studentName, studentAge, mathGrade, scienceGrade, englishGrade);

        // Add the student to the list
        students.add(newStudent);

        System.out.println("\nStudent added successfully!");
    }

    // Method to display all students
    private static void displayAllStudents() {
        if (students.isEmpty()) {
            System.out.println("\nNo students in the system.");
            return;
        }

        System.out.println("\nStudent Information:");
        for (Student student : students) {
            System.out.println(student);
        }
    }

    // Method to search for a student
    private static void searchStudent(Scanner scanner) {
        System.out.print("Enter the name of the student to search: ");
        String searchName = scanner.nextLine();

        boolean found = false;
        for (Student student : students) {
            if (student.getName().equalsIgnoreCase(searchName)) {
                System.out.println("\nStudent Found:");
                System.out.println(student);
                found = true;
                break; // Stop searching after finding the student
            }
        }

        if (!found) {
            System.out.println("\nStudent not found.");
        }
    }

    // Method to update student information
    private static void updateStudent(Scanner scanner) {
        System.out.print("Enter the name of the student to update: ");
        String updateName = scanner.nextLine();

        boolean found = false;
        for (Student student : students) {
            if (student.getName().equalsIgnoreCase(updateName)) {
                System.out.println("\nUpdate Student Information:");
                System.out.print("Enter new name (leave blank to keep current): ");
                String newName = scanner.nextLine();
                if (!newName.isEmpty()) {
                    student.setName(newName);
                }

                System.out.print("Enter new age (leave blank to keep current): ");
                String newAgeInput = scanner.nextLine();
                if (!newAgeInput.isEmpty()) {
                    try {
                        student.setAge(Integer.parseInt(newAgeInput));
                    } catch (NumberFormatException e) {
                        System.out.println("Invalid age format. Age will remain unchanged.");
                    }
                }

                System.out.print("Enter new math grade (leave blank to keep current): ");
                String newMathGradeInput = scanner.nextLine();
                if (!newMathGradeInput.isEmpty()) {
                    try {
                        student.setMathGrade(Double.parseDouble(newMathGradeInput));
                    } catch (NumberFormatException e) {
                        System.out.println("Invalid grade format. Math grade will remain unchanged.");
                    }
                }

                System.out.print("Enter new science grade (leave blank to keep current): ");
                String newScienceGradeInput = scanner.nextLine();
                if (!newScienceGradeInput.isEmpty()) {
                    try {
                        student.setScienceGrade(Double.parseDouble(newScienceGradeInput));
                    } catch (NumberFormatException e) {
                        System.out.println("Invalid grade format. Science grade will remain unchanged.");
                    }
                }

                System.out.print("Enter new english grade (leave blank to keep current): ");
                String newEnglishGradeInput = scanner.nextLine();
                if (!newEnglishGradeInput.isEmpty()) {
                    try {
                        student.setEnglishGrade(Double.parseDouble(newEnglishGradeInput));
                                            } catch (NumberFormatException e) {
                                                System.out.println("Invalid grade format. English grade will remain unchanged.");
                                            }
                                        }
                        
                                        System.out.println("\nStudent information updated successfully!");
                                        found = true;
                                        break;
                                    }
                                }
                        
                                if (!found) {
                                    System.out.println("\nStudent not found.");
                                }
                            }
                        
                            // Method to delete student information
                            private static void deleteStudent(Scanner scanner) {
                                System.out.print("Enter the name of the student to delete: ");
                                String deleteName = scanner.nextLine();
                        
                                boolean found = false;
                                for (int i = 0; i < students.size(); i++) {
                                    if (students.get(i).getName().equalsIgnoreCase(deleteName)) {
                                        students.remove(i);
                                        System.out.println("\nStudent deleted successfully!");
                                        found = true;
                                        break;
                                    }
                                }
                        
                                if (!found) {
                                    System.out.println("\nStudent not found.");
                                }
                            }
                        
                            // Inner class to represent a student
                            static class Student {
                                private String name;
                                private int age;
                                private double mathGrade, scienceGrade, englishGrade;
                        
                                public Student(String name, int age, double mathGrade, double scienceGrade, double englishGrade) {
                                    this.name = name;
                                    this.age = age;
                                    this.mathGrade = mathGrade;
                                    this.scienceGrade = scienceGrade;
                                    this.englishGrade = englishGrade;
                                }
                        
                                public void setEnglishGrade(double double1) {
                                    // TODO Auto-generated method stub
                                    throw new UnsupportedOperationException("Unimplemented method 'setEnglishGrade'");
                                }
                        
                                public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public int getAge() {
            return age;
        }

        public void setAge(int age) {
            this.age = age;
        }

        public double getMathGrade() {
            return mathGrade;
        }

        public void setMathGrade(double mathGrade) {
            this.mathGrade = mathGrade;
        }

        public double getScienceGrade() {
            return scienceGrade;
        }

        public void setScienceGrade(double scienceGrade) {
            this.scienceGrade = scienceGrade;
        }

        public double getEnglishGrade() {
            return englishGrade;
        }
    }
}