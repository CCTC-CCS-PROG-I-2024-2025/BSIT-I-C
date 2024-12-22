import java.util.Scanner;

public class CANTORNE_FINAL_PROJECT {
    static String name = "Joshua Cantorne";

    public static void main(String[] args) {
        opening();
    }
    static void opening(){
        System.out.println("");
        System.out.println("---------WELCOME to ONLINE SCHOOL CANTEEN----------");
        System.out.println("");
        System.out.println("1.Log In");
        System.out.println("2.Register");
        System.out.println("3.Report some Bug");
        System.out.println("4.Exit");
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of your choice: ");
        int choice = sc.nextInt();
        
        switch(choice){
            case 1:
            signIn();
            break;
            case 2:
            System.out.println(" ");
            System.out.println("This will be available soon");
            opening();
            break;
            case 3:
            System.out.println(" ");
            System.out.println("Ayaw cgeg reklamo dha kung naay bug lisod biya kaau ni himoon ha. JWK hahaha");
            opening();
            break;
            case 4: 
            System.out.println("Exiting...");
            System.exit(0);
            default:
            System.out.println("Invalid choice");
            sc.close();
        }
        
    }
    static void signIn(){
        String studentId = "20242039";
        String password = "JUly1114";
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your ID number: ");
        String userEmail = sc.nextLine();
        
        if(!userEmail.equals(studentId)){
            System.out.println("Invalid ID number. Please try again ");
            signIn();
            sc.close();
            return;

        }
        for(int attempts =0; attempts<3; attempts++){
            System.out.print("Password: ");
            String userPassword = sc.nextLine();

            if(userPassword.equals(password)){
                welcome();
            }
            else{
                System.out.println("Wrong password. atttempts left: " + (2-attempts));
            }
        }
        System.out.println("Too many attepmts... Try again later");
        opening();
        sc.close();                                                                                                                             
    }
    static void welcome(){
        System.out.println(" ");
        System.out.println("Welcome "+ name );
        System.out.println(" ");
        Scanner sc = new Scanner(System.in);
        System.out.println("1.Junkfoods");
        System.out.println("2.biscuits");
        System.out.println("3.Other");
        System.out.println("4.Exit");
        System.out.print("Select what kind food you want to order: ");
        int choice = sc.nextInt();

        switch(choice){
            case 1:
            list();
            break;
            case 2:
            System.out.println(" ");
            biscuits();
            break;
            case 3:
            System.out.println(" ");
            System.out.println("Available soon");
            welcome();
            break;
            case 4:
            System.out.println("");
            opening();
            default:
            System.out.println("Invalid choice");
            welcome();

            sc.close();
        }
    }
    static void list(){
        System.out.println(" ");
        System.out.println("Food List");
        System.out.println(" ");
        String [][] food = {
            {"0.Fish Cracker: 9PHP", "1.Rainbee: 9 PHP", "2.Cracklings: 9 PHP "},
            {"3.Piatos: 16 PHP", "4.Patata: 9PHP", "5.Nova: 16PHP"},
            {"6.Oishi 9 PHP", "7.Seafoods: 9 PHP", "8.Boogyman: 9 PHP"}
        };
        for(int f =0; f<food.length; f++ ){
            for(int i=0; i<food.length; i++){
                System.out.println(food[f][i]+ " ");
            }
            
        }
        String [] foodList = new String [9];
        foodList [0] = "Fish Cracker";
        foodList [1] = "Rainbee";
        foodList [2] = "Cracklings";
        foodList [3] = "Piatos";
        foodList [4] = "Patata";
        foodList [5] = "Nova";
        foodList [6] = "Oishi";
        foodList [7] = "Seafoods";
        foodList [8] = "Boogyman";

        int [] price = new int [9];
        price [0] = 9;
        price [1] = 9;
        price [2] = 9;
        price [3] = 16;
        price [4] = 9;
        price [5] = 16;
        price [6] = 9;
        price [7] = 9;
        price [8] = 9;

        Scanner sc = new Scanner(System.in);
        System.out.println("");
        System.out.println("");
        System.out.println("minimum order 2 kind of food and maximum of 4");
        System.out.println("choice food in the list");
        System.out.println("");
        System.out.print("Unsay imo?: ");
        int price0 = sc.nextInt();
        System.out.println("");

        System.out.print("pila kabook?: ");
        int numFood = sc.nextInt();
        System.out.println("");

        System.out.print("Unsa pa gyd: ");
        int price1 = sc.nextInt();
        System.out.println("");

        System.out.print("pila kabook?: ");
        int numFood1 = sc.nextInt();
        System.out.println("");

        System.out.print("enter 1 if that all you want to order and 2 to continue: ");
        int stop = sc.nextInt();
        System.out.println("");

        if(stop <=1){
            int total = price[price0]*=numFood;
            int total1 = total+=price[price1]*=numFood1;
            System.out.println("");
            System.out.println("  __________RECIEPT___________    ");
            System.out.println("");
            System.out.println(numFood + " " + foodList[price0]);
            System.out.println(numFood1 + " " + foodList[price1]);
            System.out.println("Total = " + total1);
            System.out.println("----------------------------------");
            payment();
        }
        else if(stop>1){
            System.out.print("Unsa pa?: ");
            int price2 = sc.nextInt();
            System.out.println("");

            System.out.println("Pila kabook?: ");
            int numFood2 = sc.nextInt();
            System.out.println("");

            System.out.println("Unsa pa gyd?: ");
            int price3 = sc.nextInt();
            System.out.println(" ");
            
            System.out.println("Pila kabook?: ");
            int numFood3 = sc.nextInt();

            int total = price[price0]*=numFood;
            int total1 = total+=price[price1]*=numFood1;
            int total2 = total1+=price[price2]*=numFood2;
            int total3 = total2+=price[price3]*=numFood3;
            System.out.println("  _________RECIEPT__________   ");
            System.out.println(" ");
            System.out.println(numFood + " " + foodList[price0]);
            System.out.println(numFood1 + " " + foodList[price1]);
            System.out.println(numFood2 + " " + foodList[price2]);
            System.out.println(numFood3 + " " + foodList[price3]);
            System.out.println("TOTAL = " + total3);
            System.out.println("-------------------------------------");
            payment();
            sc.close();
        }

    }
    static void payment(){
        System.out.println("!!!-Proceed to school canteen to pay you order-!!!");
        System.out.println("");
        welcome();
    }
    static void biscuits(){
        System.out.println(" ");
        System.out.println("1.Rebisco");
        System.out.println("2.Sky Flakes");
        System.out.println("3.Fita");
        System.out.println("4.Magic Flakes");
        System.out.println("5.Exit");
        Scanner sc = new Scanner(System.in);
        System.out.println("");
        int choice = sc.nextInt();

        switch(choice){
            case 1:
            System.out.println(" ");
            System.out.println("Out of stuck");
            biscuits();
            break;
            case 2:
            System.out.println(" ");
            System.out.println("Out of stuck");
            biscuits();
            break;
            case 3:
            System.out.println(" ");
            System.out.println("Out of stuck");
            biscuits();
            break;
            case 4:
            System.out.println(" ");
            System.out.println("Out of stuck");
            biscuits();
            break;
            case 5:
            welcome();
            break;
            default:
            System.out.println(" ");
            System.out.println("Invalid choice");
            biscuits();
        }
        sc.close();
    }
}

