import java.util.Random;
import java.util.Scanner;

public class CONSOLACION_FINAL_PROJECT {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int secretNumber = random.nextInt(100) + 1; // Generate a random number between 1 and 100
        int guess;
        int attempts = 0;
        int maxAttempts = 10; // You can adjust the number of attempts

        System.out.println("Welcome to the Number Guessing Game!");
        System.out.println("I've chosen a number between 1 and 100. Can you guess it?");

        while (attempts < maxAttempts) {
            System.out.print("Enter your guess: ");
            guess = scanner.nextInt();
            attempts++;

            if (guess < secretNumber) {
                System.out.println("Too low! Try again.");
            } else if (guess > secretNumber) {
                System.out.println("Too high! Try again.");
            } else {
                System.out.println("Congratulations! You guessed it in " + attempts + " attempts.");
                break; // Exit the loop if the guess is correct
            }

            if (attempts == maxAttempts) {
                System.out.println("You ran out of attempts. The secret number was: " + secretNumber);
            }
        }

        scanner.close();
    }
}