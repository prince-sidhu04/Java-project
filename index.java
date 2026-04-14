import java.util.Scanner;

class Calculator {

    // ----------- ADDITION (Method Overloading) -----------
    int add(int a, int b) {
        return a + b;
    }

    double add(double a, double b) {
        return a + b;
    }

    // ----------- SUBTRACTION -----------
    int subtract(int a, int b) {
        return a - b;
    }

    double subtract(double a, double b) {
        return a - b;
    }

    // ----------- MULTIPLICATION -----------
    int multiply(int a, int b) {
        return a * b;
    }

    double multiply(double a, double b) {
        return a * b;
    }

    // ----------- DIVISION WITH EXCEPTION HANDLING -----------
    int divide(int a, int b) {
        try {
            return a / b;
        } catch (ArithmeticException e) {
            System.out.println("Error: Cannot divide by zero");
            return 0;
        }
    }

    double divide(double a, double b) {
        if (b == 0) {
            System.out.println("Error: Cannot divide by zero");
            return 0;
        }
        return a / b;
    }

    // ----------- SCIENTIFIC FUNCTIONS -----------
    double squareRoot(double num) {
        if (num < 0) {
            System.out.println("Error: Negative number");
            return 0;
        }
        return Math.sqrt(num);
    }

    double power(double base, double exponent) {
        return Math.pow(base, exponent);
    }

    double sine(double angle) {
        return Math.sin(Math.toRadians(angle));
    }

    double cosine(double angle) {
        return Math.cos(Math.toRadians(angle));
    }
}

public class ScientificCalculator {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Calculator calc = new Calculator();

        System.out.println("----- Scientific Calculator -----");

        // Testing overloaded methods
        System.out.println("Addition (int): " + calc.add(5, 10));
        System.out.println("Addition (double): " + calc.add(5.5, 2.3));

        System.out.println("Subtraction (int): " + calc.subtract(10, 4));
        System.out.println("Multiplication (double): " + calc.multiply(2.5, 4.0));

        // Division test
        System.out.println("Division: " + calc.divide(10, 2));
        System.out.println("Division by zero test:");
        calc.divide(10, 0);

        // Scientific functions
        System.out.println("Square Root: " + calc.squareRoot(25));
        System.out.println("Power: " + calc.power(2, 3));
        System.out.println("Sin(30): " + calc.sine(30));
        System.out.println("Cos(60): " + calc.cosine(60));

        sc.close();
    }
}