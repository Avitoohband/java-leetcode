package src.easy.summaryranges;

import java.awt.*;
import java.util.ArrayList;
import java.util.List;

public class SummaryRangesV2 {
    public static void main(String[] args) {

    }

    public List<String> summaryRanges(int[] nums) {
        List<String> ranges = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            int start = i;
            while (i + 1 < nums.length && nums[i] + 1 == nums[i + 1]) i++;
            if(i == start) ranges.add(String.valueOf(nums[i]));
            else ranges.add(nums[start] + "->" + nums[i]);
        }
        return ranges;
    }
}
