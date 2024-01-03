package hsush2017.medium;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Stream;

// https://leetcode.com/problems/reorder-data-in-log-files/
public class LeetCode937 {
    public String[] reorderLogFiles(String[] logs) {
        List<String> digits = new ArrayList<>(logs.length);
        List<String> letters = new ArrayList<>();

        for (String log : logs) {
            if (isDigitLog(log)) {
                digits.add(log);
            } else {
                letters.add(log);
            }
        }

        letters.sort(Comparator.comparing(String::valueOf, (log1, log2) -> {
            String[] pair1 = log1.split(" ", 2);
            String[] pair2 = log2.split(" ", 2);

            int compare = pair1[1].compareTo(pair2[1]);

            return compare == 0 ? pair1[0].compareTo(pair2[0]) : compare;
        }));

        return Stream.concat(letters.stream(), digits.stream()).toArray(String[]::new);
    }

    private boolean isDigitLog(String log) {
        return log.split(" ")[1].matches("[0-9]+");
    }
}
