import java.util.Scanner;

public class PrelimAct2 {
    public static void main(String[] args) {

        double discountAmount;
        double discountedPrice;

        Scanner input = new Scanner(System.in);

        System.out.print("Item's Price: ");
        double priceItem = input.nextDouble();

        System.out.print("Discount (%): ");
        double discount = input.nextDouble();

        discountAmount = (priceItem * discount) / 100;
        discountedPrice = priceItem - discountAmount;

        System.out.printf("Your discount amount is: %.2f%n", discountAmount);
        System.out.printf("Your discounted price is: %.2f%n", discountedPrice);

        input.close();
    }
}
