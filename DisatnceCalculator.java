/*The distance between two cities (in km.) is input through the
keyboard. Write a program to convert and print this distance
in meters, feet, inches and centimeters. 

formulas

kilometer to meter = 1km equal to 1000m;
meter to feet = 1m equal to 3.28 feet;
feet to inch = 1feet equal to 12 inch;
inch to centimeter = 1inch equal to 2.5centimeter;*/

import java.util.Scanner;

public class DisatnceCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("|| CONVERT THE DISTANCE INTO METER FEET INCH & CENTIMETER ||");
        System.out.print("ENTER THE DISTANCE IN KILOMETER: ");
        double km = sc.nextDouble();
        System.out.println("----------------------------------------------");

        double meter = km * 1000;
        System.out.println(km + " KM IN METER IS " + meter + " METER");

        double feet = meter * 3.28;
        System.out.println(meter + " METER IN FEET IS " + feet + " FEET");

        double inch = feet * 12;
        System.out.println(feet + " FEET IN INCH IS " + inch + " INCH");

        double centimeter = inch * 2.54;
        System.out.println(inch + " INCH IN CENTIMETER IS " + centimeter + " CENTIMETER");
    }
}
