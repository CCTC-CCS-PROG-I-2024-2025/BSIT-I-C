import java.util.Scanner; 

class BUBULI_ACTIVITY_I {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String [] names=new String[5];

        for(int i =0; i<5; i++) {
            System.out.println("ENTER NAME" + (i+1) + ":");
            names [i] = sc.nextLine();
        }
        System.out.println("ENTER THE USERS NUMBER:");
        int number = sc.nextInt();

        System.out.println(names[number - 1]); 

        }


    }
