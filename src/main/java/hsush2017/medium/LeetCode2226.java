package hsush2017.medium;

import java.util.Arrays;

// https://leetcode.com/problems/maximum-candies-allocated-to-k-children
public class LeetCode2226 {
    public int maximumCandies(int[] candies, long kids) {
        int minPile = 0;
        int maxPile = getMaxPile(candies);
        int pile = 0;

        while (minPile <= maxPile) {
            int midPile = minPile + (maxPile - minPile) / 2;
            if (kidsCnt(candies, kids, midPile) >= kids) {
                pile = midPile;
                minPile = midPile + 1;
            } else {
                maxPile = midPile - 1;
            }
        }

        return pile;
    }

    private long kidsCnt(int[] candies, long k, int mid) {
        if (mid == 0) {
            return k;
        }

        long kids = 0;
        for (int candy : candies) {
            kids += candy / mid;
            if (kids >= k) {
                return k;
            }
        }

        return kids;
    }

    private Integer getMaxPile(int[] candies) {
        return Arrays.stream(candies)
                .boxed()
                .max(Integer::compareTo)
                .orElseThrow(() -> new RuntimeException("get max fail"));
    }
}
