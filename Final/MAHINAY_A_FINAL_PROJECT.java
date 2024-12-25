import java.util.Scanner;

public class MAHINAY_A_FINAL_PROJECT {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        String bookTitle;
        boolean isCheckedOut = false // Variable to track book status

        System.out.println("Enter the title of the book:");
        bookTitle = input.nextLine(); // Takes user input for book title

        // Stimulate checking out a book. Conditional Statement
        System.out.println("Is the book checked out? (true/false):");
        isCheckedOut = input.nextBoolean(); //Takes user input for checkout status 

        if (isCheckedOut) {
            System.out.println(bookTitle + "is currently checked out.");
        } else {
            System.out.println(bookTitle + "is available.");
        }

        // Stimulate a loop for multiple book checks. While Loop.
        int numBooks = 0;
        System.out.println("How many books do you want to check?" :);
        numBooks = input.nextInt();
        input.nextLine(); // Consume newline left by nextInt()

        for (int i = 0; i < numBooks; i++) { // For loop
        System.out.println("Enter title of book" + (i+1) + ": ");
        bookTitle = input.nextLine();
        System.out.println("Book '" + bookTitle + "' added.");

        }

        System.out.println("\nLibrary Check-in/Check-out Complete.");
        input.close();
        
    }
}
    