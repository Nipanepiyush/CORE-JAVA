import java.util.Scanner;

public class PrintEvenOddNumbers {
        public static void main(String[] args) {

                Scanner scan = new Scanner(System.in);
                System.out.print("Enter Value for N:");
                int N = scan.nextInt();

                if (N <= 0) {
                        System.out.println("Invalid No Can't Print No");
                }

                System.out.println("Even NO:");
                for (int i = 1; i <= N; i++) {
                        if (i % 2 == 0) {
                                System.out.println(i + "");
                        }
                }
                System.out.println("Odd No:");
                for (int i = 1; i <= N; i++) {
                        if (i % 2 != 0) {
                                System.out.println(i + "");
                        }
                }

        }
}