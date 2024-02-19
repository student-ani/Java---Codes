import java.util.Scanner;

public class grademarks {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Grading Your Marks:- \n");
        System.out.print("Enter your marks in(%): ");
        int marks = input.nextInt();

        if (marks >= 90) {
            System.out.println("Your Grade is A");
        } else if (marks >= 75) {
            System.out.println("Your Grade is B");
        } else if (marks >= 60) {
            System.out.println("Your Grade is C");
        } else if (marks >= 30) {
            System.out.println("Your Grade is D");
        } else {
            System.out.println("Your Grade is E");
        }

    }

}
