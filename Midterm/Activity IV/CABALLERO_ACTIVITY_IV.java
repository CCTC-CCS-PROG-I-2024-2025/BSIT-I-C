import java.util.Scanner;

public class CABALLERO_ACTIVITY_IV {
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a non-negative interger");
        int x = sc.nextInt();

        int factorial = 1;
        for ( int j = 1; j <= x; j++ ){
            factorial *=j;
        }
        System.out.println("The factorial of" + x + "is:" + factorial);
    }
}