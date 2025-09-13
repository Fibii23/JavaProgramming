import java.util.Scanner;

public class elimAct7_ExamResult {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter score (0-100): ");
        int score = sc.nextInt();

        if (score >= 60 && score <= 100) {

            switch (score / 10) {
                case 10:
                case 9: 
                    System.out.println("Remark: Excellent");
                    break;
                case 8:
                case 7: 
                    if (score >= 75) {
                        System.out.println("Remark: Good");
                    } else {
                        System.out.println("Remark: Fair");
                    }
                    break;
                case 6: 
                    System.out.println("Remark: Fair");
                    break;
                default:
                    System.out.println("Remark: Fair"); // fallback for 60–74
            }
        } else if (score >= 0 && score < 60) {
            System.out.println("Remark: Failed");
        } else {
            System.out.println("Invalid score. Please enter between 0 and 100.");
        }
    }
}