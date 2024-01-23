package hsush2017.easy;

// https://leetcode.com/problems/sqrtx/
public class LeetCode69 {
    public int mySqrt(int x) {
        if (x == 0) {
            return 0;
        }

        long i;
        for (i = 1; i < x / 2; i++) {
            if (i * i == (long) x) {
                return (int) i;
            } else if (i * i > x) {
                break;
            }
        }

        return i * i > x ? (int) i - 1 : (int) i;
    }
}
