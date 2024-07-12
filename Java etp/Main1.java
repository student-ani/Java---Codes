import java.util.ArrayList;
import java.util.Scanner;

public class Main1 {
    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<>();

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter names (type 'quit' to stop):");

        while (true) {
            String input = scanner.nextLine();
            if (input.equalsIgnoreCase("quit")) {
                break;
            }
            names.add(input);
        }

        System.out.println("Names in the ArrayList:");
        for (String name : names) {
            System.out.println(name);
        }

        scanner.close();
    }
}