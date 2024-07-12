import java.util.Scanner;
public class pattern {
    public static void main(String[] args) {
        printpattern();
 
    }
    public static void printpattern(){
        Scanner input = new Scanner(System.in);
        System.out.println("Pattern-\n");
        System.out.print("Enter limit: ");
        int limit = input.nextInt();
        for(int i=0; i<limit; i++){
            for(int j=0; j<i; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }

}
