package hsush2017.medium;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

// https://leetcode.com/problems/remove-nth-node-from-end-of-list/
public class LeetCode19 {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        Map<Integer, ListNode> map = toMap(head);

        if (n == map.size()) {
            return map.get(1);
        } else {
            map.get(map.size() - n - 1).next = map.get(map.size() - n + 1);
        }

        return map.get(0);
    }

    private Map<Integer, ListNode> toMap(ListNode head) {
        Map<Integer, ListNode> map = new HashMap<>();

        while (head != null) {
            map.put(map.size(), head);
            head = head.next;
        }

        return map;
    }

    static class ListNode {
        int val;
        ListNode next;

        ListNode(int val) {
            this.val = val;
        }

        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            ListNode listNode = (ListNode) o;

            if (val != listNode.val) return false;
            return Objects.equals(next, listNode.next);
        }

        @Override
        public int hashCode() {
            int result = val;
            result = 31 * result + (next != null ? next.hashCode() : 0);
            return result;
        }
    }
}
