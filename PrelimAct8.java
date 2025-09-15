import java.util.Scanner;

public class PrelimAct8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Employment Status (1=Employed, 2=Self-Employed, 3=Unemployed): ");
        int status = sc.nextInt();

        System.out.println("Enter Salary: ");
        double salary = sc.nextDouble();

        switch (status) {
            case 1: 
                if (salary >= 30000) {
                    System.out.println("Loan Approved");
                } else {
                    System.out.println("Loan Denied");
                }
                break;

            case 2: 
                if (salary >= 50000) {
                    System.out.println("Loan Approved");
                } else {
                    System.out.println("Loan Denied");
                }
                break;

            case 3: 
                System.out.println("Loan Denied");
                break;

            default:
                System.out.println("Invalid Employment Status");
        }
    }
}
