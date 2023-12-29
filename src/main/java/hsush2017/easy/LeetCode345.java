package hsush2017.easy;

import java.util.Stack;

// https://leetcode.com/problems/reverse-vowels-of-a-string/
public class LeetCode345 {
    public String reverseVowels(String s) {
        char[] chars = s.toCharArray();
        Stack<Character> stack = new Stack<>();

        for (char aChar : chars) {
            if (isVowel(aChar)) {
                stack.push(aChar);
            }
        }

        for (int i = 0; i < chars.length; i++) {
            if (isVowel(chars[i])) {
                chars[i] = stack.pop();
            }
        }

        return new String(chars);
    }

    private boolean isVowel(char ch) {
        return ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' ||
                ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U';
    }
}
