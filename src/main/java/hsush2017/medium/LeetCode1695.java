package hsush2017.medium;

import java.util.HashSet;
import java.util.Set;

// https://leetcode.com/problems/maximum-erasure-value/
public class LeetCode1695 {
    public int maximumUniqueSubarray(int[] nums) {
        int left = 0;
        int right = 0;
        int sum = 0;
        int max = 0;
        Set<Integer> set = new HashSet<>();

        while (right < nums.length) {
            if (!set.contains(nums[right])) {
                sum += nums[right];
                max = Math.max(max, sum);

                set.add(nums[right++]);
            } else {
                sum -= nums[left];

                set.remove(nums[left++]);
            }
        }

        return max;
    }
}
