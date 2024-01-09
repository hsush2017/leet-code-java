package hsush2017.easy;

// https://leetcode.com/problems/find-first-palindromic-string-in-the-array/
public class LeetCode2108 {
    public String firstPalindrome(String[] words) {
        for (String word : words) {
            if (palindromic(word)) {
                return word;
            }
        }

        return "";
    }

    private boolean palindromic(String word) {
        int left = 0;
        int right = word.length() - 1;

        while (left < right) {
            if (word.charAt(left) != word.charAt(right)) {
                return false;
            }

            left++;
            right--;
        }

        return true;
    }
}
