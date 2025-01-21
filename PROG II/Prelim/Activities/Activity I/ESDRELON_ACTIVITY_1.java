import java.util.Scanner;

class ESDRELON_ACTIVITY_I {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] names = new String[5];

        for (int i = 0; i < 5; i++) {
            System.out.println("enter name " + (i + 1) + ":");
            names[i] = sc.nextLine();
        }
        System.out.println("enter a number that correspond to the name you want to display:");
        int number = sc.nextInt();

        System.out.println(names[number - 1]);

    }
}
