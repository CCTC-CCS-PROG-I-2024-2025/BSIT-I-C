import java.util.Scanner;

public class GADIANO_ACTIVITY_I{

    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);

        String[] names = new String [5];
        
        for(int i = 0; i < 5; i++) {
            System.out.println("Enter name " + (i + 1) + ":");
            names[i] = sc.nextLine();
          }
          System.out.println("Enter a name that corresponds to the name you want to display:");
            int number = sc.nextInt();
            System.out.println(names[number-1]);
    }

}
