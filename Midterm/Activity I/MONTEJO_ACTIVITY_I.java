import java.util.Scanner;


public class MONTEJO_ACTIVITY_I{

    public static void main(String[] args) {
        try (Scanner sc = new Scanner (System.in)) {
            System.out.println("Enter a color (cyan, gold , black):");
            String color = sc. nextLine();

            switch (color) {
                case "red":
                System.out.println(1);
                break;
                case "green":
                System.out.println(2);
                    break;
                    case "black":
                    System.out.println(3);

                    break;
            
                default:
                    System.out.println("Invalid color");
            }
        }
    }
}