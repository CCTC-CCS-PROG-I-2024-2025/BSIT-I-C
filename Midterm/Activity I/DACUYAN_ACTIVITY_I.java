import java.util.Scanner;

class DACUYAN_ACTIVITY_I {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter the name of the item: ");
        String color = sc.nextLine();

        switch(color){
            case "pink":
            System.out.println("box #1");
            break;
            case "purple":
            System.out.println("box #2");
            break;
            case "violet":
            System.out.println("box #3");
            break;
        }
    }
}