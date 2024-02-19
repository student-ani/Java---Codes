import java.util.Scanner;
public class welcome {
    public static void main(String[] args){
        Scanner view = new Scanner(System.in);
        System.out.print("Please enetr your name: ");
        String name = view.nextLine();
        System.out.println("Welcome "+ name + " to KG Coding");
    }

    
}
