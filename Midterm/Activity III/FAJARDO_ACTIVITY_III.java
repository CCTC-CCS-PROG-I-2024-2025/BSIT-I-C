import java.util.Scanner;

 class FAJARDO_ACTIVITY_VI {
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