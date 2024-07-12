import java.util.Scanner;

class array {
    /*
     * public static void main(String[] args) {
     * int [] myArr = {22, 14, 3, 56, 74};
     * int index = 0;
     * while (index <myArr.length) {
     * System.out.println(myArr[index]);
     * index++;
     * 
     * }
     * }
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] myArr = { 10, 23, 25, 41, 28, 45 };
        System.out.print("Enter the number that you want to be search: ");
        int num = input.nextInt();
        boolean found = found(myArr, num);
        if (found){
            System.out.println("Number found in array");
        } else {
            System.out.println("Number not found in array");
        }
    }
    public static boolean found(int[] myArr, int num){
        int index = 0;
        while (index < myArr.length) {
            if (myArr[index] == num) {
                return true;
            }
            index++;
            
        }
         return false; 
        
    }

}