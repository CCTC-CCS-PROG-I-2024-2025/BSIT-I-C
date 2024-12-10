package MIDTERM_CANILLO;
import java.util.Scanner;

public class CANILLO_ACTIVITY_I {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the color og the item:");
        String color = sc.nextLine();

        switch (color) {
            case "red":
                System.err.println(1);
                break;
            case "green":
                System.out.println(2);
                break;
            case "blue":
                System.out.println(3);
                break;
        }
    }
}
