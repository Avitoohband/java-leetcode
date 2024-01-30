package src.quicksort;

import java.util.Arrays;

public class QuickSort {

    public static void main(String[] args) {
        int[] arr = {8, 4, 9, 6, 1, 10, 7};

        quicksort(arr, 0, arr.length - 1);
        System.out.println(Arrays.toString(arr));
    }

    public static void quicksort(int[] arr, int start, int end) {
        if(start >= end) return;

        int pivot = partition(arr, start, end);

        quicksort(arr, start, pivot - 1);
        quicksort(arr, pivot + 1, end);
    }

    private static int partition(int[] arr, int start, int end) {

        int pivot = arr[end];

        int indexOfPivot = start;
        for (int i = start; i < end; i++) {
            if (arr[i] < pivot) {
                swap(arr, indexOfPivot, i);
                indexOfPivot++;
            }
        }

        swap(arr, indexOfPivot, end);
        return indexOfPivot;
    }

    private static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
