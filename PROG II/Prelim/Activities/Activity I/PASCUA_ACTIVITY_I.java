import java.util.Scanner;
class PASCUA_ACTIVITY_I{
    public static void main(String[] args){
    Scanner sc = new Scanner (System.in);
    String [] names = new String [5];

    System.out.println("Enter the name you would like to have");

    for (int i= 0; i < 4; i++){
         System.out.println("Enter name" + (i + 1) + ":");
         
         names [i] = sc.nextLine();

        }
        System.out.println("Enter a number that corresponds to the name you want to display");
        int num = sc.nextInt();

        System.out.println(names[num - 1]);
    }
}