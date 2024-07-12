package myPackage2;

public class Car {
    public String color;
    public String model;
    private double price;
    private long fuelLevel;

    public Car() {

    }
    @Override
    public String toString() {
        return "Car [color=" + color
                + ", model=" + model
                + ", price=" + price
                + ", fuelLevel=" + fuelLevel + "]";
    }

    public Car(String color, String model, double price, long fuelLevel) {
        this.color = color;
        this.model = model;
        this.price = price;
        this.fuelLevel = fuelLevel;
    }


}
