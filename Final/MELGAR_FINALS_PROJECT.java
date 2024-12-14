import java.util.Scanner;

public class MELGAR_FINALS_PROJECT {

    static int units = 24; 
    static String year = "1st Year"; 
    static String status = "Regular";  
    public static void main(String[] args) {
        intro(); //Begins to initialize the main interface
    }

    static void intro() {
        System.out.println("----------Welcome to the Student Portal----------");
        System.out.println("1. Log In");
        System.out.println("2. Register");
        System.out.println("3. Credits");
        System.out.println("        ");
        System.out.println("-------------------------------------------------");
        System.out.print("Enter the number of the mentioned choices: ");
        Scanner sc = new Scanner(System.in);
        int choices = sc.nextInt();
        switch (choices) {
            case 1:
                logIn();
                break;
            case 2:
            System.out.print("This program is not yet available");


            case 3:
            default:
            System.out.println("This program is made by Aidezeir P. Melgar . BSIT-1C Student");
                
        }
    }

    static void register(){
        System.out.println("This program will be available soon");

    }

    static void logIn() {
        String studentNumber = "20242025";
        String password = "Sep12";
        System.out.print("Student Number: ");
        Scanner sc1 = new Scanner(System.in);
        String inputStudentNumber = sc1.nextLine();

        if (!inputStudentNumber.equals(studentNumber)) {
            System.out.println("Invalid Student Number. Please try again.");
            logIn();
            return;
        }
    

        for (int attempts = 0; attempts < 3; attempts++) {
            System.out.print("Password: ");
            String inputPassword = sc1.nextLine();
            if (inputPassword.equals(password)) {
                welcomePortal();
            } else {
                System.out.println("Invalid Password. Attempts left: " + (2 - attempts));
            }
        }
    
        System.out.println("Too many failed attempts. Exiting program.");
        intro();
        return;
    }

    static void welcomePortal() {
        System.out.println("        ");
        System.out.println("Welcome Aidezeir P. Melgar");
        System.out.println("------------------------------------");
        System.out.println("Units: " + units);
        System.out.println("Year: " + year);
        System.out.println("Status: " + status);
        System.out.println("------------------------------------");
        System.out.print("Select what you will edit (Units/Year/Status) or Exit: ");
        Scanner sc3 = new Scanner(System.in);
        String editing = sc3.nextLine();

        if (!editing.equals("Units") && !editing.equals("Year") && !editing.equals("Status") && !editing.equals("Exit")){
            System.out.println("        ");
            System.out.println("        ");
             System.out.println("        ");
            System.out.println("Invalid input. Returning to portal");
            welcomePortal();
        }

        switch (editing) {
            case "Units":
                units();
                break;
            case "Year":
                year();
                break;
            case "Status":
                status();
                break;
            case "Exit":
            intro();
            default:
                System.out.println("Invalid choice. Returning to portal.");
                welcomePortal();
        }
    }

    static void units() {
        Scanner sc = new Scanner(System.in);
        System.out.println("        ");
        System.out.println("1. Add Units");
        System.out.println("2. Deduct Units");
        System.out.print("Enter your choice: ");
        int choice = sc.nextInt();

        switch (choice) {
            case 1:
                System.out.print("Enter the number of units to add: ");
                int addUnits = sc.nextInt();
                units += addUnits;
                System.out.println("Units updated! Total Units: " + units);
                break;
            case 2:
                System.out.print("Enter the number of units to deduct: ");
                int deductUnits = sc.nextInt();
                if (deductUnits <= units) {
                    units -= deductUnits;
                    System.out.println("Units updated! Total Units: " + units);
                } else {
                    System.out.println("Cannot deduct more units than available!");
                }
                break;
            default:
                System.out.println("Invalid choice.");

        }
      
    }

    static void year() {
        System.out.println("Year editing feature coming soon!");
        welcomePortal();
    }

    static void status() {
        System.out.println("Status editing feature coming soon!");
        welcomePortal();
    }
}