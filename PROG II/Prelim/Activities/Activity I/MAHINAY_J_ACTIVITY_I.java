import java.util.Scanner;
public class MAHINAY_J_ACTIVITY_I{
public static void main(String [] args) {
    Scanner sc = new Scanner (System.in);
    
String [] names = new String[5];
for ( int i = 0 ; i < 5; i++) {
    System.out.println("Enter name" + (i+1) + ":");

    names [i] = sc.nextLine();
}
 System.out.println("Enter a number of corresponds name number:");

 int num = sc.nextInt();
 System.out.println(names [num-1]);
}

}