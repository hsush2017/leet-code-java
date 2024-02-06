package hsush2017.medium;

import java.util.HashMap;
import java.util.Map;

public class LeetCode1679 {
    public int maxOperations(int[] nums, int k) {
        int ans = 0;
        Map<Integer, Integer> map = new HashMap<>();
        for (int num : nums) {
            if (num >= k) {
                continue;
            }

            map.compute(num, (key, value) -> value == null ? 1 : value + 1);
        }

        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if (!map.containsKey(k - entry.getKey())) {
                continue;
            }

            if (entry.getKey() == k - entry.getKey()) {
                if (entry.getValue() < 2) {
                    continue;
                }

                int cnt = entry.getValue() / 2;

                ans += cnt;

                map.computeIfPresent(entry.getKey(), (key, value) -> value - cnt);
            } else {
                int cnt = Math.min(entry.getValue(), map.get(k - entry.getKey()));

                ans += cnt;

                map.computeIfPresent(entry.getKey(), (key, value) -> value - cnt);
                map.computeIfPresent(k - entry.getKey(), (key, value) -> value - cnt);
            }
        }

        return ans;
    }
}
