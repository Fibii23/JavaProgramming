import java.util.Scanner;

public class EvenNumberOperationsWithValidation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sum = 0, product = 1;
        int difference = 0;
        double quotient = 1.0;
        boolean firstEven = true;

        System.out.println("Please enter 20 numbers:");

        for (int i = 0; i < 20; i++) {
            int number;
            while (true) {
                System.out.print("Enter number " + (i + 1) + ": ");
                number = scanner.nextInt();
                if (number >= 0) break; // Input validation for non-negative numbers
                System.out.println("Please enter a non-negative number.");
            }

            if (number < 100 && number % 2 == 0) {
                sum += number;
                product *= number;
                if (firstEven) {
                    difference = number;
                    firstEven = false;
                } else {
                    difference -= number;
                }
                quotient /= number;
            }
        }

        System.out.println("Sum of even numbers: " + sum);
        System.out.println("Difference of even numbers: " + difference);
        System.out.println("Product of even numbers: " + product);
        System.out.println("Quotient of even numbers: " + quotient);
    }
}
