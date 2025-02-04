public class BasicArithmetic {
    public static void main(String[] args) {
        int firstNumber = 15;
        int secondNumber = 10;

        int sum = firstNumber + secondNumber;
        int difference = firstNumber - secondNumber;
        int product = firstNumber * secondNumber;
        int quotient = firstNumber / secondNumber;
        int remainder = firstNumber % secondNumber;

        System.out.println("Addition: " + sum);
        System.out.println("Subtraction: " + difference);
        System.out.println("Multiplication: " + product);
        System.out.println("Division: " + quotient);
        System.out.println("Modulus: " + remainder);
    }
}
