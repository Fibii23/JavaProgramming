import java.util.Scanner;

public class MovieTicketPricing {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter Movie Type (1=Regular, 2=3D, 3=IMAX): ");
        int type = scanner.nextInt();

        System.out.println("Enter Age: ");
        int age = scanner.nextInt();

        double price;

        switch (type) {
            case 1: 
                price = 200; 
                if (age < 12 || age > 60) {
                    price = price * 0.5; 
                }
                System.out.println("Ticket Price: " + price);
                break;

            case 2: 
                price = 300;
                if (age < 12 || age > 60) {
                    price = price * 0.5;
                }
                System.out.println("Ticket Price: " + price);
                break;

            case 3: 
                price = 400;
                if (age < 12 || age > 60) {
                    price = price * 0.5;
                }
                System.out.println("Ticket Price: " + price);
                break;

            default:
                System.out.println("Invalid Movie Type");
        }
    }
}