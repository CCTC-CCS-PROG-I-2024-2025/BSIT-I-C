import java.util.Scanner;

class CABURNAY_ACTIVITY_I {
    public static void main(String[] args) {
        Scanner sc = new Scanner ( System.in);
        
        String[] names = new String[5]
        
        for(int i = 0; i < 5; i++)
        System.out.println("Enter a number that corresponds to the names you want to display:");
        int number = sc.nextInt();

        System.out.println(names[number]);
    }

}
