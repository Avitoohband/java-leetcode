package src.easy.summaryranges;

import javax.xml.stream.events.StartDocument;
import java.util.ArrayList;
import java.util.List;
import java.util.SimpleTimeZone;

public class SummaryRanges {
    public static void main(String[] args) {
        int[] nums = {0, 1, 2, 4, 5, 7};
        System.out.println(summary(nums));

    }

    public static List<String> summary(int[] nums) {
        List<String> summaryRangesList = new ArrayList<>();

        for (int i = 0; i < nums.length; i++) {
            int startOfRange = nums[i];
            while (i + 1 < nums.length && nums[i + 1] == nums[i] + 1) i++;
            summaryRangesList.add(nums[i] != startOfRange ? startOfRange + "->" + nums[i] : String.valueOf(startOfRange));
        }


        return summaryRangesList;
    }
}
