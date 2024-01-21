package hsush2017.easy;

import java.util.Arrays;

// https://leetcode.com/problems/merge-sorted-array/
public class LeetCode88 {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int[] arr1 = Arrays.copyOfRange(nums1, 0, m);

        int n1 = 0;
        int a1 = 0;
        int n2 = 0;
        while (n1 < m + n) {
            if (a1 < m && n2 < n) {
                nums1[n1++] = arr1[a1] <= nums2[n2] ? arr1[a1++] : nums2[n2++];
            } else {
                nums1[n1++] = a1 == m ? nums2[n2++] : arr1[a1++];
            }

        }
    }
}
