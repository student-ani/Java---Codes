import java.util.Scanner;
class SumOfdigits{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number: ");
        int num = sc.nextInt();
        int sum = sumdigits(num);
        System.out.println("Your sum is: "+ sum );
    }

    public static int sumdigits(int num) {
        int read=0;
        while (num > 0){
            read = read + num % 10;
            num /= 10;
            
        }
        return read;
        
    }
}
