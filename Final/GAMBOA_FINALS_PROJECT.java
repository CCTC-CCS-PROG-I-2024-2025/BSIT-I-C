import java.util.Scanner;

public class GAMBOA_FINALS_PROJECT{

    public static void main(String[] args) {
        // Initialize variables
        Scanner scanner = new Scanner(System.in);
        String playerName;
        int playerAge;
        int numLevels;
        double[] levelsScores;
        double totalScore = 0;
        char grade;

        // Get player information
        System.out.print("Enter player name: ");
        playerName = scanner.nextLine();

        System.out.print("Enter player age: ");
        playerAge = scanner.nextInt();

        // Get the number of levels
        System.out.print("Enter the number of levels: ");
        numLevels = scanner.nextInt();

        // Create an array to store levels scores 
        levelsScores = new double[numLevels];

        // Get Levels scores from the user 
        System.out.println("Enter scores for each levels:");
        for (int i = 0; i < numLevels; i++) {
            System.out.print("Level " + (i + 1 ) + ": ");
            levelsScores[i] = scanner.nextDouble();
            totalScore += levelsScores[i];
        }
   
        // Calculate average score 
        double averageScore = totalScore / numLevels;

        // Determine the grade
        if (averageScore >= 10){
            grade = 'A';
        } else if (averageScore >= 85) {
            grade = 'B';
        } else if (averageScore >= 65) {
            grade = 'C';
        } else if (averageScore >= 45) {
            grade = 'D';
        } else  {
            grade = 'F';
        }

        // Print player information and grade
        System.out.println("/nPlayer Information:");
        System.out.println("Name: " + playerName);
        System.out.println("Age: " + playerAge);
        System.out.println("Total Score: " + averageScore);
        System.out.println("Average Score: " + averageScore);
        System.out.println("Grade: " + grade) ;

        scanner.close();
    }
}