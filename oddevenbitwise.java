import java.util.Scanner;
public class oddevenbitwise {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Please! enetr Number: ");
        int num = input.nextInt();

        if((num & 1) ==1){
            System.out.println("Given number is odd");
        } else{
            System.out.println("It's Even");
        }
    }
    
}
