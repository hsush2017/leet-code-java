package hsush2017.medium;

import java.util.ArrayList;
import java.util.List;

// https://leetcode.com/problems/find-k-closest-elements/
public class LeetCode658 {
    public List<Integer> findClosestElements(int[] arr, int k, int x) {
        int minDiffIndex = getMinDiffIndex(arr, x);
        int left = minDiffIndex;
        int right = minDiffIndex;
        List<Integer> closest = new ArrayList<>();

        while (closest.size() < k) {
            if (left == right) {
                closest.add(arr[left--]);
                right++;
            } else if (left < 0) {
                closest.add(arr[right++]);
            } else if (right >= arr.length) {
                closest.add(0, arr[left--]);
            } else {
                if (Math.abs(arr[left] - x) < Math.abs(arr[right] - x) || (Math.abs(arr[left] - x) == Math.abs(arr[right] - x) && arr[left] < arr[right])) {
                    closest.add(0, arr[left--]);
                } else {
                    closest.add(arr[right++]);
                }
            }
        }

        return closest;
    }

    private int getMinDiffIndex(int[] arr, int x) {
        int minDiffIndex = 0;
        int minDiff = Integer.MAX_VALUE;

        for (int i = 0; i < arr.length; i++) {
            if (Math.abs(arr[i] - x) < minDiff) {
                minDiff = Math.abs(arr[i] - x);
                minDiffIndex = i;
            }
        }

        return minDiffIndex;
    }
}