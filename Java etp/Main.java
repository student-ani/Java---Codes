import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(10);
        numbers.add(20);
        numbers.add(30);
        numbers.add(40);
        System.out.println("ArrayList: " + numbers);

        int size = numbers.size();
        System.out.println("Size of the ArrayList: " + size);

        int firstElement = numbers.get(0);
        System.out.println("First element: " + firstElement);

        numbers.remove(2);
        System.out.println("ArrayList after removing element at index 2: " + numbers);
    }
}