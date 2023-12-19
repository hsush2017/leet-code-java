package hsush2017.easy;

import java.util.*;
import java.util.stream.Collectors;

// https://leetcode.com/problems/merge-similar-items/
public class LeetCode2363 {
    public List<List<Integer>> mergeSimilarItems(int[][] items1, int[][] items2) {
        Map<Integer, Integer> map1 = toMap(items1);
        Map<Integer, Integer> map2 = toMap(items2);
        Map<Integer, Integer> copy1 = new HashMap<>(map1);
        Map<Integer, Integer> mergeMap = new HashMap<>();

        for (Map.Entry<Integer, Integer> entry : copy1.entrySet()) {
            if (map2.containsKey(entry.getKey())) {
                mergeMap.put(entry.getKey(), entry.getValue() + map2.get(entry.getKey()));
                map1.remove(entry.getKey());
                map2.remove(entry.getKey());
            }
        }

        mergeMap.putAll(map1);
        mergeMap.putAll(map2);

        return mergeMap.entrySet().stream()
                .map(e -> Arrays.asList(e.getKey(), e.getValue()))
                .sorted(Comparator.comparing(list -> list.get(0)))
                .collect(Collectors.toList());
    }

    private Map<Integer, Integer> toMap(int[][] items) {
        Map<Integer, Integer> map = new HashMap<>(items.length);

        for (int[] item : items) {
            map.put(item[0], item[1]);
        }

        return map;
    }
}
