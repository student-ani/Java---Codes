import java.util.Scanner;

public class swap {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to swapping station");
        System.out.print("Enter first number A: ");
        int a = input.nextInt();
        System.out.print("Enter second number B: ");
        int b = input.nextInt();
        int c = a;
        a = b;
        b = c;
        System.out.println("Swapping done!...");
        System.out.println("Value of A: " + a);
        System.out.print("Value of B: " + b);
    }
}
