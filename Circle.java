import java.util.Scanner;

public class Circle {
    double radius;

    Circle(double radius) {
        this.radius = radius;
    }

    double getCircumference() {
        return 2 * Math.PI * radius;
    }

    double getArea() {
        return Math.PI * Math.pow(radius, 2);

    }

    @Override
    public String toString() {
        return "Circle Proportis: \n Radius: " + radius
                + "\n Circumference is: " + getCircumference()
                + "\n and Area is: " + getArea();
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the radius of the circle: ");
        double radius = input.nextDouble();
        Circle c = new Circle(radius);
        System.out.println(c);

    }

}
