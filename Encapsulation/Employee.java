import MyPackage1.*;

class Employee {
    public static void main(String[] args) {
        test doctor = new test("rahul", 775588271);// constructor with parameter
        test doctor2 = new test();// default constructor
        doctor2.setname("Aniket");
        doctor2.setph(817542574);
        Myclass myclass = new Myclass();
        myclass.print();
        System.out.println(doctor.getname());
        System.out.println(doctor.getph());
        System.out.println(doctor2.getname());
        System.out.println(doctor2.getph());

    }
}
/*
 * class Main{
 * public static void main(String[] args){
 * Employee Engineer = new Employee();
 * Employee Doctor = new Employee("Deepak", 845341257, 112, 28000, 10800);
 * Doctor.setname("Ajay");
 * Doctor.setphone(871204124);
 * System.out.println("Employee Name: "+Engineer.getname());
 * System.out.println("Employee Phone No: "+Engineer.getphone());
 * System.out.println("Employee ID: "+Engineer.getUID());
 * Engineer.SalCount();
 * System.out.println("Employee Name: "+Doctor.getname());
 * System.out.println("Employee Phone No: "+Doctor.getphone());
 * System.out.println("Employee ID: "+Doctor.getUID());
 * Doctor.SalCount();
 * }
 * }
 */
