import java.util.Scanner;

public class CANEDO_D_ACTIVITY_I {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the color:");
        String color = sc.nextLine();

        switch (color) {
            case "red":
            System.out.println("box #1");
            break;
            case "green":
            System.out.println("box #2");
            break;
            case "black":
            System.out.println("box #3");
            break;
        }
    }
}
