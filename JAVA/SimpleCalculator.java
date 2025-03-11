import java.util.Scanner;

public class SimpleCalculator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter first number: ");
        double num1 = scanner.nextDouble();
        
        System.out.print("Enter second number: ");
        double num2 = scanner.nextDouble();
        
        System.out.println("Addition: " + addition(num1, num2));
        System.out.println("Subtraction: " + subtraction(num1, num2));
        System.out.println("Multiplication: " + multiplication(num1, num2));
        System.out.println("Division: " + division(num1, num2));
        System.out.println("Modulo: " + modulo(num1, num2));
        
        scanner.close();
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
        if (b != 0) {
            return a / b;
        }
    }

    public static double modulo(double a, double b) {
        if (b != 0) {
            return a % b;
        }
    }
}
