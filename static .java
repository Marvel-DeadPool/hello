import java.util.Scanner;

class Student {
    String name;
    int roll;
    static String college = "ABC College";

    Student(String name, int roll) {
        this.name = name;
        this.roll = roll;
    }

    void display() {
        System.out.println("Name: " + name);
        System.out.println("Roll: " + roll);
        System.out.println("College: " + college);
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Taking input for first student
        System.out.print("Enter name of student 1: ");
        String name1 = sc.nextLine();
        System.out.print("Enter roll number of student 1: ");
        int roll1 = sc.nextInt();
        sc.nextLine();  // consume leftover newline

        Student s1 = new Student(name1, roll1);

        
        System.out.print("Enter name of student 2: ");
        String name2 = sc.nextLine();
        System.out.print("Enter roll number of student 2: ");
        int roll2 = sc.nextInt();
        sc.nextLine(); 

        Student s2 = new Student(name2, roll2);

        System.out.println("\nStudent Details:");
        s1.display();
        System.out.println("------------------");
        s2.display();

        sc.close();
    }
}



// Static Variable
// static String college is a class variable shared by all objects.

// All students belong to the same college, so this saves memory by having only one copy.

// You access college with the class name or any object (Student.college or s1.college).


// Parameterized Constructor
// Student(String name, int roll) is a constructor with parameters.

// It initializes instance variables when creating an object.

// Called like: new Student(name1, roll1);


// this Keyword
// this.name = name; refers to the current object's instance variable.

// Used to differentiate between instance variable (this.name) and parameter (name) with the same name.


