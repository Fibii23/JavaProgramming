import java.util.Scanner;

public class CalculatorApp {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter first number: ");
        double num1 = input.nextDouble();
        System.out.print("Enter second number: ");
        double num2 = input.nextDouble();

        System.out.println("Addition: " + addition(num1, num2));
        System.out.println("Subtraction: " + subtraction(num1, num2));
        System.out.println("Multiplication: " + multiplication(num1, num2));

        if (num2 != 0) {
            System.out.println("Division: " + division(num1, num2));
            System.out.println("Modulo: " + modulo(num1, num2));
        } else {
            System.out.println("Division: Undefined");
            System.out.println("Modulo: Undefined");
        }
    }

    public static double addition(double a, double b) {
        return a + b;
    }

    public static double subtraction(double a, double b) {
        return a - b;
    }

    public static double multiplication(double a, double b) {
        return a * b;
    }

    public static double division(double a, double b) {
        return a / b;
    }

    public static double modulo(double a, double b) {
        return a % b;
    }
}
