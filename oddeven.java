// ------------*odd/Even*------------
import java.util.Scanner;

public class oddeven {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Number Checker- \n");
        System.out.print("Please, Enter number: ");
        int num = input.nextInt();

        if (num % 2 == 0) {
            System.out.println("Your Number is even");
        } else {
            System.out.println("It's odd Number");
        }

    }

}
