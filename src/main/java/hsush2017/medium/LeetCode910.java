package hsush2017.medium;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

// https://leetcode.com/problems/smallest-range-ii/
public class LeetCode910 {
    public int smallestRangeII(int[] nums, int k) {
        if (nums.length == 1) {
            return 0;
        }

        int score = Integer.MAX_VALUE;
        List<Integer> sortedNumbers = Arrays.stream(nums).boxed().sorted(Integer::compareTo).collect(Collectors.toList());

        for (int i = 0; i < sortedNumbers.size(); i++) {
            int min;
            int max;

            int rightMin = sortedNumbers.get(i) - k;
            min = rightMin;
            max = rightMin;

            int rightMax = sortedNumbers.get(sortedNumbers.size() - 1) - k;
            min = Math.min(min, rightMax);
            max = Math.max(max, rightMax);

            if (i > 0) {
                int leftMin = sortedNumbers.get(0) + k;
                min = Math.min(min, leftMin);
                max = Math.max(max, leftMin);

                int leftMax = sortedNumbers.get(i - 1) + k;
                min = Math.min(min, leftMax);
                max = Math.max(max, leftMax);
            }

            score = Math.min(score, max - min);
        }

        return score;
    }
}
