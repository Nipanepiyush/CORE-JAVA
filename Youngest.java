/* If the ages of Ram, Shyam and Ajay are input through the
keyboard, write a program to determine the youngest of the
three.  */

import java.util.Scanner;

public class Youngest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("|| FIND OUT THE YOUNGEST CHILD ||");
        System.out.println("--------------------------------------");

        System.out.print("ENTER THE AGE OF RAM, SHAYAM AND AJAY: ");
        int r = sc.nextInt(), s = sc.nextInt(), a = sc.nextInt();

        if (r > s && s > a) {
            System.out.println("AJAY IS YOUNGEST CHILD");
        } else if (r > s) {
            System.out.println("SHYAM IS YOUNGEST CHILD");
        } else {
            System.out.println("RAM IS YOUNGEST CHILD");
        }
    }
}
