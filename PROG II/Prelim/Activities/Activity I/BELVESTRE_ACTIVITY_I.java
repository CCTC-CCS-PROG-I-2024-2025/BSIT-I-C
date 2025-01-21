import java.util.Scanner;

public class BELVESTRE_ACTIVITY_I {

    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);

        
        String [] names = new String [5];

        for (int i = 0; i < 5; i++) {
            System.out.print("Enter a name " + (i + 1) + ":");
            names[i] = sc.nextLine();
        }

        System.out.print("Enter a number : ");
        int number = sc.nextInt();

        System.out.println(names[number - 1]);

        sc.close();


    }
}