import java.util.Scanner;

public class CAJUELAN_ACTIVITY_III {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of seconds: ");
        int seconds = input.nextInt();
        input.close();

        while (seconds >= 0) {
            System.out.println(seconds);
            seconds--;
        }
    }
}