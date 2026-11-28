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

        System.out.print("\nENTER THE RADIUS OF THE CIRCLE: ");
        int rad = sc.nextInt();
        double pi = 3.14;

        double A2 = pi * rad * rad;
        System.out.println("AREA OF THE CIRCLE IS: " + A2);
        double cir = 2 * pi * rad;
        System.out.println("CIRCUMFERENCE OF THE CIRCLE IS: " + cir);
        System.out.println("            --------------------------------              ");

        System.out.print("\nENTER THE SIDES OF THE SQUARE: ");
        int side = sc.nextInt();
        int A3 = side * side;
        int per2 = 4 * side;
        System.out.println("AREA Of RECTANGLE IS: " + A3);
        System.out.println("PERIMETER OF SQUARE IS: " + per2);
        System.out.println("            --------------------------------              ");

        System.out.println("ENTER THE BREADTH AND HEIGHT OF THE TRIANGLE: ");
        int t1 = sc.nextInt(), t2 = sc.nextInt();
        System.out.println("ENTER THE SIDES OF THE TEIANGLE: ");
        int s1 = sc.nextInt(), s2 = sc.nextInt(), s3 = sc.nextInt();
        int A4 = 1 / 2 * t1 * t2;
        int per3 = s1 + s2 + s3;
        System.out.println("AREA OF THE TRIANGLE IS: " + A4);
        System.out.println("PERIMETR OF THE TRAINGLE IS: " + per3);
        System.out.println("            --------------------------------              ");

        System.out.println("ENTER THE SIDE OF CUBE: ");
        int sc1 = sc.nextInt();
        int scA = sc1 * sc1 * sc1;
        System.out.println("THE VOLUME OF CUBE IS: " + sc1);
    }
}
