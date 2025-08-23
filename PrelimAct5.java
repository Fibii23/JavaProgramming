import java.util.Scanner;

public class PrelimAct5 {
   public static void main(String[] args){
   
      Scanner input = new Scanner (System.in);
      
      final int MIN = 1;
      final int MAX = 5;
      int random;
   
      random = MIN + (int)(Math.random() * MAX);
      System.out.println("Guess a number between 1 to 5: ");
      int guess = input.nextInt();
      
      boolean isMatch = (guess == random);
      System.out.println("Random Number: " + random +"\n");   
   
      if (isMatch) {
         System.out.println("Yay! You got it!");
      } else {
         System.out.println("Too Bad :( Try Again");
      }
   
   }
}