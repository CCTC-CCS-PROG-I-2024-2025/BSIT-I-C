import java.util.Scanner;

public class TEROBIAS_ACTIVITY_IV {

    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);

        System.out.println("Enter your score: ");
        int score = scanner.nextInt();
        
        scanner.close();

        if (score >= 90) {
          System.out.println("Grade: A");
        } else if (score >= 80) {
          System.out.println("Grade: B");
        } else if (score >= 70) {
          System.out.println("Grade: C");
         } else {
          System.out.println("Grade: F");
        
         }


        }   
       
    }
