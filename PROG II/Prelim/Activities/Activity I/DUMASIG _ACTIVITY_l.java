import java.util.Scanner;

class  DUMASIG_ACTIVITY_I{

    public static void main(String[] args){

Scanner sc = new Scanner(System.in);


        String[] names = new String [5];

        for(int i = 0; i < 5; i++){
            System.out.println("Enter name" + (i + 1) + ":");

            names [i] = sc.nextLine();

        }


        System.out.println("Enter Number 0-4");
        int number = sc.nextInt();
        System.out.println(names[number]);
    }
}