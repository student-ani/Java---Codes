// --------------Compound Interest Calculator-----------

import java.util.Scanner;
public class CI {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Compound Interest calculator- ");
        System.out.print("Enter Principal(Rs): ");
        double P = input.nextDouble();
        System.out.print("Enter rate: ");
        double r = input.nextDouble();
        System.out.print("ENter Years: ");
        double t = input.nextDouble();

        double CI = P * Math.pow((1 + r / 100), t);
        System.out.println("Your Final CI is: " + CI);

    }

}
