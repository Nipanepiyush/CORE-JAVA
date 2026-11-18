/* If the total selling price of 15 items and the total profit earned
on them is input through the keyboard, write a program to
find the cost price of one item.  */

import java.util.Scanner;

public class CostPrice {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("|| PRICE CALCULATORE ||");
        System.out.println("-----------------------------------------------");

        System.out.print("ENTER THE TOTAL SELLING PRICE OF 15 ITEMS: ");
        int sp = sc.nextInt();

        System.out.print("ENTER THE TOTAL PROFIT EARNED ON 15 ITEMS: ");
        int profit = sc.nextInt();

        int cp = sp - profit;
        System.out.println("THE COST PRICE OF 15 ITEMS IS: " + cp);
    }
}
