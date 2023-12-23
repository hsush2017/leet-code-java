package hsush2017.easy;

import java.util.Arrays;

// https://leetcode.com/problems/convert-sorted-array-to-binary-search-tree/
public class LeetCode108 {
    public TreeNode sortedArrayToBST(int[] nums) {
        if (nums.length == 0) {
            return null;
        }

        return new TreeNode(nums[nums.length / 2],
                sortedArrayToBST(Arrays.copyOfRange(nums, 0, nums.length / 2)),
                sortedArrayToBST(Arrays.copyOfRange(nums, nums.length / 2 + 1, nums.length))
        );
    }

    static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }
}
