import java.util.Scanner;
class BETUIN_ACTIVITY_VII {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter a number:");
    int number = sc.nextInt();
    int factorial = 1;
    
    for(int i = 1; i <= number; i++){
        factorial *= i;
    
    } System.out.println(factorial);
    }


    
}
