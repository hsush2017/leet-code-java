package hsush2017.medium;


import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

// https://leetcode.com/problems/prison-cells-after-n-days/
public class LeetCode957 {
    public int[] prisonAfterNDays(int[] cells, int n) {
        Map<Integer, String> map = new HashMap<>();

        int i = 0;
        while (true) {
            int[] newCells = new int[cells.length];
            for (int j = 0; j < cells.length; j++) {
                if (j == 0 || j == cells.length - 1) {
                    newCells[j] = 0;
                } else {
                    newCells[j] = cells[j - 1] == cells[j + 1] ? 1 : 0;
                }
            }

            String str = Arrays.stream(newCells).mapToObj(String::valueOf).collect(Collectors.joining());
            if (map.containsValue(str)) {
                break;
            }

            map.put(i++, str);
            cells = newCells;
        }

        int num = (n - 1) % map.size();

        return Arrays.stream(map.get(num).split("")).mapToInt(Integer::valueOf).toArray();
    }
}
