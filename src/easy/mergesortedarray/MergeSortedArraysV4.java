package src.easy.mergesortedarray;

public class MergeSortedArraysV4 {
    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        int k = m + n - 1;
        m--;
        n--;
        while (m >= 0 && n >= 0) {
            nums1[k--] = nums1[m] > nums2[n] ? nums1[m--] : nums2[n--];

        }
        while(n >= 0 ){
            nums1[k--] = nums2[n--];
        }
    }
}
