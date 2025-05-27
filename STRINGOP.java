import java.util.Scanner;

public class StringOperations {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string with spaces: ");
        String str1 = sc.nextLine();

        System.out.print("Enter first string: ");
        String str2 = sc.nextLine();

        System.out.print("Enter second string: ");
        String str3 = sc.nextLine();

        if (str1.length() > 1) {
            System.out.println("1. charAt(1): " + str1.charAt(1));
        } else {
            System.out.println("1. charAt(1): String too short");
        }

        System.out.println("2. compareTo(): " + str2.compareTo(str3));

        System.out.println("3. concat(): " + str2.concat(str3));

        System.out.println("4. equals(): " + str2.equals(str3));

        System.out.println("5. replace(): " + str1.replace('a', 'x'));

        String[] parts = str1.trim().split(" ");
        System.out.print("6. split(): ");
        for (String part : parts) {
            System.out.print("[" + part + "] ");
        }
        System.out.println();

        System.out.println("7. trim(): '" + str1.trim() + "'");

        sc.close();  // Close the Scanner
    }
}










// All these string methods like trim(), split(), concat(), charAt(), compareTo(), equals(), and replace() are part of the String class in Java.

// Which package?
// The String class is part of the java.lang package.

// The java.lang package is imported automatically by default in every Java program.

// So, you do not need to write any import statement to use these String methods

























