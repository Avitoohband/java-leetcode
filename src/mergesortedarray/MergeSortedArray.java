package src.mergesortedarray;

public class MergeSortedArray {
    public static void main(String[] args) {
//        int[] nums1 = new int[]{1,2,3,0,0,0};
//        int[] nums2 = new int[]{2,5,6};

        int[] nums1 = new int[]{};
        int[] nums2 = new int[]{1};

        Solution.merge(nums1, 0, nums2 , 1);


    }

    public static class Solution {
        public static void merge(int[] nums1, int m, int[] nums2, int n) {
            int i = m+n - 1;
            while (i >= 0 && n > 0 && m > 0){
                if(nums1[m -1] > nums2[n - 1]){
                    nums1[i] = nums1[m -1];
                    m--;
                }else {
                    nums1[i] = nums2[n -1];
                    n--;
                }
                i--;
            }
            while (m > 0){
                nums1[i] = nums1[m -1];
                m--;
                i--;
            }

            while (n > 0){
                nums1[i] = nums2[n -1];
                n--;
                i--;
            }

        }
    }

}
