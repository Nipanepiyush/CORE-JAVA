import java.util.*;

public class ElectricityBillCalculator {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter Unit Consumed:");
        double a = scan.nextDouble();

        if (a <= 100) {
            System.out.println("Rate = Rs 5/Unit");
            System.out.println("Bill:" + (a * 5));
        } else if (a < 300) {
            System.out.println("Rate = Rs 7/Unit");
            System.out.println("Bill:" + (a * 7));
        } else if (a > 300) {
            System.out.println("Rate = Rs 10/Unit");
            System.out.println("Bill:" + (a * 10));
        } else {
            System.out.println("Rate = Rs 12/Unit");
            System.out.println("Bill:" + (a * 12));
        }

    }
}