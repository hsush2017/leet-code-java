package hsush2017.easy;

// https://leetcode.com/problems/minimum-cuts-to-divide-a-circle/
public class LeetCode2481 {
    public int numberOfCuts(int n) {
        if (n == 1) {
            return 0;
        }

        return n % 2 == 0 ? n / 2 : n;
    }
}