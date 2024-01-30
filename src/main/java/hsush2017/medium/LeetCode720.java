package hsush2017.medium;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

// https://leetcode.com/problems/longest-word-in-dictionary/
public class LeetCode720 {
    public String longestWord(String[] words) {
        String ans = "";
        Map<Integer, Set<String>> map = Arrays.stream(words).collect(Collectors.groupingBy(String::length, Collectors.toSet()));
        List<Integer> keys = map.keySet().stream().sorted(Integer::compareTo).collect(Collectors.toList());

        for (int i = keys.size() - 1; i >= 0; i--) {
            if (!ans.isEmpty()) {
                break;
            }

            for (String word : map.get(keys.get(i))) {
                if (validate(word, map)) {
                    if (ans.isEmpty()) {
                        ans = word;
                    } else {
                        ans = word.compareTo(ans) < 0 ? word : ans;
                    }
                }
            }
        }

        return ans;
    }

    private boolean validate(String word, Map<Integer, Set<String>> map) {
        boolean valid = true;

        for (int j = 1; j < word.length(); j++) {
            if (map.get(j) == null || !map.get(j).contains(word.substring(0, j))) {
                valid = false;
                break;
            }
        }

        return valid;
    }
}