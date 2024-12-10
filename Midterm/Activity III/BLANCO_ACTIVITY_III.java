import java.util.Scanner;

 class BLANCO_ACTIVITY_III {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number:");
        int number = sc.nextInt();
        while (number >= 0) {
            System.out.println(number);
            number--;
        }
        }

}