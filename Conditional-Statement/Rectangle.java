/* Given the length and breadth of a rectangle, write a program to
find whether the area of the rectangle is greater than its
perimeter.

For example, the area of the rectangle with length = 5
and breadth = 4 is greater than its perimeter.  */

import java.util.Scanner;

class Rectangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("|| FIND WEATHER THE AREA OF RECTANGLE IS GERETAER THEN PERIMETER ||");
        System.out.println("--------------------------------------------------------------------");

        System.out.print("ENTER THE LENGTH AND BRIDTH OF THE RECTHANGLE: ");
        int length = sc.nextInt(), breadth = sc.nextInt();

        int A = length * breadth, P = 2 * (length + breadth);

        if (A > P)
            System.out
                    .println("THE AREA OF RECTANGLE IS GREATER TAHN PERIMETER" + "\nAREA: " + A + "  \nPERIMETER: "
                            + P);
        else
            System.out.println(
                    "THE AREA OF RECTANGLE IS NOT GREATER THAN PERIMETER" + "\nAREA: " + A + " \nPERIMETER: " + P);

    }
}
