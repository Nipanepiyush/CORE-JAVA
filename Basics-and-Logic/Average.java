/* Calculate the average of five numbers. */

import java.util.Scanner;

public class Average {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("FINF THE AVERAGE FOR FIVE NUMBERS");
        System.out.println("--------------------------------------");
        System.out.print("ENTER THE FIVE NUMBERS: ");

        int n1 = sc.nextInt(), n2 = sc.nextInt(), n3 = sc.nextInt(), n4 = sc.nextInt(), n5 = sc.nextInt();
        int sum = n1 + n2 + n3 + n4 + n5;
        int avg = sum / 5;

        System.out.println("THE AVERAGE OF 5 NUMBER IS: " + avg);
    }
}
