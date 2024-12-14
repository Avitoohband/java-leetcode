package src.easy.twosum;

import java.util.*;

public class TwoSumV2 {
    public static void main(String[] args) {
        Integer[] numbers = new Integer[]{7,2,11,9};
        Integer target = 16;
        System.out.println(Arrays.toString(twoSum(numbers, target)));
    }

    private static Integer[] twoSum(Integer[] numbers, Integer target){
        Map<Integer,Integer> map = new HashMap<>();

        for (int i = 0; i < numbers.length; i++) {
            int diff = target - numbers[i];
            if (map.containsKey(diff)){
                return new Integer[]{map.get(diff),i};
            }
            map.put(numbers[i], i );
        }
        return new Integer[]{};
    }
}
