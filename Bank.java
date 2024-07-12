public abstract class Bank {
    String name;

    abstract void readData();

    abstract void writeData();

    abstract void displayData();

}

class Admin extends Bank {
    void readData() {

    }

    void writeData() {

    }

    void displayData() {

    }
}

class Customer extends Bank {

    @Override
    void writeData() {

    }

    @Override
    void readData() {
       
    }

    @Override
    void displayData() {
       
    }
}