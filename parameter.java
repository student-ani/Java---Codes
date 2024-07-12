public class parameter {
    public static void main(String[] args) {
        int num = sumNum(68,99);
        System.out.println("Your sum is: " +num );
        System.out.println("Your sum is: " + sumNum(28,89));
    }

    public static int sumNum(int first, int second){
        System.out.println("First num is: " + first);
        System.out.println("Second num is: " + second);
        int sum = first + second;
        return sum;
    }
}
