import java.util.Scanner;

public class DE_CASTRO_ACTIVITY_I {
    public static void main(String []args) {
      Scanner sc = new Scanner(System.in);

      String[] name = new String[5];

      for(int i = 0; i < 5; i++) {
        System.out.println("Enter Name" + (i + 1) + ":");
        name[i] = sc.nextLine();
      }

    System.out.println("Enter a Number that corresponds to the name you want to Display");
    int number = sc.nextInt();

    System.out.println(name[number]);
  }
}
