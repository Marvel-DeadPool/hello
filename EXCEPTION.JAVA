import java.util.Scanner;

// Custom exception class
class InvalidUserException extends Exception {
    InvalidUserException(String message) {
        super(message);
    }
}

public class UserChecker {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            // Input
            System.out.print("Enter age: ");
            int age = sc.nextInt();

            System.out.print("Enter monthly income: ");
            int income = sc.nextInt();
            sc.nextLine();  // consume leftover newline

            System.out.print("Enter city: ");
            String city = sc.nextLine();

            System.out.print("Do you own a 4-wheeler? (yes/no): ");
            String vehicle = sc.nextLine();

            // Collect all errors
            String errors = "";

            if (age < 18 || age > 55)
                errors += "Invalid Age (must be 18–55)\n";

            if (income < 50000 || income > 100000)
                errors += "Invalid Income (₹50,000–₹1,00,000)\n";

            if (!(city.equalsIgnoreCase("Pune") || city.equalsIgnoreCase("Mumbai")
                    || city.equalsIgnoreCase("Bangalore") || city.equalsIgnoreCase("Chennai")))
                errors += "Invalid City (must be Pune, Mumbai, Bangalore, or Chennai)\n";

            if (!vehicle.equalsIgnoreCase("yes"))
                errors += "User must own a 4-wheeler\n";

            // Throw exception if any errors found
            if (!errors.isEmpty())
                throw new InvalidUserException(errors);

            System.out.println("All conditions met. User accepted.");

        } catch (InvalidUserException e) {
            System.out.println("\n--- User Validation Failed ---");
            System.out.println(e.getMessage());
        }

        sc.close();
    }
}
