import java.util.Scanner;
 
public class XMONTEJO_ACTIVITY_III {

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("enter number");
            int num = sc.nextInt();
            
            while(num>=0) {
                System.out.println(num);
                num--;
            }
        }
    }
}