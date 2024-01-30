package src.topkfrequentelements;

import java.util.*;

public class TopKFrequentElements {
    public static void main(String[] args) {
        int[] arr1 = {1, 1, 1, 2, 2, 3};
        int[] arr2 = {1, 1, 2, 2};
        int[] arr3 = {1,1,1,1,2,2,3,3,4};


        System.out.println(Arrays.toString(freqElements(arr1, 1)));
        System.out.println(Arrays.toString(freqElements(arr2, 2)));
        System.out.println(Arrays.toString(freqElements(arr3, 2)));
    }

    public static int[] freqElements(int[] arr, int freq) {
        List<Integer>[] bucket = new List[arr.length + 1];
        Map<Integer, Integer> freqMap = new HashMap<>();

        for (int i : arr) {
            freqMap.put(i, freqMap.getOrDefault(i, 0) + 1
            );
        }

        for (Integer key : freqMap.keySet()) {
            int frequency = freqMap.get(key);
            if(bucket[frequency] == null){
                bucket[frequency] = new ArrayList<>();
            }
            bucket[frequency].add(key);
        }

        List<Integer> res = new ArrayList<>();
        int counter = 0;

        for (int bucketIndex = bucket.length - 1; bucketIndex >= 0
                && counter < freq; bucketIndex--) {
            if(bucket[bucketIndex] != null){
                counter++;
                res.addAll(bucket[bucketIndex]);
            }
        }
        return res.toArray(new int[]);
    }
}
