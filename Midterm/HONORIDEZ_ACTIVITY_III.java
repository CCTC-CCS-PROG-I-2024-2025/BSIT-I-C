import java.util.Scanner;
 
public class HONORIDEZ_ACTIVITY_III {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter number");
        int num = sc.nextInt();
        
        while(num>=0) {
            System.out.println(num);
            num--;
        }
    }
}