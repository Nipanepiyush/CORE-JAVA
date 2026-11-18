/* Any year is input through the keyboard. Write a program to
determine whether the year is a leap year or not.

(Hint: Use the % (modulus) operator)  */

import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("|| CHECK WEATHER THE YEAR IS LEAP YEAR OR NOT ||");
        System.out.print("ENTER THE VALID YEAR: ");
        int yr = sc.nextInt();
        System.out.println("----------------------------------------------------");

        if (yr % 400 == 0) {
            System.out.println("YEAR IS A LEAP YEAR");
        } else if (yr % 100 == 0) {
            System.out.println("YEAR IS NOT A LEAP YEAR");
        } else if (yr % 4 == 0) {
            System.out.println("YEAR IS A LEAP YEAR");
        } else {
            System.out.println("YEAR IS NOT A LEAP YEAR");
        }
    }
}

/*
 * ulternate
 * if (yr % 400 == 0 || (yr % 4 == 0 || yr % 100 != 0))
 */