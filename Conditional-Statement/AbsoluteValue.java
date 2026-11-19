/* Find the absolute value of a number entered through the
keyboard.  */

import java.util.Scanner;

public class AbsoluteValue {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("|| FIND THE ABSOLUTE VALUE ||");
        System.out.println("---------------------------------");

        System.out.print("ENTER THE VALID NUMBER: ");
        int num = sc.nextInt();

        if (num >= 0)
            System.out.println("THE NUMBER IS ALREADY ABSOLUTE: " + num);
        else
            System.out.println("THE ABSOLUTE NUMBER IS: " + Math.abs(num));

    }
}
