/* Create a login system using a predefined username and password */

import java.util.Scanner;

public class LoginCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("|| LOGIN AUTHENTICATION SYSTEM ||");
        System.out.println("---------------------------------------");

        String u1 = "Aishwarya Dhole", p1 = "Aishwarya00@0", u2 = "Piyush Nipane", p2 = "Piyush00@0",
                u3 = "Sahil Ramteke", p3 = "Sahil00@0",
                u4 = "Shubham Munde", p4 = "Shubham00@0", u5 = "Tushar Kherde", p5 = "Tushar00@0";

        System.out.print("ENTER THE USERNAME: ");
        String user = sc.nextLine();
        System.out.print("ENTER THE PASSWORD: ");
        String pass = sc.next();

        if (u1 == user && p1 == pass || u2 == user && p2 == pass || u3 == user && p3 == pass || u4 == user && p4 == pass
                || u5 == user && p5 == pass)
            System.out.println("\nCONTRULATIONS YOU ARE LOGIN SUCCESSFULLY!");
        else
            System.out.println("\nCHECK THE LOGIN CREDENTIALS TRY AGAIN!");

    }
}
