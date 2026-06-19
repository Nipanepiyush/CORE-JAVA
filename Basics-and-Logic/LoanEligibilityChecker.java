import java.util.*;

public class LoanEligibilityChecker {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter Your Age:");
        int a = scan.nextInt();
        System.out.print("Enter Your Monthly Income:");
        int b = scan.nextInt();

        if (a >= 21 && b >= 25000) {
            System.out.println("Eligible");
        } else {
            System.out.println("Not Eligible");
        }
    }
}
