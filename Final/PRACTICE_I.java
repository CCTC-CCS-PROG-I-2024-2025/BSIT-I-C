import java.util.Scanner;

public class PRACTICE_I {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your full name: ");
        // capital first letter
        String name = sc.nextLine();
        System.out.print("Enter your age: ");
        int age = sc.nextInt();
        System.out.print("Enter your height: ");
        //example 1.60 meter 
        double height = sc.nextDouble();
        System.out.print("Enter your weight: ");
        // don't forget the decimal number
        double weight = sc.nextDouble();
        
        System.out.println( "Your are: " + name + " " + age + " years old");
        System.out.println( "height: "+ height);
        System.out.println("weight: " + weight);
        
        double bmi = weight/(height*height);
        System.out.println("Your BMI: " + bmi);

        if(bmi<=18.4){
            System.out.println("Underweight");
        }
        else if(bmi>=18.5 && bmi<=24.9){
            System.out.println("Normal");
        }
        else if(bmi>=25 && bmi<=39.9){
            System.out.println("Overweight");
        }
        else if(bmi>=40){
            System.out.println("Obese");
        }
        
        /*System.out.print("enter a number of month you are born: ");
        int num = sc.nextInt();

        switch(num){
            case 1:
            System.out.println("Monday");
            break;
            case 2:
            System.out.println("Tuesday");
            break;
            case 3:
            System.out.println("Wednesday");
            break;
            case 4:
            System.out.println("Thursday");
            break;
            case 5:
            System.out.println("Friday");
            break;
            case 6:
            System.out.println("Saturday");
            break;
            case 7:
            System.out.println("Sunday");
            
        }*/ 
    }
}
