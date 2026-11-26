/* Develop a Java program to implement a
simple calculator using switch Utatement */

import java.util.Scanner;

public class Calculatore {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("|| SIMPLE CALCULATORE ||");
        System.out.println("-----------------------------");

        System.out.print("ENTER THE VALUES FOR OPERANDS: ");
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();

        System.out.println("ENTER 1 FOR ADDITION");
        System.out.println("ENTER 2 FOR SUBTRACTION");
        System.out.println("ENTER 3 FOR MULTIPLICATION");
        System.out.println("ENTER 4 FOR DIVISION");
        System.out.println("ENTER 5 FOR MODOLOUS");
        System.out.println("\n");

        System.out.print("ENTER YOUR CHOICE: ");
        int choice = sc.nextInt();

        switch (choice) {

            case 1:
                System.out.println("|| PEFORM THE ADDITION ||");
                int sum = n1 + n2;
                System.out.println("ADDITION IS: " + sum);
                break;

            case 2:
                System.out.println("|| PEFORM THE SUBTRACTION ||");
                int sub = n1 - n2;
                System.out.println("SUBTRACTION IS: " + sub);
                break;

            case 3:
                System.out.println("|| PEFORM THE MULTIPLICATION ||");
                int mul = n1 * n2;
                System.out.println("MULTIPLICATION IS: " + mul);
                break;

            case 4:
                System.out.println("|| PEFORM THE DIVISION ||");
                int div = n1 / n2;
                System.out.println("DIVISION IS: " + div);
                break;

            case 5:
                System.out.println("|| PEFORM THE MODOLOUS||");
                int mod = n1 % n2;
                System.out.println("MODOLOUS IS: " + mod);
                break;

            default:
                System.out.println("INVALID CHOICE TRY AGAIN!");
        }

    }
}
