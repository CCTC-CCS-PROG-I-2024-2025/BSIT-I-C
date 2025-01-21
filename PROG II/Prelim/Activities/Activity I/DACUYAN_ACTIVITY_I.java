import java.util.Scanner;

public class DACUYAN_ACTIVITY_I{
    public static void main(String[] args);{

Scanner sc = new Scanner(System.in);

    String[] names = new String[5];

    for (int i = 0; i < 5; i++){
        System.out.print("Enter name "+ (i + 1) + ":");
         names[i] = scanner.nextLine();
          int index = -1;
        while (index < 0 || index >= 5) {
            System.out.print("Enter a number between 1 and 5 to display the corresponding name: ");

            if (scanner.hasNextInt()) {
                index = scanner.nextInt() - 1;

                if (index < 0 || index >= 5) {
                    System.out.println("Invalid number! Please enter a number between 1 and 5.");
                }
            } else {
                System.out.println("Invalid input! Please enter a valid number between 1 and 5.");
                scanner.next();
            }
        }

        System.out.println("The name selected is: " + names[index]);
        scanner.close();
    }
    }
    
    }

