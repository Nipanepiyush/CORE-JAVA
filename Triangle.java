/* Write a program to check whether a triangle is valid or not,
when the three angles of the triangle are entered through the
keyboard. A triangle is valid if the sum of all the three angles
is equal to 180 degrees.  */

import java.util.Scanner;

public class Triangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("|| CJHECK WEATHER THE TRANGIL IS VALID OR NOT ||");
        System.out.println("---------------------------------------------------");

        System.out.print("ENTER ALL THREE SIDES OF THE TRIANGLE: ");
        int s1 = sc.nextInt(), s2 = sc.nextInt(), s3 = sc.nextInt();
        int sum = s1 + s2 + s3;

        if (sum == 180)
            System.out.println("TRANGLE IS VALID: " + sum);
        else
            System.out.println("TRIANGLE IS NOT VALID" + sum);
    }
}
