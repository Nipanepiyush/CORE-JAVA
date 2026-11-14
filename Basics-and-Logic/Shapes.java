/* The length & breadth of a rectangle and radius of a circle are
input through the keyboard. Write a program to calculate the
area & perimeter of the rectangle, and the area &
circumference of the circle. 

formulas
 Area of Rectangle is : Length * Breadth;
 Perimeter of circle is : 2*(Length * Breadth);
 Area of circle is : pi*r*r;
 Circumferance of circle is : 2*pi*r;
*/

import java.util.Scanner;

public class Shapes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("|| SHAPE CALCULATORE ||");
        System.out.println("PLEASE PROVIDE THE PROPER DETAILS");
        System.out.println("-------------------------------------------");

        System.out.print("ENTER THE LENGTH AND BREADTH OF THE RECTANGLE: ");
        int len = sc.nextInt();
        int bth = sc.nextInt();

        int A1 = len * bth;
        System.out.println("AREA OF RECTANGLE IS: " + A1);
        int per = 2 * (len + bth);
        System.out.println("PERIMETER OF RECTANGLE IS: " + per);

        System.out.println("            --------------------------------              ");

        System.out.print("ENTER THE RADIUS OF THE CIRCLE: ");
        int rad = sc.nextInt();
        double pi = 3.14;

        double A2 = pi * rad * rad;
        System.out.println("AREA OF THE CIRCLE IS: " + A2);
        double cir = 2 * pi * rad;
        System.out.println("CIRCUMFERENCE OF THE CIRCLE IS: " + cir);
    }
}
