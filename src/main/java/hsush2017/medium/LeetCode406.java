package hsush2017.medium;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class LeetCode406 {
    public int[][] reconstructQueue(int[][] people) {
        List<int[]> list = Arrays.stream(people).sorted(Comparator.comparing((arr) -> arr[1])).collect(Collectors.toList());
        List<int[]> result = new ArrayList<>();

        for (int[] person : list) {
            if (result.isEmpty()) {
                result.add(person);
                continue;
            }

            int j;
            int cnt = 0;
            for (j = 0; j < result.size(); j++) {
                if (result.get(j)[0] >= person[0] && (++cnt) > person[1]) {
                    break;
                }
            }

            result.add(j, person);
        }

        return result.toArray(new int[][]{});
    }
}
