package hsush2017.medium;

// https://leetcode.com/problems/best-sightseeing-pair/
public class LeetCode1014 {
    public int maxScoreSightseeingPair(int[] values) {
        int score = 0;
        int previousSum = 0;

        for (int i = 0; i < values.length; i++) {
            score = Math.max(score, previousSum + values[i] - i);
            previousSum = Math.max(previousSum, values[i] + i);
        }

        return score;
    }
}
