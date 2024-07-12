public class Student {
    String name;
    int age;
    int rollNo;
    String Address;

    public Student(String name, int age, int rollNo, String Address) {
        this.name = name;
        this.age = age;
        this.rollNo = rollNo;
        this.Address = Address;
    }

    @Override
    public String toString() {
        return "Student Details: \n{name: " + name
                + ", age: " + age
                + ",rollNo : " + rollNo
                + ", Address: " + Address + "} ";

    }

    public static void main(String[] args) {
        Student s1 = new Student("Anuj", 28, 12, "Room no: 10, BAde baab ki Chowki-Panwel, Mumbai");
        System.out.println(s1);

    }

}
