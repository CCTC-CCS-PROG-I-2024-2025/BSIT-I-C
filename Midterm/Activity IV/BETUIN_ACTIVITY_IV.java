import java.util.Scanner;
class BETUIN_ACTIVITY_IV {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter a non-integer number:");
    int number = sc.nextInt();
    int factorial = 1;
    
    for(int i = 1; i <= number; i++){
        factorial *= i;
    
    } System.out.println("The factorial of " + number + " is " + factorial);
    }


    
}
