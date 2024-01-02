package hsush2017.easy;

import java.util.ArrayList;
import java.util.List;

// https://leetcode.com/problems/find-words-containing-character/
public class LeetCode2942 {
    public List<Integer> findWordsContaining(String[] words, char x) {
        List<Integer> ans = new ArrayList<>();

        for (int i = 0; i < words.length; i++) {
            String word = words[i];

            if (word.indexOf(x) >= 0) {
                ans.add(i);
            }
        }

        return ans;
    }
}
