package src.hindex;

import java.util.Arrays;

public class HIndex {
    public static void main(String[] args) {
        int[] citations = {3, 0, 6, 1, 5};
        System.out.println(hIndex(citations));

    }

    public static int hIndex(int[] citations) {
        int n = citations.length;
        Arrays.sort(citations);

        for (int i = 0; i < n; i++) {
            int hIndex = n - i;
            if(citations[i] >= hIndex){
                return hIndex;
            }
        }

        return 0;
    }


}
