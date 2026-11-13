import java.util.*;

public class ATMWithdrawal {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.print("Balanced Amount in Account:");
        int a = scan.nextInt();
        System.out.print("Amount to Withdraw:");
        int b = scan.nextInt();

        if (b >= a) {
            System.out.println("Insufficient Balance");
        } else if (b <= a) {
            System.out.println("Amount Withdrawn Successfully");
        }

    }
}