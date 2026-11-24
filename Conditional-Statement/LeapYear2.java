/* Any year is entered through the keyboard, write a program to
determine whether the year is leap or not. Use the logical
operators && and ||.  */

import java.util.Scanner;

public class LeapYear2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("|| CHECK WEATHER THE ENTERED YEAR IS LEAP YEAR OR NOT ||");
        System.out.println("---------------------------------------------------------");

        System.out.print("ENTER TEH VALID YEAR: ");
        int yr = sc.nextInt();

        if (yr % 400 == 0 || (yr % 4 == 0 && yr % 100 != 0))
            System.out.println("THE YEAR IS LEAP YEAR");
        else
            System.out.println("THE YEAR IS NOT LEAP YEAR");
    }
}
