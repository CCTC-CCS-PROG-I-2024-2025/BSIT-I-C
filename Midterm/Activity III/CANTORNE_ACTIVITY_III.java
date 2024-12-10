import java.util.Scanner;

public class CANTORNE_ACTIVITY_III {
    public static void main(String [] args){
         Scanner sc = new Scanner(System.in);
         System.out.print("Enter number of second: ");
         int num = sc.nextInt();

         while(num>=0){
            System.out.println(num);
            num--;
        }
        sc.close();
    }

}
