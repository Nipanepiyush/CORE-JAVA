/* Any character is entered through the keyboard, write a
program to determine whether the character entered is a
capital letter, a small case letter, a digit or a special symbol.
The following table shows the range of ASCII values for
various characters.
Characters ASCII Values
A – Z
a – z
0 – 9
special symbols
65 – 90
97 – 122
48 – 57
 0 - 47, 58 - 64, 91 - 96, 123 - 127 */

import java.util.Scanner;

public class ASCII {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("|| IDENTIFY WHEATHER THE ENTER DIGIT IS SYMBOL UPPERCASE OR LOWERCASE ||");
        System.out.println("-----------------------------------------");

        System.out.print("ENTER ANY VALUE FROM THE KEYBOARD: ");
        char ch = sc.next().charAt(0);

        if (ch >= 'a' && ch <= 'z')
            System.out.println("THE ENTER VALUE IS IN LOWERCASE");
        else if (ch >= 'A' && ch <= 'Z')
            System.out.println("THE ENTER VALUE IS IN  UPPERCASE");
        else if (ch >= '0' && ch <= '9')
            System.out.println("THE ENTERED VALUE IS NUMBER");
        else
            System.out.println("ENTERED VALUE IS THE SPECIAL SYMBOLS");

    }

}
