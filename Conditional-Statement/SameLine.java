/* Given three points (x1, y1), (x2, y2) and (x3, y3), write a
program to check if all the three points fall on one straight line.  */

import java.util.Scanner;

public class SameLine {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("|| CHECK WEATHER THE ALL THREE POINTS ARE IN STRAIGHT LINE ||");
        System.out.println("--------------------------------------------------------");

        System.out.print("ENTER THE VALU FOR X1 AND y1: ");
        int x1 = sc.nextInt(), y1 = sc.nextInt();

        System.out.print("ENTER THE VALU FOR X2 AND y2: ");
        int x2 = sc.nextInt(), y2 = sc.nextInt();

        System.out.print("ENTER THE VALU FOR X3 AND y3: ");
        int x3 = sc.nextInt(), y3 = sc.nextInt();

        int sum = x1 * (y2 - y3) + x2 * (y3 - y1) + x3 * (y1 - y2);

        if (sum == 0)
            System.out.println("ALL THREE POINS LIES IN A SINGLE LINE " + sum);
        else
            System.out.println("ALL THREE POINTS DOES NOT LIES IN SINGLE LINE " + sum);
    }
}
