import java.util.Scanner;

public class EVANGELISTA_ACTIVITY_I {
    public static void main (String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("------------------");
        System.out.println("Red Green Black");
        System.out.println("------------------");
        System.out.println("Enter a Color:");
        String color = sc.nextLine();
            switch (color) {
                case "Red":
                    System.out.println("Box #1");
                    break;
                case "Green":
                    System.out.println("Box #2");
                    break;
                case "Black":
                    System.out.println("Box #3");
                    break;
            
                default:
                    System.out.println("Enter a valid color");
                    break;
            }
        sc.close();
    }
}