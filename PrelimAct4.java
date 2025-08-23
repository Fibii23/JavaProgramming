import java.util.Scanner;

public class PrelimAct4 {
    public static void main(String[] args) {

        System.out.println("Mary had a little _______");
        System.out.println("Its _____ was ______ as snow");
        System.out.println("And everywhere that Mary _______");
        System.out.println("The ______ was sure to go.\n\n");
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Give me a noun:");
        String firstWord = scanner.nextLine();
        System.out.println("Give me the another noun:");
        String secondWord = scanner.nextLine();
        System.out.println("Give me the adjective:");
        String thirdWord = scanner.nextLine();
        System.out.println("Give me the past-tense verb:");
        String fourthWord = scanner.nextLine();
        
        System.out.println("\nHere is the Result:\n");
        System.out.println("Mary had a little " + firstWord);
        System.out.println("Its " + secondWord + " was " + thirdWord + " as snow");
        System.out.println("And everywhere that Mary " + fourthWord);
        System.out.println("The " + firstWord + " was sure to go.");


    }
}