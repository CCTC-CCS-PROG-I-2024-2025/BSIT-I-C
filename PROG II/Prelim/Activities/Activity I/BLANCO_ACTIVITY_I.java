import java.util.Scanner;

     class BLANCO_ACTIVITY_I{
        public static void main (String[] args){
            Scanner sc = new Scanner(System.in);
            
            String[] names = new String [5];

            for(int i=0; i < 5; i++){
                
                System.out.print("Enter name " + ( i+1) + ":" );
                
                names[i]= sc.nextLine();
            }
            System.out.print("Enter a number of the name you want to display");
            
            int number = sc.nextInt();
            
            System.out.print(names[number-1]);

            sc.close();
        }
    }
