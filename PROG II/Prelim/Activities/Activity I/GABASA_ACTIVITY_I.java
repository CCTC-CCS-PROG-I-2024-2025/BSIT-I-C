import java.util.Scanner;

public class GABASA_ACTIVITY_I {
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      
      String[] names = new String[5];

      for (int i = 0; i < 5; i++) {
          System.out.println("Please enter a name " + (i + 1) + ":");
          names[i] = sc.nextLine();
      }
      System.out.println("Please enter a user number");
      int number = sc.nextInt();

      System.out.println(names[number - 1]);
    }
}