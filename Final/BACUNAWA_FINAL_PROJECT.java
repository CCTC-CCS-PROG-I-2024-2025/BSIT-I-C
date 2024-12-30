import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class BACUNAWA_FINAL_PROJECT {
    public class PaymentSystemSimulator {

    private static Map<String, String> paymentMethods = new HashMap<>();

    public static void main(String[] args) {
        //Simulate available methods
        paymentMethods.put("credit_card", "Credit Card");
        paymentMethods.put("paypal", "PayPal");
        paymentMethods.put("bank_transfer", "Bank Transfer");


        Scanner scanner = new Scanner(System.in);

        String selectedMethod = choosePaymentMethod(scanner);

        if (selectedMethod != null) {
            processPayment(scanner, selectedMethod, 100.00);
        }

        scanner.close();
    }


    public static String choosePaymentMethod(Scanner scanner) {
        System.out.println("Available payment methods:");
        for (String method : paymentMethods.keySet()) {
            System.out.println("- " + paymentMethods.get(method));
        }

        System.out.print("Enter your preferred payment method: ");
        String selectedMethod = scanner.nextLine().trim().toLowerCase();

        if (paymentMethods.containsKey(selectedMethod)) {
            return selectedMethod;
        } else {
            System.out.println("Invalid payment method.");
            return null;
        }
    }

    public static void processPayment(Scanner scanner, String method, double amount) {
        switch (method) {
            case "credit_card":
            
                System.out.print("Enter credit card number: ");
                String cardNumber = scanner.nextLine();
                System.out.print("Enter expiry date (MM/YY): ");
                String expiryDate = scanner.nextLine();
                System.out.print("Enter CVV: ");
                String cvv = scanner.nextLine();
                //In reality, this data would be securely encrypted and sent to a payment gateway
                System.out.println("Processing credit card payment...");
                break;
            case  "paypal":
                System.out.print("Enter your PayPal email: ");
                String email = scanner.nextLine();
                System.out.println("Processing PayPal payment...");
                //In reality, this would involve secure communication with PayPal's API
                break;
            case "bank_transfer":
                System.out.print("Enter your bank account number: ");
                String accountNumber = scanner.nextLine();
                System.out.println("Processing bank transfer...");
                //In reality, this would involve secure communication with the bank
                break;
            default:
                System.out.println("Unsupported payment method.");
        }
        System.out.println("Payment of $" + amount + " processed via " + paymentMethods.get(method) + ".");
    }
}
}