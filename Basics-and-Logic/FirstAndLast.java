/* If a four-digit number is input through the keyboard, write a
program to obtain the sum of the first and last digit of this
number.  */

import java.util.Scanner;

public class FirstAndLast {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("|| FIND THE SUM OF FIRST AND LSAT DIGIT NUMBER ||");
        System.out.println("---------------------------------------------");

        System.out.print("ENTER THE FOUR DIGIT NUMBER: ");
        int num = sc.nextInt();

        int r1 = num % 10;
        num = num / 10;

        int r2 = num % 10;
        num = num / 10;

        int r3 = num % 10;
        num = num / 10;

        int r4 = num % 10;
        num = num / 10;

        int sum = r1 + r4;
        System.out.println("THE SUM OF FIST AND LAST DIGIT IS: " + sum);
    }
}
