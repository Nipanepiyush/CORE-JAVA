import java.util.Scanner;

public class RailwayTicketFare {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.print("Enter Age:");
        int a = scan.nextInt();
        System.out.print("Enter Ticket Price:");
        double b = scan.nextDouble();

        if (a <= 5) {
            System.out.println("Free Entry");
        } else if (a >= 5 && a <= 18) {
            System.out.println("Discount:" + (b * 50 / 100));
            System.out.println("Total Amount:" + (b - (b * 50 / 100)));
        } else if (a > 60) {
            System.out.println("Discount:" + (b * 30 / 100));
            System.out.println("Total Amount:" + (b - (b * 30 / 100)));
        } else {
            System.out.println("Total Amount:" + b);
            System.out.println("Full Fare");
        }
    }
}