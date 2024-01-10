package hsush2017.medium;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Set;

// https://leetcode.com/problems/minimum-operations-to-convert-number/
public class LeetCode2059 {
    public int minimumOperations(int[] nums, int start, int goal) {
        int cnt = 0;
        Set<Integer> visited = new HashSet<>();
        Queue<Integer> queue = new LinkedList<>();

        queue.offer(start);

        while (!queue.isEmpty()) {
            int size = queue.size();
            for (int i = 0; i < size; i++) {
                int x = queue.poll();

                if (x == goal) {
                    return cnt;
                }

                if (x < 0 || x > 1000 || visited.contains(x)) {
                    continue;
                }

                for (int num : nums) {
                    queue.offer(x + num);
                    queue.offer(x - num);
                    queue.offer(x ^ num);
                }

                visited.add(x);
            }

            cnt++;
        }

        return -1;
    }
}
