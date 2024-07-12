import java.util.Scanner;

class oddSum{

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to OddSum: \n");
        System.out.print("Enter a number till to print: ");
        int num = input.nextInt();
        int sum = scanner(num);
        System.out.print("Sum till "+"num "+" is "+sum);

    }
    public static int scanner(int read){
        int sum = 0;
        int i = 1;
        while(i <= read){
            sum = sum+i;
            i=i+2;
        }
        return sum;
    }
}