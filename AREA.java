import java.util.Scanner;

// Superclass Shape
class Shape {
    double dim1, dim2;

    Shape(double a, double b) {
        dim1 = a;
        dim2 = b;
    }

    double area() {
        return 0;
    }
}

// Rectangle subclass
class Rectangle extends Shape {
    Rectangle(double a, double b) {
        super(a, b);
    }

    double area() {
        return dim1 * dim2;
    }
}

// Triangle subclass
class Triangle extends Shape {
    Triangle(double a, double b) {
        super(a, b);
    }

    double area() {
        return 0.5 * dim1 * dim2;
    }
}

// Main class
public class TestShape {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Rectangle input
        System.out.print("Enter length and width of rectangle: ");
        double l = sc.nextDouble();
        double w = sc.nextDouble();
        Rectangle r = new Rectangle(l, w);
        System.out.println("Rectangle area: " + r.area());

        // Triangle input
        System.out.print("Enter base and height of triangle: ");
        double b = sc.nextDouble();
        double h = sc.nextDouble();
        Triangle t = new Triangle(b, h);
        System.out.println("Triangle area: " + t.area());

        sc.close();
    }
}
