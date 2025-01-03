import java.util.Scanner;

public class FERRAS_ACTIVITY_III {
   public static void main(String[]args){
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter non negative integer number:");
    int num = sc.nextInt();
    
    int factorial= 1;

    for(int x =1; x<=num; x++){
        factorial *=x;

    }
    System.out.println(factorial);
}
}