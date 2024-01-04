package hsush2017.easy;

// https://leetcode.com/problems/reverse-only-letters/
public class LeetCode917 {
    public String reverseOnlyLetters(String s) {
        int left = 0;
        int right = s.length() - 1;
        char[] chars = s.toCharArray();

        while (left < right) {
            if (!Character.isLetter(chars[left])) {
                left++;
                continue;
            }

            if (!Character.isLetter(chars[right])) {
                right--;
                continue;
            }

            char tmp = s.charAt(left);
            chars[left] = chars[right];
            chars[right] = tmp;
            left++;
            right--;
        }

        return new String(chars);
    }
}
