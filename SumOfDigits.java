/* If a five-digit number is input through the keyboard, write a
program to calculate the sum of its digits.

(Hint: Use the modulus operator %) */
import java.util.Scanner;

public class SumOfDigits {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("|| CALCULATE THE SUM OF THE GIVEN NUMBER ||");
        System.out.println("----------------------------------------------");
        System.out.print("ENTER A VALID 5 DIGIT NUMBER: ");
        int num = sc.nextInt();

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

        int sum = r1 + r2 + r3 + r4 + r5;
        System.out.println("SUM OF FIVE DIGIT NUMBER IS: " + sum);

    }
}
