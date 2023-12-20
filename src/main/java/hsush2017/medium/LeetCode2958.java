package hsush2017.medium;

import java.util.HashMap;
import java.util.Map;

// https://leetcode.com/problems/length-of-longest-subarray-with-at-most-k-frequency/
public class LeetCode2958 {
    public int maxSubArrayLength(int[] nums, int k) {
        int max = 0;
        Map<Integer, Integer> count = new HashMap<>();

        for (int left = 0, right = 0; right < nums.length; right++) {
            count.merge(nums[right], 1, Integer::sum);

            while (count.get(nums[right]) > k) {
                count.merge(nums[left], -1, Integer::sum);
                left++;
            }

            max = Math.max(max, right - left + 1);
        }

        return max;
    }


}
