/* If a five-digit number is input through the keyboard, write a
program to print a new number by adding one to each of its
digits.

For example if the number that is input is 12391 then
the output should be displayed as 23402.  */

import java.util.Scanner;

public class AddOneToEachDigit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("|| ADD ONE TO EACH DIGIT NUMBERS ||");
        System.out.print("ENTER THE ANY 5 DIGIT NUMBER: ");
        int num = sc.nextInt();
        System.out.println("----------------------------------------");

        System.out.println("---- NUMBER BEFORE ADD ONE EACH DIGIT ----");
        System.out.println("THE FIVE DIGIT NUMBER IS: " + num);
        int r1 = num % 10;
        num = num / 10;
        r1 = (r1 + 1) % 10;

        int r2 = num % 10;
        num = num / 10;
        r2 = (r2 + 1) % 10;

        int r3 = num % 10;
        num = num / 10;
        r3 = (r3 + 1) % 10;

        int r4 = num % 10;
        num = num / 10;
        r4 = (r4 + 1) % 10;

        int r5 = num % 10;
        num = num / 10;
        r5 = (r5 + 1) % 10;

        int digit = r1 * 1 + r2 * 10 + r3 * 100 + r4 * 1000 + r5 * 10000;
        System.out.println("---- NUMBER AFTER ADD ONE EACH DIGIT ----");
        System.out.println("THE FIVE DIGIT NUMBER IS: " + digit);
    }
}
