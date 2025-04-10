import java.util.Scanner;

public class MONTEJO_FINAL_PROJECT {
    static String name = "Xavier Francis Montejo";

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
            System.out.println("Loading...");
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
        String studentId = "2024006633";
        String password = "March24";
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
        System.out.println("1.Snacks");
        System.out.println("2.Drinks");
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
            Drinks();
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
            {"0.CalCheese: 15 PHP", "1.Fita: 10 PHP", "2.Fudgeebar: 10 PHP "},
            {"3.Piatos: 20 PHP", "4.Fishcracker: 10 PHP", "5.Nova: 15PHP"},
            {"6.Oishi 10 PHP", "7.Seafoods: 10 PHP", "8.Richoco: 15 PHP"}
        };
        for(int f =0; f<food.length; f++ ){
            for(int i=0; i<food.length; i++){
                System.out.println(food[f][i]+ " ");
            }
            
        }
        String [] foodList = new String [9];
        foodList [0] = "CalCheese";
        foodList [1] = "Fita";
        foodList [2] = "Fudgeebar";
        foodList [3] = "Piatos";
        foodList [4] = "Fishcracker";
        foodList [5] = "Nova";
        foodList [6] = "Oishi";
        foodList [7] = "Seafoods";
        foodList [8] = "Richcoco";

        int [] price = new int [9];
        price [0] = 15;
        price [1] = 10;
        price [2] = 10;
        price [3] = 20;
        price [4] = 10;
        price [5] = 15;
        price [6] = 10;
        price [7] = 10;
        price [8] = 15;

        Scanner sc = new Scanner(System.in);
        System.out.println("");
        System.out.println("");
        System.out.println("minimum order of 2 snacks and maximum of 4");
        System.out.println("choice food in the list");
        System.out.println("");
        System.out.print("Choose ples: ");
        int price0 = sc.nextInt();
        System.out.println("");

        System.out.print("How much u want?: ");
        int numFood = sc.nextInt();
        System.out.println("");

        System.out.print("What elsa: ");
        int price1 = sc.nextInt();
        System.out.println("");

        System.out.print("How much more u want?: ");
        int numFood1 = sc.nextInt();
        System.out.println("");

        System.out.print("press 1 if all and press 2 to continue: ");
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
        System.out.println("!!!-Proceed to school canteen to complete your order-!!!");
        System.out.println("");
        welcome();
    }
    static void Drinks(){
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
            System.out.println("Out of shock");
            Drinks();
            break;
            case 2:
            System.out.println(" ");
            System.out.println("Out of shock");
            Drinks();
            break;
            case 3:
            System.out.println(" ");
            System.out.println("Out of shock");
            Drinks();
            break;
            case 4:
            System.out.println(" ");
            System.out.println("Out of shock");
            Drinks();
            break;
            case 5:
            welcome();
            break;
            default:
            System.out.println(" ");
            System.out.println("Invalid choice");
            Drinks();
        }
        sc.close();
    }
}
