import java.util.Scanner;

public class PrelimAct3 {
   public static void main(String[] args){
      Scanner inputFirstNumber = new Scanner(System.in);
      System.out.println("Input first number: ");
      int firstNum = inputFirstNumber.nextInt();
      Scanner inputSecondNumber = new Scanner(System.in);
      System.out.println("Input second number: ");
      int secondNum = inputSecondNumber.nextInt();
      Scanner inputThirdNumber = new Scanner(System.in);
      System.out.println("Input third number: ");
      int thirdNum = inputThirdNumber.nextInt();
      Scanner inputFourthNumber = new Scanner(System.in);
      System.out.println("Input fourth number: ");
      int fourthtNum = inputFourthNumber.nextInt();
      Scanner inputFifthNumber = new Scanner(System.in);
      System.out.println("Input fifth number: ");
      int fifthNum = inputFifthNumber.nextInt();
      
      int highest = firstNum;
        if (secondNum > highest) {
            highest = secondNum;
        }
        if (thirdNum > highest) {
            highest = thirdNum;
        }
        if (fourthtNum > highest) {
            highest = fourthtNum;
        }
        if (fifthNum > highest) {
            highest = fifthNum;
        }
        System.out.println("The highest number is: " + highest);

   }

}