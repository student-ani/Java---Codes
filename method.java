import java.util.Scanner;

public class method {
    public static void main(String[] args) {
        greet();
        int first = readNum();
        int second = readNum();
        int sum = first + second;
        System.out.println("The sum is: " + sum);

    }

    public static void greet() {
        System.out.println("Welcome to Calculator\n");
    }

    public static int readNum() {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter number: ");
        int number = input.nextInt();
        return number;
    }

}