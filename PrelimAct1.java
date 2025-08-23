import java.util.Scanner;

public class PrelimAct1 {
   public static void main(String[] args){
      Scanner inputAge = new Scanner(System.in);
      System.out.println("Input your age: ");
      int age = inputAge.nextInt();
      int votingAge = 18;
      
      if (age>=votingAge){
         System.out.println("He/She is old enough to vote");
      } else {
         System.out.println("He/She is not allowed to vote yet");
      }
   
   }

}