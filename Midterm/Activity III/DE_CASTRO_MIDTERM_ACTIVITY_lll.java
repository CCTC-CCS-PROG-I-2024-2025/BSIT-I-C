    import java.util.Scanner;
public class DE_CASTRO_MIDTERM_ACTIVITY_lll {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter number");
        int num = sc.nextInt();
        
        while(num>=0) {
            System.out.println(num);
            num--;
        }
        sc.close();
    }
}