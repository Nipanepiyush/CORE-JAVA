import java.util.*;

public class StudentGradeCalculator {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.print("Enter Maths marks:");
        int a = scan.nextInt();
        System.out.print("Enter Science marks:");
        int b = scan.nextInt();
        System.out.print("Enter English marks:");
        int c = scan.nextInt();
        System.out.print("Enter Hindi marks:");
        int d = scan.nextInt();
        System.out.print("Enter Marathi marks:");
        int e = scan.nextInt();

        int sum = (a + b + c + d + e);
        System.out.println("Sum: " + sum);

        int percentage = (sum / 5);
        System.out.println("Percentage: " + percentage);

        if (percentage >= 90) {
            System.out.println("Grade: A");
        } else if (percentage >= 80) {
            System.out.println("Grade: B");
        } else if (percentage >= 70) {
            System.out.println("Grade: C");
        } else if (percentage >= 60) {
            System.out.println("Grade: D");
        } else {
            System.out.println("Fail");
        }
    }
}
