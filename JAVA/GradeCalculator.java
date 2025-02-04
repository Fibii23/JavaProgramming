import java.util.Scanner;

public class GradeCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your name: ");
        String studentName = scanner.nextLine();
        System.out.print("Enter score for Subject 1: ");
        int score1 = scanner.nextInt();
        System.out.print("Enter score for Subject 2: ");
        int score2 = scanner.nextInt();
        System.out.print("Enter score for Subject 3: ");
        int score3 = scanner.nextInt();

        double averageScore = (score1 + score2 + score3) / 3.0;

        if (averageScore >= 75) {
            System.out.println("Congratulations " + studentName + ", you passed!");
        } else {
            System.out.println("Sorry " + studentName + ", you failed.");
        }
    }
}
