package hsush2017.easy;

// https://leetcode.com/problems/latest-time-by-replacing-hidden-digits/
public class LeetCode1736 {
    public String maximumTime(String time) {
        String[] splitTime = time.split(":");

        return maxHour(splitTime[0]) + ":" + maxMinute(splitTime[1]);
    }

    private String maxHour(String hour) {
        char[] chars = hour.toCharArray();

        if (chars[0] == '?' && chars[1] == '?') {
            chars[0] = '2';
            chars[1] = '3';
        }

        if (chars[0] == '?') {
            chars[0] = chars[1] > '3' ? '1' : '2';
        }

        if (chars[1] == '?') {
            chars[1] = chars[0] == '2' ? '3' : '9';
        }

        return new String(chars);
    }

    private String maxMinute(String minute) {
        char[] chars = minute.toCharArray();

        if (chars[0] == '?' && chars[1] == '?') {
            chars[0] = '5';
            chars[1] = '9';
        }

        if (chars[0] == '?') {
            chars[0] = '5';
        }

        if (chars[1] == '?') {
            chars[1] = '9';
        }

        return new String(chars);
    }
}
