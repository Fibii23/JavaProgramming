import java.util.Scanner;

public class MidtermAct4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);  

        String choice = "yes"; 

        while (!choice.isEmpty() && (choice.charAt(0) == 'y' || choice.charAt(0) == 'Y')) {  
            
            System.out.print("Enter first number: ");
            double num1 = input.nextDouble();

            System.out.print("Enter second number: ");
            double num2 = input.nextDouble();

            System.out.print("Enter operation (+, -, *, /): ");
            char operator = input.next().charAt(0);

            double result; 

            switch (operator) {
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
            choice = input.next();  
        }

        System.out.println("Calculator closed. Goodbye!");
    }
}