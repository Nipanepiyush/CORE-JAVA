/* A cashier has currency notes of denominations 10, 50 and
100. If the amount to be withdrawn is input through the
keyboard in hundreds, find the total number of currency notes
of each denomination the cashier will have to give to the
withdrawer.  */

import java.util.Scanner;

public class CurrencyNote {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int count = 0;

        System.out.println("|| CURRENCY COUNTER ||");
        System.out.println("--------------------------------------------------");

        int total = 1000000;
        System.out.println("PLEASE ENTER THE TOTAL BALANCE AMOUNT: " + total);

        System.out.print("PLEASE ENTER THE WITHDRAWN AMOUNT: ");
        int w = sc.nextInt();

        int num1 = w / 100;
        w = w % 100;

        int num2 = w / 50;
        w = w % 50;

        int num3 = w / 10;
        w = w % 10;

        System.out.println("TOTAL CURRENY OF 100 IS: " + num1);
        System.out.println("TOTAL CURRENY OF 50 IS: " + num2);
        System.out.println("TOTAL CURRENY OF 10 IS: " + num3);

    }
}