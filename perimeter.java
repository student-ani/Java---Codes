import java.util.Scanner;

public class perimeter {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Calculator of Perimeter-");
        System.out.println("Enter the value of side A: ");
        double A = input.nextDouble();
        System.out.println("Enter the value of side B: ");
        double B = input.nextDouble();
        System.out.println("Enter the value of side C: ");
        double C = input.nextDouble();
        System.out.println("Enter the value of side D: ");
        double D = input.nextDouble();

        double peri = A + B + C + D;
        System.out.println("Your Perimeter of Rectangle is: " + peri + "cms");

    }
}