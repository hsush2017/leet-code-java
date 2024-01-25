package hsush2017.easy;

// https://leetcode.com/problems/count-the-number-of-incremovable-subarrays-i/
public class LeetCode2970 {
    public int incremovableSubarrayCount(int[] nums) {
        int cnt = 0;

        for (int size = 1; size <= nums.length; size++) {
            for (int i = 0; i <= nums.length - size; i++) {
                if (incremovable(nums, i, i + size)) {
                    cnt++;
                }
            }
        }

        return cnt;
    }

    private boolean incremovable(int[] nums, int start, int size) {
        int previous = -1;

        for (int i = 0; i < nums.length; i++) {
            if (i >= start && i < size) {
                continue;
            }

            if (previous >= 0 && nums[i] <= nums[previous]) {
                return false;
            }

            previous = i;
        }

        return true;
    }
}
