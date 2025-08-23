import java.util.Scanner;

public class PrelimAct2 {
   public static void main(String[] args){
   
      double discountAmount;
      double discountedPrice;
      
      Scanner inputPriceItem = new Scanner(System.in);
      System.out.println("Item's Price: ");
      double priceItem = inputPriceItem.nextDouble();
      Scanner inputDiscount = new Scanner(System.in);
      System.out.println("Discount: ");
      double discount = inputDiscount.nextDouble();
      
      discountAmount = (priceItem * discount) / 100;
      System.out.println("Your discount amount is: "+ discountAmount);
      discountedPrice = priceItem - discountAmount;
      System.out.println("Your discount price is: "+ discountedPrice);


   }

}