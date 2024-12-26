import java.util.Scanner;

public class MAHILUM_ACTIVITY_III {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("enter number: ");
        int num = sc.nextInt();
        
        while(num>=0){
            System.out.println(num);
            num--;
        }
        sc.close();
    }
    
}
