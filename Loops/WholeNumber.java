/* Print numbers from 0 to 10 and from 10 to 0*/

import java.util.Scanner;

public class WholeNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("|| PRINT THE NUMBER FROM 1 TO 10 ||");
        System.out.println("----------------------------------------");

        for (int i = 0; i <= 10; i++)
            System.out.print(i + " ");

        System.out.println("\n|| PRINT THE NUMBER FROM 10 TO 0 ||");
        System.out.println("----------------------------------------");
        for (int j = 10; j >= 0; j--)
            System.out.print(j + " ");

    }
}
