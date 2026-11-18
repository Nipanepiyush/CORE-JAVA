/* If a five-digit number is input through the keyboard, write a
program to reverse the number. 

Example :- 12345
Output :- 54321 */

import java.util.Scanner;

public class ReverseNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("|| REVERSE THE GIVEN NUMBER ||");
        System.out.print("ENTER A 5 DIGIT NUMBER FOR REVERSE: ");
        int num = sc.nextInt();

        System.out.println("------------------------------------");
        System.out.println("---- NUMBER BEFORE REVERSE IS ----\n" + "FIVE DIGIT NUMBER IS: " + num);
        System.out.println("");
        System.out.println("---- NUMBER AFTER REVERSE IS ----");

        int r1 = num % 10;
        num = num / 10;

        int r2 = num % 10;
        num = num / 10;

        int r3 = num % 10;
        num = num / 10;

        int r4 = num % 10;
        num = num / 10;

        int r5 = num % 10;
        num = num / 10;

        int rev = r1 * 10000 + r2 * 1000 + r3 * 100 + r4 * 10 + r5 * 1;
        System.out.print("FIVE DIGIT REVERSE NUMBER IS: " + rev);

    }
}
