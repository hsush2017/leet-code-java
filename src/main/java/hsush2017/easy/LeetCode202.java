package hsush2017.easy;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

// https://leetcode.com/problems/happy-number/
public class LeetCode202 {
    public boolean isHappy(int n) {
        Set<Integer> set = new HashSet<>();

        while (true) {
            int sum = Arrays.stream(String.valueOf(n).split(""))
                    .map(Integer::new)
                    .mapToInt(digit -> digit * digit)
                    .sum();

            if (sum == 1) {
                return true;
            }

            if (set.contains(sum)) {
                return false;
            }

            set.add(sum);
            n = sum;
        }
    }
}
