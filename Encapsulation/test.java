/*This code is not fulfill the condition of encapsulation because encapsulation is used for secuirity purpose(use Access Modifiers) if we not use access modifiers in the code anyone can access the code and change the values.*/
public class test {

    private int empID = 3;
    private String name;
    private int salary = 20000;
    private int incentive = 800;
    private int ph;

    private void countSal() {
        System.out.println(salary + incentive);
    }

    test() {// default constructor
        name = "Radha";
        ph = 831895191;

    }

    test(String empName, int phoneNo) { // Constructor with Parameter
        name = empName;
        ph = phoneNo;
    }

    // getter and setter

    int getph() {
        return ph;
    }

    String getname() {
        return name;
    }

    void setph(int phone) {
        ph = phone;
    }

    void setname(String name) {
        this.name = name;
    }
}
/*
 * class Employee{
 * String name;
 * int phone;
 * int UID;
 * int Salary;
 * int Incentive;
 * 
 * void SalCount(){
 * System.out.println("Total Salary: "+(Salary+Incentive));
 * }
 * Employee(){
 * name = "Aniket";
 * phone = 845274144;
 * UID = 111;
 * Salary = 32000;
 * Incentive = 12200;
 * }
 * Employee(String Name, int Phone, int Uid, int Sal, int Inc){
 * name = Name;
 * phone = Phone;
 * UID = Uid;
 * Salary = Sal;
 * Incentive = Inc;
 * }
 * String getname(){
 * return name;
 * }
 * int getphone(){
 * return phone;
 * }
 * int getUID(){
 * return UID;
 * }
 * void setphone(int phone){
 * this.phone = phone;
 * }
 * void setname(String name){
 * this.name = name;
 * }
 * }
 */
