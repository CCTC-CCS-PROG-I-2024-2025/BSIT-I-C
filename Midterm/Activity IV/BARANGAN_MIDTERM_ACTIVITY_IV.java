package MIDTERM_BARANGAN;
import java.util.Scanner;

public class BARANGAN_ACTIVITY_IV {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a non-negative integer:");
        int x = sc.nextInt();

        int factorial = 1;

        for ( int j=1; j<=x; j++){
            factorial *=j ;
        }
         System.out.println("the factorial of" + x + "is:" + factorial);


    }
}