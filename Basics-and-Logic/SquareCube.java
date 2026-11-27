/* Calculate the square and cube of a number. */

import java.util.Scanner;

class SquareCube {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("FING THE CUBE, SQUARE, CUBEROOT AND SQUAREROOT OF THE NUMBER");
        System.out.println("----------------------------------------");
        System.out.print("ENTER THE VALID NUMBER: ");

        double n = sc.nextInt();
        double s = Math.pow(n, 2);
        double c = Math.pow(n, 3);
        double sr = Math.sqrt(n);
        double cr = Math.cbrt(n);

        System.out.print("\n");
        System.out.println("THE SQUARE FOR" + n + " IS: " + s);
        System.out.print("THE SQUAREROOT FOR" + n + " IS: " + sr);
        System.out.println("\n");
        System.out.println("THE CUBE FOR" + n + " IS: " + c);
        System.out.println("THE CUBEROOT FOR" + n + " IS: " + cr);
    }
}