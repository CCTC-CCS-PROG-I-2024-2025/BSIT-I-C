import java.util.Scanner;

public class AVILES_FINAL {

    static int balance = 400;
     public static void main(String[] args) {
        intro();
        
    } 
     static void welcome(){
        System.out.println("1.Check balance ");
        System.out.println("2.Deposit");
        System.out.println("3.Withdraw");
        System.out.println("4.Exit");
        System.out.println("    ");
        System.out.print("Enter your choice: ");
        Scanner sc = new Scanner(System.in);
        int choice = sc.nextInt();
        switch(choice){
            case 1:
                checkBalance();
                break;
            case 2:
                deposit();
            case 3:
                System.out.println("");
                System.out.println("this feature will be available soon");
                welcome();
                break;
            case 4:
                intro();
                break;
                default:
                System.out.println("");
                System.out.println("Invalid choice!!");
                welcome();
        }
        sc.close();
    }
     static void checkBalance(){
        System.out.println("Current Balance: PHP " + balance);
        Scanner sc = new Scanner(System.in);
        System.out.println("");
        System.out.print("enter 1 to exit: ");
        int num = sc.nextInt();
        switch (num) {
            case 1:
                System.out.println("");
                welcome();
                break;
            case 2:
            default:
                System.out.println("enter 1 to exit");
                checkBalance();
                
        }
        sc.close();
    }
     static void deposit(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter amount to deposit: ");
        int amount = sc.nextInt();

            balance += amount;
            System.out.println("");
            System.out.println("New balance: PHP " + balance);
            System.out.println("");
            welcome();
            sc.close();
    }
    static void intro(){
        System.out.println("");
        System.out.println("<<<<<<<<<<<<-Welcome->>>>>>>>>>>>>");
        System.out.println("1.Log in");
        System.out.println("2.Register new Card");
        System.out.println("3.Exit");
        System.out.println("______________________");
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your choice: ");
        int choice = sc.nextInt();

        switch(choice){
            case 1:
            login();
            break;
            case 2:
            System.out.println("This will be available soon");
            System.out.println("");
            intro();
            break;
            case 3:
            System.out.println("Exiting...");
            System.exit(0);
            sc.close();
            return;
            default:
            System.out.println(" ");
            System.out.println("choice again");
            intro();
        }
        sc.close();
    }
     static void login(){
        String pin = "08192023";
        Scanner sc = new Scanner(System.in);

        for(int attempts = 0; attempts<=3; attempts++){
            System.out.println("");
            System.out.print("Pin: ");
            String userPin = sc.nextLine();
            if(userPin.equals(pin)){
                System.out.println("");
                welcome();
                sc.close();
            }else{
                System.out.println("Wrong password. Attempts left: " + (2-attempts));
            }

        }
        System.out.println("Too many attempts exiting...");
        intro();
        sc.close();
    }
}