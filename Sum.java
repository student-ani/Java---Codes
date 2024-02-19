import java.util.Scanner;

public class Sum {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to our Calculator");
        System.out.print("Enter first Number: ");
        int firstNum = input.nextInt();
        System.out.print("Please,Enter second number: ");
        int secondNum = input.nextInt();
        int sum = firstNum + secondNum;
        // int avg = (firstNum + secondNum)/2;
        System.out.println("sum of your numbers is: " + sum);
    }

}
