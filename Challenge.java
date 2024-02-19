//       *------------Discount Calculator---------*

import java.util.Scanner;

public class Challenge {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Discount calculator");
        System.out.print("Enter your age: ");
        int age = input.nextInt();
        System.out.println("Are you female? (T/F): ");
        boolean isFemale = input.nextBoolean();

        if (age < 5) {
            System.out.println("You got 75% discount");
        } else if (isFemale) {
            System.out.println("You got 50% discount");
        } else if (age > 60 && !isFemale) { // Combine two conditions use operator &&
            System.out.println("You got 25% discount");
        } else {
            System.out.println("You got no discount");
        }
    }
}