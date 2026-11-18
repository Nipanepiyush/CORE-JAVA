/* If cost price and selling price of an item is input through the
keyboard, write a program to determine whether the seller has
made profit or incurred loss. Also determine how much profit
he made or loss he incurred.  */

import java.util.Scanner;

public class ProfitAndLoss {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("|| CHECK WHEATHER PROFIT OR LOSS ||");
        System.out.println("-----------------------------------------");

        System.out.print("ENTER THE COST PRICE OF THE ITEMS: ");
        int cp = sc.nextInt();
        System.out.print("ENTER THE SELLING PRICE OF THE ITEMS: ");
        int sp = sc.nextInt();

        if (sp < cp)
            System.out.println("THE SHOPKEEPER INCURRED LOSS OF: " + (cp - sp));
        else
            System.out.println("THE SHOPKEEPER INCURRED PROFILT OF: " + (sp - cp));

    }
}
