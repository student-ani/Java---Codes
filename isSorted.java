class isSorted {
    public static void main(String[] args) {
        int[] numArr = arrayLb.inputArray();
        boolean isInc = isIncreasing(numArr);
        boolean isDec = isDecreasing(numArr);
        if (isInc || isDec) {
            System.out.println("The array is sorted");
        } else {
            System.out.println("The array is not sorted");
        }

    }

    public static boolean isIncreasing(int[] numAr) {
        for (int i = 0; i < numAr.length - 1; i++) {
            if (numAr[i] > numAr[i + 1]) {
                return false;
            }
        }
        return true;
    }

    public static boolean isDecreasing(int[] numAr) {
        for (int i = 0; i < numAr.length - 1; i++) {
            if (numAr[i] < numAr[i + 1]) {
                return false;
            }
        }
        return true;
    }
}