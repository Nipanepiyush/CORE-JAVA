import java.util.Scanner;

public class SalaryBonusCalculator {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.print("Employee Salary:");
        int a = scan.nextInt();
        System.out.print("Years of Experience:");
        int b = scan.nextInt();

        if (b > 6) {
            System.out.println("Bonus:" + (a * 20 / 100));
            System.out.println("Total Salary: " + (a + (a * 20 / 100)));
        } else if (b > 4) {
            System.out.println("Bonus:" + (a * 10 / 100));
            System.out.println("Total Salary: " + (a + (a * 10 / 100)));
        } else {
            System.out.println("No Bonus");
            System.out.println("Total Salary: " + a);
        }

    }
}