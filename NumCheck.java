// --------* Number check *----------

import java.util.Scanner;

public class NumCheck {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Determine the numbers:-");

        System.out.print("Enter number: ");
        int num = input.nextInt();

        if (num < 0) {
            System.out.println("it's negative number");
        } else if (num > 0) {
            System.out.println("It's Positive number");
        } else {
            System.out.println("it's Zero");
        }

    }

}
