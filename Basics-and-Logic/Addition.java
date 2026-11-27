import java.util.*;

public class Addition {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("|| ARATHMATIC OPERATIONS ||");
        System.out.println("---------------------------------");
        System.out.print("ENTER THE TWO NUMBERS N1 & N2:");

        int a = scan.nextInt();
        int b = scan.nextInt();

        int sum = a + b;
        int sub = a - b;
        int mul = a * b;
        int div = a / b;
        int mod = a % b;
        System.out.print("\n");
        System.out.println("ADDITION FOR N1 & N2 IS:" + sum);
        System.out.println("SUBTRACTION FOR N1 & N2 IS:" + sub);
        System.out.println("MULTIPLICATION FOR N1 & N2 IS:" + mul);
        System.out.println("DIVISION FOR N1 & N2 IS:" + div);
        System.out.println("MODOLOUS FOR N1 & N2 IS:" + mod);
    }
}