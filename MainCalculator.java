import calculator.Arithmetic;
import java.util.Scanner;

public class MainCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Arithmetic calc = new Arithmetic();

        System.out.print("Enter first number: ");
        int a = sc.nextInt();

        System.out.print("Enter second number: ");
        int b = sc.nextInt();

        System.out.println("Choose operation: 1:Add  2:Subtract  3:Multiply  4:Divide");
        int choice = sc.nextInt();

        switch(choice) {
            case 1:
                System.out.println("Result: " + calc.add(a, b));
                break;
            case 2:
                System.out.println("Result: " + calc.subtract(a, b));
                break;
            case 3:
                System.out.println("Result: " + calc.multiply(a, b));
                break;
            case 4:
                System.out.println("Result: " + calc.divide(a, b));
                break;
            default:
                System.out.println("Invalid choice");
        }

        sc.close();
    }
}



// YourProject/
//  ├─ calculator/
//  │    └─ Arithmetic.java
//  └─ MainCalculator.java

// javac calculator/Arithmetic.java MainCalculator.java
// java MainCalculator
