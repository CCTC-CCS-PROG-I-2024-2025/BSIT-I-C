import java.util.Scanner;

public class CAJUELAN_FINALS_PROJECT {
    public static void main(String[] args) {
        // Categories and budget logs
        String[] categories = {"Food", "Transportation", "Bills", "Others"};
        double[] totalExpenses = new double[categories.length];
        double totalIncome = 0, totalSavings = 0;
        
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to Cajuelan's Budget Tracker!");
        
        while (true) {
            // Display menu
            System.out.println("\nChoose an action:");
            System.out.println("1. Add Income");
            System.out.println("2. Log Expense");
            System.out.println("3. View Daily Summary");
            System.out.println("4. View Weekly Summary");
            System.out.println("5. Exit");
            
            System.out.print("Enter your choice (1-5): ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1: // Add Income
                    System.out.print("Enter income amount: ");
                    double income = scanner.nextDouble();
                    totalIncome += income;
                    System.out.println("Income added successfully!");
                    break;

                case 2: // Log Expense
                    System.out.println("\nAvailable Categories:");
                    for (int i = 0; i < categories.length; i++) {
                        System.out.printf("%d. %s%n", i + 1, categories[i]);
                    }
                    System.out.print("Choose a category (1-4): ");
                    int categoryIndex = scanner.nextInt() - 1;

                    if (categoryIndex >= 0 && categoryIndex < categories.length) {
                        System.out.print("Enter expense amount: ");
                        double expense = scanner.nextDouble();
                        totalExpenses[categoryIndex] += expense;
                        System.out.println("Expense logged successfully!");
                    } else {
                        System.out.println("Invalid category choice!");
                    }
                    break;

                case 3: // View Daily Summary
                    System.out.println("\n--- Daily Summary ---");
                    double dailyTotal = 0;
                    for (int i = 0; i < categories.length; i++) {
                        if (totalExpenses[i] > 0) {
                            System.out.printf("%s: $%.2f%n", categories[i], totalExpenses[i]);
                            dailyTotal += totalExpenses[i];
                        }
                    }
                    System.out.printf("Total Daily Expenses: $%.2f%n", dailyTotal);
                    break;

                case 4: // View Weekly Summary
                    System.out.println("\n--- Weekly Summary ---");
                    double weeklyTotal = 0;
                    for (int i = 0; i < categories.length; i++) {
                        System.out.printf("%s: $%.2f%n", categories[i], totalExpenses[i]);
                        weeklyTotal += totalExpenses[i];
                    }
                    totalSavings = totalIncome - weeklyTotal;
                    System.out.printf("Total Income: $%.2f%n", totalIncome);
                    System.out.printf("Total Weekly Expenses: $%.2f%n", weeklyTotal);
                    System.out.printf("Total Savings: $%.2f%n", totalSavings);
                    break;

                case 5: // Exit
                    System.out.println("Thank you for using Cajuelan's Budget Tracker! Goodbye!");
                    scanner.close();
                    return;

                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }
}