/* Ramesh’s basic salary is input through the keyboard. His
dearness allowance is 40% of basic salary, and house rent
allowance is 20% of basic salary. Write a program to calculate
his gross salary. 

Gross Salary = Basic Salary + HRA + DA */

import java.util.Scanner;

class GrossSalary {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("|| SALARY CALCULATOR ||");
        System.out.print("ENTER YOUR BASIC SALARY: ");
        int basic = sc.nextInt();
        System.out.println("---------------------------------------");

        int DA = basic * 40 / 100;
        int HRA = basic * 20 / 100;
        int gross = basic + DA + HRA;

        System.out.println("YOUR BASIC SALARY IS: " + basic);
        System.out.println("YOUR DEARNESS ALLOWANCE IS: " + DA);
        System.out.println("YOUR HOUSE RENT ALLOWANCE IS: " + HRA);
        System.out.println("---------------------------------------");
        System.out.println("YOUR GROSS SALARY IS: " + gross);

    }
}
