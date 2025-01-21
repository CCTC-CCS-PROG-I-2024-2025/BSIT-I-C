import java.util.Scanner;

public class CONSOLACION_ACTIVITY_I{
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        String [] names = new String[5];

        System.out.println("Enter 5 names:");
        for (int i = 0; i < 5; i++) {
            System.out.print("Enter name" +  (i + 1) + ": ");
            names[i] = scanner.nextLine();
        }

        
            System.out.print("Enter a number that corresponds to the name you want to display: ");
            
                int number = scanner.nextInt();
                System.out.println (names [ number-1]);

    }
}       
                
