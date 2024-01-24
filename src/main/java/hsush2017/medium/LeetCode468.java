package hsush2017.medium;

// https://leetcode.com/problems/validate-ip-address/
public class LeetCode468 {
    private static final String REGEX_IPV4 = "^(1[0-9][0-9]|2[0-4][0-9]|25[0-5]|[1-9][0-9]|[0-9])\\.(1[0-9][0-9]|2[0-4][0-9]|25[0-5]|[1-9][0-9]|[0-9])\\.(1[0-9][0-9]|2[0-4][0-9]|25[0-5]|[1-9][0-9]|[0-9])\\.(1[0-9][0-9]|2[0-4][0-9]|25[0-5]|[1-9][0-9]|[0-9])$";
    private static final String REGEX_IPV6 = "^[\\da-fA-F]{1,4}:[\\da-fA-F]{1,4}:[\\da-fA-F]{1,4}:[\\da-fA-F]{1,4}:[\\da-fA-F]{1,4}:[\\da-fA-F]{1,4}:[\\da-fA-F]{1,4}:[\\da-fA-F]{1,4}$";

    public String validIPAddress(String queryIP) {
        if (queryIP.matches(REGEX_IPV4)) {
            return "IPv4";
        }

        if (queryIP.matches(REGEX_IPV6)) {
            return "IPv6";
        }

        return "Neither";
    }
}
