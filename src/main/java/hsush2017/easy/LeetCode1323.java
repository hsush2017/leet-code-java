package hsush2017.easy;

// https://leetcode.com/problems/maximum-69-number/
public class LeetCode1323 {
    public int maximum69Number(int num) {
        char[] chars = String.valueOf(num).toCharArray();
        for (int i = 0; i < chars.length; i++) {
            if (chars[i] == '6') {
                chars[i] = '9';
                break;
            }
        }

        return Integer.parseInt(new String(chars));
    }
}
