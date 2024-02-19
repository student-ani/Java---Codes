
// -----------------* SI calculator *-----------------

import java.util.Scanner;

public class SI {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Simple Interest Calculator- ");

        System.out.print("Enter the Principal(Rs): ");
        double p = input.nextDouble();
        System.out.print("Enter the Rate(%): ");
        double r = input.nextDouble();
        System.out.print("Enter Years: ");
        double t = input.nextDouble();

        double si = (p * r * t) / 100;
        System.out.println("Your Final SI is " + si + "Rs ");

    }

}
