/* Two numbers are input through the keyboard into two
locations C and D. Write a program to interchange the
contents of C and D. 

with usin third variable

logic

int temp = A
num1 = num2
num2 = temp  */

import java.util.Scanner;

public class NumberInterchange {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("|| INTERCHANGE THE GIVEN TWO NUMBERS ||");
        System.out.println("----------------------------------------");

        System.out.print("ENTER THE NUMBER FOR A: ");
        int num1 = sc.nextInt();
        System.out.print("ENTER THE NUMBER FOR B: ");
        int num2 = sc.nextInt();

        System.out.println("---- NUMBER BEFORE INTERCHANGE IS ----");
        System.out.println("ENTER THE NUMBER FOR A:" + num1);
        System.out.println("ENTER THE NUMBER FOR B:" + num2);

        System.out.println("---- NUMBER AFTER INTERCHANGE IS ----");

        int temp = num1;
        num1 = num2;
        num2 = temp;
        System.out.println("AFTER INTERCHANGE A IS: " + num1);
        System.out.println("AFTER INTERCHANGE B IS: " + num2);
    }
}
