import java.util.Scanner;

public class Elementsearch{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] numArr = arrayLb.inputArray(); 
        System.out.print("Enter the number of search: ");
        int num = input.nextInt();
        int Occurr = noOfOccurr(numArr, num);
        System.out.print("Given number is found "+ Occurr +" times: ");

    }
    public static int noOfOccurr(int[] numAr, int num){
        int occ = 0;
        int i = 0;
        while(i < numAr.length){
            if(numAr[i] == num){
                occ++;
            }
            i++;
        }
        return occ ;
    }
}