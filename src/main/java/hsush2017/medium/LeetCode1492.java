package hsush2017.medium;

import java.util.ArrayList;
import java.util.List;

// https://leetcode.com/problems/the-kth-factor-of-n/
public class LeetCode1492 {
    public int kthFactor(int n, int k) {
        List<Integer> factors = new ArrayList<>(n);

        for (int i = 1; i <= n / 2; i++) {
            if (n % i == 0) {
                factors.add(i);
            }
        }

        factors.add(n);

        return k <= factors.size() ? factors.get(k - 1) : -1;
    }
}
