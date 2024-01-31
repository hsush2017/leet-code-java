package hsush2017.medium;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

// https://leetcode.com/problems/longest-absolute-file-path/
public class LeetCode388 {
    public int lengthLongestPath(String input) {
        List<String> list = new ArrayList<>();

        dfs(list, input, 0, "");

        return list.stream()
                .filter(path -> path.contains("."))
                .map(String::length)
                .max(Integer::compareTo)
                .orElse(0);
    }

    private void dfs(List<String> paths, String input, int depth, String path) {
        List<Group> roots = parse(input, depth);

        for (int i = 0; i < roots.size(); i++) {
            int start = roots.get(i).end;
            int end = i == roots.size() - 1 ? input.length() : roots.get(i + 1).start;

            dfs(paths, input.substring(start, end), depth + 1, path + roots.get(i).path);
        }

        if (input.isEmpty()) {

            String str = path.charAt(path.length() - 1) == '\n' ? path.substring(0, path.length() - 1).replace("\n", "/").replace("\t", "")
                    : path.replace("\n", "/").replace("\t", "");

            paths.add(str);
        }
    }

    private List<Group> parse(String input, int depth) {
        Pattern pattern = Pattern.compile(String.format("^\\t{%d}[\\w\\. ]+\\n?", depth), Pattern.MULTILINE);
        Matcher matcher = pattern.matcher(input);

        List<Group> roots = new ArrayList<>();
        while (matcher.find()) {
            roots.add(new Group(matcher.group(), matcher.start(), matcher.end()));
        }

        return roots;
    }

    static class Group {
        String path;
        int start;
        int end;

        public Group(String path, int start, int end) {
            this.path = path;
            this.start = start;
            this.end = end;
        }
    }
}