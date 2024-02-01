package src.topkfrequentelements;

import java.util.*;

public class TopKFrequentElements {
    public static void main(String[] args) {
        int[] nums1 = {1, 1, 1, 2, 2, 3};
        int[] nums2 = {1, 1, 2, 2};
        int[] nums3 = {1, 1, 1, 1, 2, 2, 3, 3, 4};


        System.out.println(Arrays.toString(freqElements(nums1, 1)));
        System.out.println(Arrays.toString(freqElements(nums2, 2)));
        System.out.println(Arrays.toString(freqElements(nums3, 2)));
    }

    public static int[] freqElements(int[] nums, int k) {
        Map<Integer, Integer> freqMap = new HashMap<>();
        List<Integer>[] bucketList = new List[nums.length + 1];

        for (int num : nums) {
            freqMap.put(num, freqMap.getOrDefault(num, 0) + 1);
        }

        for (Integer key : freqMap.keySet()) {
            Integer freq = freqMap.get(key);
            if (bucketList[freq] == null) bucketList[freq] = new ArrayList<>();
            bucketList[freq].add(key);
        }

        List<Integer> res = new ArrayList<>();
        for (int i = bucketList.length - 1; i >= 0 && res.size() < k; i--) {
            if (bucketList[i] != null) res.addAll(bucketList[i]);
        }

        return res.stream().mapToInt(num -> num).toArray();
    }
}
