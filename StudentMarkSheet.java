/* If the marks obtained by a student in five different subjects
are input through the keyboard, find out the aggregate marks
and percentage marks obtained by the student. Assume that
the maximum marks that can be obtained by a student in each
subject is 100. */

import java.util.Scanner;

class StudentMarkSheet {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(" || CALCULATE THE AGGREGATE MARKS ||");
        System.out.println("ENTER THE MARKS OBTAIN BY YOU");
        System.out.println("---------------------------------");

        System.out.print("ENTER THE MARKS OBTAIN IN ENGLISH: ");
        int m1 = sc.nextInt();

        System.out.print("ENTER THE MARKS OBTAIN IN MARATHI: ");
        int m2 = sc.nextInt();

        System.out.print("ENTER THE MARKS OBTAIN IN SCIENCE: ");
        int m3 = sc.nextInt();

        System.out.print("ENTER THE MARKS OBTAIN IN HISTORY: ");
        int m4 = sc.nextInt();

        System.out.print("ENTER THE MARKS OBTAIN IN SANAKRIT: ");
        int m5 = sc.nextInt();

        int total = m1 + m2 + m3 + m4 + m5;
        double per = (total / 500.0) * 100;

        System.out.println(" ");
        System.out.println("TOTAL MARKS IS: " + total);
        System.out.printf("TOTAL PERCENTAGE OBTAINED IS: %.2f%%", per);

    }
}