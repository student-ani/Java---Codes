
/*import java.util.Scanner;
class Factorial{
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int num = read.nextInt();
        long fact = factorial(num);
        System.out.println("Your factorial is: " + fact);
    }
    public static long factorial(int num){
        if(num < 2){
        return 1; 
        }
        long fact = 1;
        int i =2;
        while(i <= num){
            fact = fact * i;
        i++;
        }
        return fact;

    }
}*/
import java.util.Scanner;

class Factorial {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        System.out.print("Enter number: ");
        int num = read.nextInt();
        long sum = factMethod(num);
        System.out.print("Value of " + num + "!" + " is " + sum);
    }

    public static long factMethod(int num) {
        int i = 1;
        int fact = 1;
        while (i <= num) {
            fact *= i;
            i++;
        }
        return fact;

    }
}