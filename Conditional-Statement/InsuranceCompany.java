/* An Insurance company follows following rules to calculate
premium.

(1) If a person’s health is excellent and the person is between
25 and 35 years of age and lives in a city and is a male
then the premium is Rs. 4 per thousand and his policy
amount cannot exceed Rs. 2 lakhs.

(2) If a person satisfies all the above conditions except that
the sex is female then the premium is Rs. 3 per thousand
and her policy amount cannot exceed Rs. 1 lakh.

(3) If a person’s health is poor and the person is between 25
and 35 years of age and lives in a village and is a male
90 Let Us C then the premium is Rs. 6 per thousand and his policy
cannot exceed Rs. 10,000.

(4) In all other cases the person is not insured.

Write a program to output whether the person should be
insured or not, his/her premium rate and maximum amount
for which he/she can be insured.  */

import java.util.Scanner;

public class InsuranceCompany {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("|| PIYUSH INSURANCE POLICY PRIVATE LIMITED COMPANY ||");
        System.out.println("----------------------------------------------------");

        System.out.print("ENTER THE CUSTOMER HEALTH E / P: ");
        char ch = sc.next().charAt(0);

        System.out.print("ENTER THE CUSTOMER AGE: ");
        int age = sc.nextInt();

        System.out.print("ENTER THE CUSTOMER LOCATION C / V: ");
        char loc = sc.next().charAt(0);

        System.out.print("ENTER THE CUSTOMER GENDER F / M: ");
        char gen = sc.next().charAt(0);

        if (ch == 'E' && age >= 25 && age <= 35 && loc == 'C' && gen == 'M') {

            System.out.println("\nCONGRATULATIONS! YOU ARE ELIGIBLE FOR INSURANCE.");

            System.out.print("ENTER POLICY AMOUNT UPTO 2 LAKH: ");
            int amt = sc.nextInt();

            if (amt > 0 && amt <= 200000) {
                int pre = amt * 4 / 1000;

                System.out.println("\nINSURANCE DETAILS");
                System.out.println("POLICY AMOUNT: Rs. " + amt);
                System.out.println("TOTAL PREMIUM: Rs. " + pre);
            } else {
                System.out.println("INVALID AMOUNT! MAXIMUM POLICY IS Rs. 200000");
            }

        } else if (ch == 'E' && age >= 25 && age <= 35 && loc == 'C' && gen == 'F') {

            System.out.println("\nCONGRATULATIONS! YOU ARE ELIGIBLE FOR INSURANCE.");

            System.out.print("ENTER POLICY AMOUNT (UPTO 1 LAKH): ");
            int amt = sc.nextInt();

            if (amt > 0 && amt <= 100000) {
                int pre = amt * 3 / 1000;

                System.out.println("\nINSURANCE DETAILS");
                System.out.println("POLICY AMOUNT: Rs. " + amt);
                System.out.println("TOTAL PREMIUM: Rs. " + pre);
            } else {
                System.out.println("INVALID AMOUNT! MAXIMUM POLICY IS Rs. 100000");
            }

        } else if (ch == 'P' && age >= 25 && age <= 35 && loc == 'V' && gen == 'M') {

            System.out.println("\nCONGRATULATIONS! YOU ARE ELIGIBLE FOR INSURANCE.");

            System.out.print("ENTER POLICY AMOUNT (UPTO 10000): ");
            int amt = sc.nextInt();

            if (amt > 0 && amt <= 10000) {
                int pre = amt * 6 / 1000;

                System.out.println("\nINSURANCE DETAILS");
                System.out.println("POLICY AMOUNT: Rs. " + amt);
                System.out.println("TOTAL PREMIUM: Rs. " + pre);
            } else {
                System.out.println("INVALID AMOUNT! MAXIMUM POLICY IS Rs. 10000");
            }

        } else {
            System.out.println("\nSORRY! THE PERSON IS NOT ELIGIBLE FOR INSURANCE.");
        }
    }
}
