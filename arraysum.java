import java.util.Scanner;

class arraysum {
    public static void main(String[] args) {
        int [] myarr = arrayLb.inputArray();
        long sum = sum(myarr);
        int avg = average(myarr);
        System.out.println("The sum is: " + sum);
        System.out.println("The average is: " + avg);

    }
    public static long sum(int[] myarr){
        long sum = 0;
        int i =0;
        while(i<myarr.length){
            sum += myarr[i];
            i++;
        }
        return sum;
    }
    public static int average(int[] myarr){
        long sum = sum(myarr);

        return (int) (sum / myarr.length);
    }
}