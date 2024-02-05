package hsush2017.medium;

import java.util.HashMap;
import java.util.Map;

// https://leetcode.com/problems/replace-the-substring-for-balanced-string/
public class LeetCode1234 {
    public int balancedString(String s) {
        int balancedSize = s.length() / 4;
        Map<String, Integer> map = toMap(s);
        int ans = Integer.MAX_VALUE;

        if (balanced(map, balancedSize)) {
            return 0;
        }

        for (int left = 0, right = 0; left < s.length(); left++) {
            while (right < s.length() && !balanced(map, balancedSize)) {
                map.computeIfPresent(String.valueOf(s.charAt(right)), (k, v) -> v - 1);
                right++;
            }

            if (!balanced(map, balancedSize)) {
                break;
            }

            ans = Math.min(ans, right - left);

            map.computeIfPresent(String.valueOf(s.charAt(left)), (k, v) -> v + 1);
        }

        return ans;
    }

    private boolean balanced(Map<String, Integer> map, int balancedSize) {
        return map.get("Q") <= balancedSize &&
                map.get("W") <= balancedSize &&
                map.get("E") <= balancedSize &&
                map.get("R") <= balancedSize;
    }

    private static Map<String, Integer> toMap(String s) {
        Map<String, Integer> map = new HashMap<>();
        map.put("Q", 0);
        map.put("W", 0);
        map.put("E", 0);
        map.put("R", 0);

        for (String ch : s.split("")) {
            map.computeIfPresent(ch, (k, v) -> v + 1);
        }

        return map;
    }
}