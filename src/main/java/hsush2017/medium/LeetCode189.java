package hsush2017.medium;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

// https://leetcode.com/problems/rotate-array/
public class LeetCode189 {
    public void rotate(int[] nums, int k) {
        k = k % nums.length;

        List<Integer> list = new ArrayList<>(nums.length);
        list.addAll(Arrays.stream(Arrays.copyOfRange(nums, nums.length - k, nums.length)).boxed().collect(Collectors.toList()));
        list.addAll(Arrays.stream(Arrays.copyOfRange(nums, 0, nums.length - k)).boxed().collect(Collectors.toList()));

        for (int i = 0; i < nums.length; i++) {
            nums[i] = list.get(i);
        }
    }
}
