import java.util.Scanner;

public class CAMORO_FINALS_PROJECT {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to Hogwarts House Chooser!");
        System.out.println("Answer the following questions to find your house.\n");

        // Variables to track points for each house
        int gryffindor = 0;
        int hufflepuff = 0;
        int ravenclaw = 0;
        int slytherin = 0;

        // Question 1
        System.out.println("Question 1: What quality do you value most?");
        System.out.println("1. Bravery");
        System.out.println("2. Loyalty");
        System.out.println("3. Intelligence");
        System.out.println("4. Ambition");
        int choice = scanner.nextInt();

        if (choice == 1) {
            gryffindor++;
        } else if (choice == 2) {
            hufflepuff++;
        } else if (choice == 3) {
            ravenclaw++;
        } else if (choice == 4) {
            slytherin++;
        }

        // Question 2
        System.out.println("\nQuestion 2: What is your favorite activity?");
        System.out.println("1. Exploring new places");
        System.out.println("2. Helping others");
        System.out.println("3. Reading and learning");
        System.out.println("4. Strategizing and planning");
        choice = scanner.nextInt();

        if (choice == 1) {
            gryffindor++;
        } else if (choice == 2) {
            hufflepuff++;
        } else if (choice == 3) {
            ravenclaw++;
        } else if (choice == 4) {
            slytherin++;
        }

        // Question 3
        System.out.println("\nQuestion 3: Which animal do you feel most connected to?");
        System.out.println("1. Lion");
        System.out.println("2. Badger");
        System.out.println("3. Eagle");
        System.out.println("4. Snake");
        choice = scanner.nextInt();

        if (choice == 1) {
            gryffindor++;
        } else if (choice == 2) {
            hufflepuff++;
        } else if (choice == 3) {
            ravenclaw++;
        } else if (choice == 4) {
            slytherin++;
        }

        // Determine the house with the highest points
        String house;
        if (gryffindor >= hufflepuff && gryffindor >= ravenclaw && gryffindor >= slytherin) {
            house = "Gryffindor";
        } else if (hufflepuff >= gryffindor && hufflepuff >= ravenclaw && hufflepuff >= slytherin) {
            house = "Hufflepuff";
        } else if (ravenclaw >= gryffindor && ravenclaw >= hufflepuff && ravenclaw >= slytherin) {
            house = "Ravenclaw";
        } else {
            house = "Slytherin";
        }

        // Display the result
        System.out.println("\nCongratulations! You have been sorted into " + house + "!");
        scanner.close();
    }
}