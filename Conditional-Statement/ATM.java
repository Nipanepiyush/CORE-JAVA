/* Functioning of an ATM Machine */

import java.util.Scanner;

public class ATM {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("|| ATM MACHINE ||");
        System.out.println("---------------------");

        int balance = 100000;

        System.out.println("ENTER 1 FOR THE AMOUNT WITHDRAWL");
        System.out.println("ENTER 2 FOR THE AMOUNT DEPOSITE");
        System.out.println("ENTER 3 FOR THE CHECK BALANCE");
        System.out.println("ENTER 4 FOR THE EXIT");
        System.out.println("\n");
        System.out.print("ENTER YOUR CHOICE: ");
        int choice = sc.nextInt();
        switch (choice) {

            case 1:
                System.out.println("|| WITHDRAWL AMOUNT FROM BANK ||");
                System.out.println("---------------------------------");
                System.out.print("ENTER THE WITHDRAWL AMOUNT: ");
                int amt = sc.nextInt();
                if (amt <= balance)
                    System.out.println(
                            "TOTAL BALANCE IS: " + (balance - amt) "\nCONGRULATIONS AMOUNT WITHDRAWL SUCCESSFULLY! ");

                else
                    System.out.println("INSUFFICINENT BALANCE \n TOTAL BALANCE IS: " + balance);

                break;
            case 2:
                System.out.println("|| DEPOSITE AMOUNT IN BANK ||");
                System.out.println("-------------------------------");
                System.out.print("ENTER THE DEPOSITE AMOUNT: ");
                int dep = sc.nextInt();
                int total = balance + dep;
                System.out.println("DEPOSITED AMOUT IN ATM IS: " + dep);
                System.out.println("CURRENT AMOUNT IN YOUR BANK ACCOUNT IS: " + total);

                break;

            case 3:
                System.out.println("|| CHECK THE BALANCE IN BANK ACCOUNT ||");
                System.out.println("-------------------------------------------");
                System.out.println("CURRENT BALANCE IN YOUR BANK ACCOUNT IS: " + balance);

                break;

            case 4:
                System.out.println("THANKYOU FOR VISITING!");

                break;

        }
    }
}
