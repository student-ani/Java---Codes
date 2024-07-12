// Polymorphism        (Overloading the same method but diffrent paRAMeters)

class Features {
    static void add(int a, int b) {
        System.out.println("After Sum: " + (a + b));
    }

    static void add(int a, int b, int c) {
        System.out.println("After sum: " + (a + b + c));
    }

    static void add(double a, double b) {
        System.out.println("After sum: " + (a + b));
    }

}

public class Calculator {
    public static void main(String[] args) {
        Features.add(14, 20);
        Features.add(14, 20, 30);
        Features.add(14.5, 20.5);

    }
}
