import java.util.Scanner;

public class EmployeeOvertimePay {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Employee Role (1=Manager, 2=Developer, 3=Intern): ");
        int role = sc.nextInt();

        System.out.println("Enter Hours Worked: ");
        int hours = sc.nextInt();

        double baseSalary = 0, hourlyRate = 0, overtimePay = 0;

        switch (role) {
            case 1: 
                baseSalary = 50000;
                hourlyRate = 500;
                if (hours > 40) {
                    overtimePay = (hours - 40) * hourlyRate;
                    System.out.println("Total Salary (with Overtime): " + (baseSalary + overtimePay));
                } else {
                    System.out.println("Standard Salary: " + baseSalary);
                }
                break;

            case 2: 
                baseSalary = 40000;
                hourlyRate = 300;
                if (hours > 40) {
                    overtimePay = (hours - 40) * hourlyRate;
                    System.out.println("Total Salary (with Overtime): " + (baseSalary + overtimePay));
                } else {
                    System.out.println("Standard Salary: " + baseSalary);
                }
                break;

            case 3: 
                baseSalary = 10000;
                hourlyRate = 100;
                if (hours > 40) {
                    overtimePay = (hours - 40) * hourlyRate;
                    System.out.println("Total Salary (with Overtime): " + (baseSalary + overtimePay));
                } else {
                    System.out.println("Standard Salary: " + baseSalary);
                }
                break;

            default:
                System.out.println("Invalid Employee Role");
        }
    }
}