import java.util.Scanner;

// Abstract class
abstract class Plan {
    double rate;

    abstract void getRate();

    double calculateBill(int units) {
        return units * rate;
    }
}

// Domestic Plan
class DomesticPlan extends Plan {
    void getRate() {
        rate = 3.5;
    }
}

// Commercial Plan
class CommercialPlan extends Plan {
    void getRate() {
        rate = 7.5;
    }
}

// Main class
public class ElectricityBill {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter 1 for Domestic or 2 for Commercial:");
        int choice = sc.nextInt();

        System.out.println("Enter number of units:");
        int units = sc.nextInt();

        Plan p;

        if (choice == 1) {
            p = new DomesticPlan();
        } else {
            p = new CommercialPlan();
        }

        p.getRate();
        double bill = p.calculateBill(units);
        System.out.println("Total bill: Rs. " + bill);

        sc.close();
    }
}
