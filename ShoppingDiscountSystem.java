import java.util.*;

public class ShoppingDiscountSystem {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.print("Total Purchase Amount:");
        double a = scan.nextDouble();

        if (a > 5000) {
            System.out.println("Discount:" + (a * 20 / 100));
            System.out.println("Total Amount:" + (a - (a * 20 / 100)));
        } else if (a > 3000) {
            System.out.println("Discount:" + (a * 10 / 100));
            System.out.println("Total Amount:" + (a - (a * 10 / 100)));

        } else if (a > 1000) {
            System.out.println("Discount:" + (a * 10 / 100));
            System.out.println("Total Amount:" + (a - (a * 10 / 100)));

        } else {
            System.out.println("NO Discount");
        }

    }
}
