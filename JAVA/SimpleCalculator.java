import java.util.Scanner;

public class SimpleCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the first number: ");
        int firstNum = scanner.nextInt();
        System.out.print("Enter the second number: ");
        int secondNum = scanner.nextInt();

        System.out.println("Addition: " + (firstNum + secondNum));
        System.out.println("Subtraction: " + (firstNum - secondNum));
        System.out.println("Multiplication: " + (firstNum * secondNum));
        System.out.println("Division: " + (firstNum / secondNum));
    }
}
