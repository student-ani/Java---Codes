import java.util.Scanner;

class Bitwiseoperators {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int first = input.nextInt();
        System.out.print("Enter Second number: ");
        int second = input.nextInt();

        //int result = first & second;   (AND Operator)
        //int result = first | second;   (OR Operator)
        int result = first ^ second;   //(XOR Operator)

        System.out.println("The result of comparision is: " + result);
    }
}