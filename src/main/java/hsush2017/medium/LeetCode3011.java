package hsush2017.medium;

// https://leetcode.com/problems/find-if-array-can-be-sorted/
public class LeetCode3011 {
    public boolean canSortArray(int[] nums) {
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] > nums[i + 1] && setBits(nums[i]) == setBits(nums[i + 1])) {
                swap(nums, i, i + 1);

                for (int j = i; j > 0; j--) {
                    if (nums[j] < nums[j - 1] && setBits(nums[j]) == setBits(nums[j - 1])) {
                        swap(nums, j, j - 1);
                    }
                }
            }
        }

        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] > nums[i + 1]) {
                return false;
            }
        }

        return true;
    }

    private void swap(int[] nums, int i, int j) {
        int num = nums[i];

        nums[i] = nums[j];
        nums[j] = num;
    }

    private int setBits(int num) {
        return (int) Integer.toBinaryString(num)
                .chars()
                .filter(ch -> ch == '1')
                .count();
    }
}
