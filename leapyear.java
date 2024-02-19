import java.util.Scanner;

public class leapyear {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("*-------Leap Yeaar calculator--------*\n");
        System.out.print("Enter year: ");
        int year = input.nextInt();

        if (year % 400 == 0 || (year % 4 == 0 && year % 100 != 0)) {

            // here we use 2 condition 1st is divide by 400 is compulsary to check a
            // condition and 2nd is in 2 parts. From both condition anyone can fulfill the
            // requirement for leap year.

            System.out.println("Your year is leap year");
        } else {
            System.out.println("Your year is not a leap year");
        }
    }
}
