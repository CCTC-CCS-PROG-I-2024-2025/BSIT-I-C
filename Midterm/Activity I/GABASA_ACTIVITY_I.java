import java.util.Scanner;
public class GABASA_ACTIVITY_I {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter the color of the number:");
        String color = sc.nextLine();
        
        switch(color) {
            
            case "red":
            System.out.println(1);
            break;
            case "green":
            System.out.println(2);
            break;
            case "black":
            System.out.println(3);
            
            sc.close();
        }
    }
}