import java.util.Scanner;

public class MobileRechargeSystem {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Choose Recharge Plan");
        System.out.println("1 = RS.199");
        System.out.println("2 = RS.399");
        System.out.println("3 = RS.599");

        int a = scan.nextInt();

        switch (a) {
            case 1:
                System.out.println("RS.199 plan");
                System.out.println("Valid up to: 30 Days");
                System.out.println("Data: 1.5GB/day");
                break;

            case 2:
                System.out.println("RS.399 plan");
                System.out.println("Valid up to: 60 Days");
                System.out.println("Data: 2.5GB/day");
                break;
            case 3:
                System.out.println("RS.399 plan");
                System.out.println("Valid up to: 90 Days");
                System.out.println("Data: 3.5GB/day");
                break;
            default:
                System.out.println("Invalid Plan");
                ;

        }
    }

}
