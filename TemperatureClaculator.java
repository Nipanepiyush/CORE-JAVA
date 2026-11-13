/* Temperature of a city in Fahrenheit degrees is input through
the keyboard. Write a program to convert this temperature
into Centigrade degrees. 

formula :-
(f - 32)*5/9  = celcius
kelvin = celcuis + 273.15 */

import java.util.Scanner;

class TemperatureClaculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("|| TEMPERATURE CONERTOR ||");
        System.out.print("ENTER THE TEMPERATURE IN FEHRENHITE: ");
        double frh = sc.nextInt();
        System.out.println("--------------------------------------");

        double celcius = (frh - 32) * 5 / 9;
        System.out.println("TEMPERATUTRE IN CELCIUS IS: " + celcius + "c");

        double kelvin = celcius + 273.15;
        System.out.println("TEMPETATURE IN KELVIN IS: " + kelvin + "k");
    }
}
