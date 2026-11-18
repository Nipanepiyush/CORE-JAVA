// Agar kuch chize point me ho na to Double use kar na DataTypes yaad rakh na 

import java.util.*;

public class BMICalculator {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter Weight in kg:");
        double a = scan.nextDouble();
        System.out.print("Enter Height in m:");
        double b = scan.nextDouble();

        double BMI = a / (b * b);
        if (BMI < 18.5) {
            System.out.println("Underweight");
        } else if (BMI >= 18.5 && BMI <= 24.9) {
            System.out.println("Normal");
        } else if (BMI >= 25 && BMI <= 29.9) {
            System.out.println("Overweight");
        } else {
            System.out.println("Obese");
        }
    }
}
