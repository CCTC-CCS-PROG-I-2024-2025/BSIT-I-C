import java.util.Scanner;

public class CONSOLACION_ACTIVITY_III{
    public static void main(String[] args) {
        Scanner scanner = new
        Scanner (System.in);
        System.out.println("Emter the number of seconds:");
        int seconds = scanner.nextInt();
        while (seconds >= 0){
            System.out.println(seconds);
            seconds --;
        }
    }
}