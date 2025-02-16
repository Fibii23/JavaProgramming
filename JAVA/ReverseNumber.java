import java.util.Scanner;

public class ReverseNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = scanner.nextInt();
        
        int reversed = 0;

        for (int i = num; i != 0; i /= 10) {
            reversed = reversed * 10 + i % 10;
        }
        

        System.out.println("Reversed value - " + reversed);
    }
}
