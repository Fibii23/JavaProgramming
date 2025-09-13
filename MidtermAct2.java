import java.util.Scanner;

public class MidtermAct2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int sum = 0;
        int difference = 0;
        int product = 1;
        double quotient = 1.0;

        boolean firstEven = true; 

        System.out.println("Enter 20 numbers:");

        for (int i = 1; i <= 20; i++) {
            int num = scanner.nextInt();

            if (num % 2 == 0 && num < 100) {
                sum = sum +  num; 
                product = product * num; 

                if (firstEven) {
                    difference = num;
                    quotient = num;
                    firstEven = false;
                } else {
                    difference = difference - num;
                    quotient = quotient / num;
                }
            }
        }

        System.out.println("Sum of even numbers less than 100: " + sum);
        System.out.println("Difference of even numbers less than 100: " + difference);
        System.out.println("Product of even numbers less than 100: " + product);
        System.out.println("Quotient of even numbers less than 100: " + quotient);
    }
}
