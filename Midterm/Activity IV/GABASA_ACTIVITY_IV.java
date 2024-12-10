import java.util.Scanner;

public class GABASA_ACTIVITY_IV {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter a non-negative integer");
        int x = sc.nextInt();

        int factorial = 1;
        for ( int m = 1; m <= x; m++ ){
            factorial *=m;
        }
        System.out.println("The factorial of" + x + "is:" + factorial);

        sc.close();
    }

}
