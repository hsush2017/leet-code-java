package hsush2017.medium;


import java.util.ArrayList;
import java.util.List;

// https://leetcode.com/problems/expressive-words/
public class LeetCode809 {
    public int expressiveWords(String s, String[] words) {
        List<String> sGroups = groups(s);

        int cnt = 0;

        for (String word : words) {
            if (stretchy(sGroups, groups(word))) {
                cnt++;
            }
        }

        return cnt;
    }

    private boolean stretchy(List<String> list1, List<String> list2) {
        if (list1.size() != list2.size()) {
            return false;
        }

        for (int i = 0; i < list1.size(); i++) {
            String str1 = list1.get(i);
            String str2 = list2.get(i);

            if (!str1.equals(str2) && (str1.length() < 3 || !str1.contains(str2))) {
                return false;
            }

        }

        return true;
    }

    private List<String> groups(String word) {
        List<String> list = new ArrayList<>();

        StringBuilder str = new StringBuilder();
        for (int i = 0; i < word.length(); i++) {
            String ch = word.substring(i, i + 1);

            if ((str.length() == 0) || String.valueOf(str.charAt(0)).equals(ch)) {
                str.append(ch);
            } else {
                list.add(str.toString());
                str = new StringBuilder(ch);
            }
        }

        list.add(str.toString());

        return list;
    }
}
