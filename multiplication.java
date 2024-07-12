import java.util.Scanner;

class multiplication {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Multiplication Calculator\n");
        System.out.print("Enter number: ");
        int num = input.nextInt();
        multiplicationTable(num);
    }

    public static void multiplicationTable(int num){
        int i = 1;
        while(i<=10){
            System.out.println(num + " X " + i + " = " + (num*i));
            i++;
        }

    }
}