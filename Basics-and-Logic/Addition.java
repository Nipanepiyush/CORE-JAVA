import java.util.*;

public class Addition {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the No:");

        int a = scan.nextInt();
        int b = scan.nextInt();
        float c = scan.nextFloat();

        float sum = a + b + c;

        System.out.println("Total Sum is:" + sum);
    }
}