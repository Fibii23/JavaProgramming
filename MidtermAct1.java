import java.util.Scanner;

public class MidtermAct1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter start number: ");
        int start = scanner.nextInt();

        System.out.print("Enter end number: ");
        int end = scanner.nextInt();

        System.out.println("Perfect squares of even numbers from " + start + " to " + end + ":");

        int i = start;
        while (i <= end) {
            if (i % 2 == 0) { 
                int square = i * i; 
                System.out.println(i + " squared = " + square);
            }
            i++; 
        }
    }
}