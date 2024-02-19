// ---------------Fh to Celcius-------------

import java.util.Scanner;

public class celciusconverter {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Fahrenheit to Celsius Converter: ");
        System.out.print("Enter Fahrenheit: ");
        double F = input.nextDouble();

        /*
         * System.out.print("Enter Celsius: ");
         * double C=input.nextDouble();
         */

        double C = ((F - 32) * 5) / 9;
        System.out.println("after Converted in Celsius: " + C + "C");

    }
}
