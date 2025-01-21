import java.util.Scanner;

public class AVILES_ACTIVITY_I {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        String[] names = new String [5];
        
        for(int x = 0; x < 5; x++){
            System.out.println("Enter name " + (x+1) + "");
            names[x] = sc.nextLine();
        }
            System.out.println("Enter number ");
            int num = sc.nextInt();
            System.out.println(names[num-1]);
    }
}