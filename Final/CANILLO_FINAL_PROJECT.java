import java.util.Scanner;
    public class STYLE{
        static Scanner scan = new Scanner(System.in);
        static double total;
        static double pay;
        static double change;
        static int choice;
        static int order;
        static int price;
        public static void main(String[] args){
       
        do{
            System.out.println("Welcome to STYLE");
            System.out.println("________________________________");
            System.out.println("-------Choose a Style-------");
            System.out.println("-[1]Tshirt");
            System.out.println("-[2]Pants");
            System.out.println("-[3]Dress");
            System.out.println("-[4]Others");
            System.out.println("-[5]Pay");
            System.out.println("-[0]Exit");
            System.out.println("^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^");
            System.out.print("Enter your choice: ");
        choice = scan.nextInt();
       
            switch(choice){
            case 1: Tshirt();
                break;
            case 2: Pants();
                break;
            case 3: Dress();
                break;
            case 4: others();
                break;
            case 5: pay();
                break;
            case 0: System.exit(0);
            default:
            System.out.println("");
            System.out.println("Invalid!!!");
            System.out.println("");
            }
        }while(choice !=5);
    }
   
        public static void Tshirt(){
            System.out.println("");
    System.out.println("+++++++++++++++++++++++++++");
    System.out.println("TSHIRT");
    System.out.println("");
    System.out.println("1. POLO SHIRT = (220 PESOS)");
    System.out.println("2. TANK TOPS = (120 PESOS)");
    System.out.println("3. JERSEY = (400 PESOS)");
    System.out.println("");
    System.out.println("+++++++++++++++++++++++++++");
                       
                        System.out.println("");
            System.out.print("Enter Your Choice: ");
        order = scan.nextInt();
            switch(order){
                case 1: shirt1();
                    break;
                case 2: shirt2();
                    break;
                case 3: shirt3();
                    break;
                default:
            System.out.println("");
            System.out.println("Invalid!!!");
            System.out.println("");
            }
        }
        public static void shirt1(){
            System.out.println("");
            System.out.println("You choose (POLO SHIRT)");
            System.out.print("Enter price: ");
            price = scan.nextInt();
            total = total + (price = 220);
            System.out.println("Your total is "+total+" PESOS");
        }
        public static void shirt2(){
            System.out.println("");
            System.out.println("You choose (TANK TOPS)");
            System.out.print("Enter price: ");
            price = scan.nextInt();
            total = total + (price = 120);
            System.out.println("Your total is "+total+" PESOS");
        }
        public static void shirt3(){
            System.out.println("");
            System.out.println("You choose (JERSEY)");
            System.out.print("Enter price: ");
            price = scan.nextInt();
            total = total + (price = 400);
            System.out.println("Your total is "+total+" PESOS");
                        System.out.println("");
        }
       
        public static void Pants(){
            System.out.println("");
    System.out.println("+++++++++++++++++++++++++++");
    System.out.println("PANTS");
    System.out.println("");
    System.out.println("1. CARGO PANTS = (350 PESOS)");
    System.out.println("2. LEGGINGS = (100 PESOS)");
    System.out.println("3. JEANS = (380 PESOS)");
    System.out.println("");
    System.out.println("+++++++++++++++++++++++++++");
                            System.out.println("");
            System.out.print("Enter Your Choice: ");
            order = scan.nextInt();
            switch(order){
                case 1: pants1();
                    break;
                case 2: pants2();
                    break;
                case 3: pants3();
                    break;
                default:
            System.out.println("");
            System.out.println("Invalid!!!");
            System.out.println("");
            }
        }
        public static void pants1(){
            System.out.println("");
            System.out.println("You choose (CARGO PANTS)");
            System.out.print("Enter price: ");
            price = scan.nextInt();
            total = total + (price = 350);
            System.out.println("Your total is "+total+" PESOS");
        }
        public static void pants2(){
            System.out.println("");
            System.out.println("You choose (LEGGINGS)");
            System.out.print("Enter price: ");
            price = scan.nextInt();
            total = total + (price = 100);
            System.out.println("Your total is "+total+" PESOS");
        }
        public static void pants3(){
            System.out.println("");
            System.out.println("You choose (JEANS)");
            System.out.print("Enter price: ");
            price = scan.nextInt();
            total = total + (price = 380);
            System.out.println("Your total is "+total+" PESOS");
                        System.out.println("");
        }
       
        public static void Dress(){
            System.out.println("");
    System.out.println("+++++++++++++++++++++++++++");
    System.out.println("DRESS");
    System.out.println("");
    System.out.println("1. NIGTH DRESS = (500 PESOS)");
    System.out.println("2. MINI DRESS = (450 PESOS)");
    System.out.println("3. SILK DRESS = (300 PESOS)");
    System.out.println("");
    System.out.println("+++++++++++++++++++++++++++");
                            System.out.println("");
            System.out.print("Enter Your Choice: ");
            order = scan.nextInt();
            switch(order){
                case 1: dress1();
                    break;
                case 2: dress2();
                    break;
                case 3: dress3();
                    break;
                default:
            System.out.println("");
            System.out.println("Invalid!!!");
            System.out.println("");
            }
        }
       
        public static void dress1(){
        System.out.println("");
            System.out.println("You choose (NIGTH DRESS)");
            System.out.print("Enter price: ");
            price = scan.nextInt();
            total = total + (price = 500);
            System.out.println("Your total is "+total+" PESOS");  
        }
       
        public static void dress2(){
        System.out.println("");
            System.out.println("You choose (MINI DRESS)");
            System.out.print("Enter price: ");
            price = scan.nextInt();
            total = total + (price = 450);
            System.out.println("Your total is "+total+" PESOS");  
        }
       
        public static void dress3(){
        System.out.println("");
            System.out.println("You choose (SILK DRESS)");
            System.out.print("Enter price: ");
            price = scan.nextInt();
            total = total + (price = 300);
            System.out.println("Your total is "+total+" PESOS");  
                        System.out.println("");
        }

        public static void others(){
            System.out.println("");
    System.out.println("+++++++++++++++++++++++++++");
    System.out.println("Others");
    System.out.println("");
    System.out.println("1. BIKINI = (300 PESOS)");
    System.out.println("2. PAJAMA PAIR = (420 PESOS)");
    System.out.println("3. UNDERWEAR = (120 PESOS)");
    System.out.println("");
    System.out.println("+++++++++++++++++++++++++++");
                        System.out.println("");
            System.out.print("Enter Your Choice: ");
            order = scan.nextInt();
            switch(order){
                case 1: other1();
                   break;
                case 2: other2();
                    break;
                case 3: other3();
                    break;
                default:
            System.out.println("");
            System.out.println("Invalid!!!");
            System.out.println("");
            }
        }
       
        public static void other1(){
        System.out.println("");
            System.out.println("You choose (BIKINI)");
            System.out.print("Enter price: ");
            price = scan.nextInt();
            total = total + (price = 300);
            System.out.println("Your total is "+total+" PESOS");  
        }
       
        public static void other2(){
        System.out.println("");
            System.out.println("You choose (PAJAMA PAIR)");
            System.out.print("Enter price: ");
            price = scan.nextInt();
            total = total + (price = 420);
            System.out.println("Your total is "+total+" PESOS");  
        }
       
        public static void other3(){
        System.out.println("");
            System.out.println("You choose (UNDERWEAR)");
            System.out.print("Enter price: ");
            price = scan.nextInt();
            total = total + (price = 120);
            System.out.println("Your total is "+total+" PESOS");
                        System.out.println("");
        }

        public static void pay(){
        System.out.println("");
            System.out.println("Your total amount due is "+total+" PESOS");
            System.out.print("Enter Payment: ");
            pay = scan.nextInt();
            change = pay - total;
            System.out.println("");
            System.out.println("Your change is "+change+" PESOS");
            System.out.println("Thank you for buying in SHEENS");
            System.out.println("Please some again!");
            System.out.println("");
            
            int Exit = scan.nextInt();
            if (Exit == 0){
                System.out.println("GOOD BYE!!!");
            } else {
                System.exit(0);
            }
        }
        }
    
        