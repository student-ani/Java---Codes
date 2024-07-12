import java.util.Scanner;

class arrayLb {
    public static int[] inputArray() {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the element numbers: ");
        int size = input.nextInt();
        int[] num = new int[size];
        int i = 0;
        while (i < size) {
            System.out.print("Enter the number " + (i + 1) + ": ");
            num[i] = input.nextInt();
            i++;
        }
        return num;

    }
}

