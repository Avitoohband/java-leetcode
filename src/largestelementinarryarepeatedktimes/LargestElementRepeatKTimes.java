package src.largestelementinarryarepeatedktimes;

import java.util.HashMap;
import java.util.Map;

public class LargestElementRepeatKTimes {
    public static void main(String[] args) {

        int[] arr = {1,15,80,42,3,10,8,42,1,16,15,100,90,8,42};
        int k = 2;
        find(arr, k);

    }
    public static void find(int[] arr, int k){
        Map<Integer, Integer> map = new HashMap<>();

        for (int i : arr) {
            if(!map.containsKey(i)){
                map.put(i, 1);
            }else{
                map.put(i, map.get(i) + 1);
            }
        }

        int largestElement = Integer.MIN_VALUE;


        for (int i : arr) {
            largestElement = map.get(i) == k && i > largestElement ? i : largestElement;
        }
        System.out.println(
                largestElement == Integer.MIN_VALUE ? "No such element!" : largestElement
        );
    }
}
