import java.util.*;

public class CGPACalculator {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter Your Marks:");

        System.out.print("Enter the Marks of English:");
        int Eng = scan.nextInt();

        System.out.print("Enter the Marks of Math:");
        int Mat = scan.nextInt();

        System.out.print("Enter the Marks of Science:");
        int Sci = scan.nextInt();

        double CGPA = (Eng + Mat + Sci) / 30.0;

        System.out.printf("Your CGPA is:" + CGPA);

    }
}
