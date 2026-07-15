import java.util.*;

public class PrintNumbers {
    public static void main(String[] args) {
Scanner scan = new Scanner(System.in);
System.out.print("Enetr the Starting No:");
int start = scan.nextInt();

System.out.print("Enetr the Endinging No:");
int end = scan.nextInt();
   if(start < end ){
    System.out.println("Loop Executed");
 
 for(int a = start; a <= end; a++){
    System.out.println(a);
 }
   }
 else{
    System.out.println("Invalid Input");
 }
    }
}
