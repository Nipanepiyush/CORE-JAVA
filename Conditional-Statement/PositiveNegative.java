/* Check whether a number is positive or negative. */

import java.util.Scanner;

public class PositiveNegative {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("|| CHECK THE NUMBER IS NEGATIVE POSITIVE OR ZERO ||");
        System.out.println("--------------------------------------------------------");

        System.out.print("ENTER THE VALID NUMBER: ");
        int num = sc.nextInt();

        if (num > 0) {
            System.out.println("NUMBER IS POSITIVE NUMBER");
        } else if (num < 0) {
            System.out.println("NUMBER IS NEGATIVE NUMBER");
        } else
            System.out.println("NUMBER IS ZERO");
    }
}
