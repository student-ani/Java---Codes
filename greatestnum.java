// ---------* Find greater number*--------

import java.util.Scanner;

public class greatestnum {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("greatest number finder- ");
        System.out.print("enter number A: ");
        int A = input.nextInt();
        System.out.print("enter number B: ");
        int B = input.nextInt();
        System.out.print("enter number C: ");
        int C = input.nextInt();

        if (A >= B && A >= C) {
            System.out.println(A + " is greater than compare of all numbers");
        } else if (B >= A && B >= C) {
            System.out.print(B + " is greater than compare of all numbers");
        } else { // (C > A && C > B){
            System.out.println(C + " is greater than compare of all numbers");
        }
    }

}
