package src.sortbniarray;

import java.util.Arrays;

public class SortBinArray {
    public static void main(String[] args) {
        int[] binArray = {0, 1, 0, 0, 1, 1, 0, 1};
        System.out.println(Arrays.toString(countZeroes(binArray)));
        System.out.println(Arrays.toString(twoPointers(binArray)));

    }

    private static int[] twoPointers(int[] binArray) {
        int right = binArray.length;
        int left = 0;

        while (left < right) {

            while (left < right && binArray[left] == 0) {
                left++;
            }
            while (left < right && binArray[right - 1] == 1) {
                right--;
            }

            if(left < right){
                binArray[left] = 0;
                binArray[right - 1] = 1;
            }

        }
        return binArray;
    }

    private static int[] countZeroes(int[] binArray) {
        int zeroCounter = 0;
        for (int isZero : binArray) {
            zeroCounter = isZero == 0 ? zeroCounter + 1 : zeroCounter;
        }

        for (int i = 0; i < binArray.length; i++) {
            if (zeroCounter > 0) {
                binArray[i] = 0;
                zeroCounter--;
            } else {
                binArray[i] = 1;
            }
        }
        return binArray;
    }
}
