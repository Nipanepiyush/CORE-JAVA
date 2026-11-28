import java.util.Scanner;

public class PrintEvenOddNumbers {
        public static void main(String[] args) {

                Scanner scan = new Scanner(System.in);
                System.out.println("|| PRINT THE EVEN ODD NUMBERS ||");
                System.out.println("--------------------------------");
                System.out.print("Enter Value for N:");
                int N = scan.nextInt();

                if (N <= 0) {
                        System.out.println("Invalid No Can't Print No");
                }

                System.out.println("\nEven NO:");
                for (int i = 1; i <= N; i++) {
                        if (i % 2 == 0) {
                                System.out.print(i + " ");
                        }
                }
                System.out.println("\nOdd No:");
                for (int i = 1; i <= N; i++) {
                        if (i % 2 != 0) {
                                System.out.print(i + " ");
                        }
                }

        }
}