import java.util.Scanner;

public class MidtermAct3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int sum = 0;
        int product = 1;

        while (true) {  
            System.out.print("Enter a number (1-5), negative to stop: ");
            int num = scanner.nextInt();

            if (num < 0) { 
                break;
            }

            if (num >= 1 && num <= 5) { 
                sum += num;
                product *= num;
            } else {
                System.out.println("Invalid input, only 1-5 allowed.");
            }
        }

        System.out.println("Total Sum = " + sum);
        System.out.println("Total Product = " + product);
    }
}