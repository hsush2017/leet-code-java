package hsush2017.easy;

// https://leetcode.com/problems/hamming-distance/description/
public class LeetCode461 {
    public int hammingDistance(int x, int y) {
        char[] binaryX = String.format("%32s", Integer.toBinaryString(x)).replaceAll(" ", "0").toCharArray();
        char[] binaryY = String.format("%32s", Integer.toBinaryString(y)).replaceAll(" ", "0").toCharArray();

        int cnt = 0;
        for (int i = 0; i < binaryX.length; i++) {
            if (binaryX[i] != binaryY[i]) {
                cnt++;
            }
        }

        return cnt;
    }
}
