import java.util.Scanner;
public class function {
    public static void main(String[] args) {
        @SuppressWarnings("resource")
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int i=0;
        while(i<n){
            System.out.print(" * ");
            int j=0;
            while(j<i){
                System.out.print(" * ");
                j++;
            }
            System.out.println();
            i++;
        }
       
    }
    
}
