import java.util.Scanner;

public class RepeatCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);  // Scanner for user input

        String choice = "yes"; 

        while (choice.equalsIgnoreCase("yes")) {  
            
            System.out.print("Enter first number: ");
            double num1 = sc.nextDouble();

            System.out.print("Enter second number: ");
            double num2 = sc.nextDouble();

            System.out.print("Enter operation (+, -, *, /): ");
            char op = sc.next().charAt(0);

            double result; 

    
            switch (op) {
                case '+':
                    result = num1 + num2;
                    System.out.println("Result: " + result);
                    break;

                case '-':
                    result = num1 - num2;
                    System.out.println("Result: " + result);
                    break;

                case '*':
                    result = num1 * num2;
                    System.out.println("Result: " + result);
                    break;

                case '/':
                    if (num2 == 0) {
                        System.out.println("Error: Cannot divide by zero.");
                    } else {
                        result = num1 / num2;
                        System.out.println("Result: " + result);
                    }
                    break;

                default:
                    System.out.println("Invalid operation.");
            }

            System.out.print("Do you want to calculate again? (yes/no): ");
            choice = sc.next();  
        }

        System.out.println("Calculator closed. Goodbye!");
    }
}