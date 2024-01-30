package src.kthlargestelementinarray;

public class KthLargestElementInArrayQuickSelect {
    public static void main(String[] args) {
        int[] nums = {3, 2, 1, 5, 6, 4};
        int k = 2;

        System.out.println(findKthLargest(nums, k));
    }

    public static int findKthLargest(int[] nums, int k) {
        return quickSelect(nums, 0, nums.length - 1, nums.length - k);
    }

    public static int quickSelect(int[] nums, int start, int end, int k) {
        if (start == end) return nums[start];

        int pivot = partition(nums, start, end);

        if (k < pivot) {
            return quickSelect(nums, start, pivot - 1, k);
        } else if (k > pivot) {
            return quickSelect(nums, pivot + 1, end, k);
        }
        return nums[k];
    }

    private static int partition(int[] nums, int start, int end) {
        int pivot = nums[end];
        int pivotIndex = start;

        for (int i = start; i < end; i++) {
            if (nums[i] < pivot) {
                swap(nums, i, pivotIndex++);
            }
        }
        swap(nums, pivotIndex, end);
        return pivotIndex;
    }

    private static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
