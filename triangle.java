// -----------* Area of Triangle *--------------

import java.util.Scanner;

public class triangle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Area Calculator- ");
        System.out.print("Enter the value of Base in cms: ");
        double Base = input.nextDouble();
        System.out.print("Enter the value of height in cms: ");
        double height = input.nextDouble();

        double Area = (1 * Base * height) / 2;
        System.out.print("The area of a Triangle is: " + Area);

    }
}