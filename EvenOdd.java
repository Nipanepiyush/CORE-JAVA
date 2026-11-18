/* Any integer is input through the keyboard. Write a program to
find out whether it is an odd number or even number. */

import java.util.Scanner;

public class EvenOdd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("CHECK WEATHER THE NUMBER IS EVEN OR ODD");
        System.out.println("------------------------------------------");

        System.out.print("ENTER THE VALID NUMBER: ");
        int num = sc.nextInt();

        if (num % 2 == 0)
            System.out.println("THE NUMBER IS EVEN");
        else
            System.out.println("THE NUMBER IS ODD");
    }
}
