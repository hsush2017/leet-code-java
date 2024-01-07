package hsush2017.easy;

// https://leetcode.com/problems/valid-mountain-array/
public class LeetCode941 {
    public boolean validMountainArray(int[] arr) {
        if (arr.length < 3) {
            return false;
        }

        boolean peak = false;
        for (int i = 0; i < arr.length - 2; i++) {
            if (!peak) {
                if (arr[i + 1] > arr[i] && arr[i + 1] > arr[i + 2]) {
                    peak = true;
                } else if (arr[i] >= arr[i + 1] || arr[i + 1] >= arr[i + 2]) {
                    return false;
                }
            } else {
                if (arr[i + 1] > arr[i] && arr[i + 1] > arr[i + 2]) {
                    return false;
                } else if (arr[i] <= arr[i + 1] || arr[i + 1] <= arr[i + 2]) {
                    return false;
                }
            }
        }

        return peak;
    }
}
