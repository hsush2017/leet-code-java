package hsush2017.medium;

import org.assertj.core.api.Assertions;
import org.junit.Before;
import org.junit.Test;

public class LeetCode19Test {
    private LeetCode19 sut;

    @Before
    public void setUp() throws Exception {
        sut = new LeetCode19();
    }

    @Test
    public void test1() {
        LeetCode19.ListNode head = new LeetCode19.ListNode(1, new LeetCode19.ListNode(2, new LeetCode19.ListNode(3, new LeetCode19.ListNode(4, new LeetCode19.ListNode(5)))));
        LeetCode19.ListNode expect = new LeetCode19.ListNode(1, new LeetCode19.ListNode(2, new LeetCode19.ListNode(3, new LeetCode19.ListNode(5))));

        Assertions.assertThat(sut.removeNthFromEnd(head, 2)).isEqualTo(expect);
    }

    @Test
    public void test2() {
        LeetCode19.ListNode head = new LeetCode19.ListNode(1);
        LeetCode19.ListNode expect = null;

        Assertions.assertThat(sut.removeNthFromEnd(head, 1)).isEqualTo(expect);
    }

    @Test
    public void test3() {
        LeetCode19.ListNode head = new LeetCode19.ListNode(1, new LeetCode19.ListNode(2));
        LeetCode19.ListNode expect = new LeetCode19.ListNode(1);

        Assertions.assertThat(sut.removeNthFromEnd(head, 1)).isEqualTo(expect);
    }

    @Test
    public void test4() {
        LeetCode19.ListNode head = new LeetCode19.ListNode(1, new LeetCode19.ListNode(2));
        LeetCode19.ListNode expect = new LeetCode19.ListNode(2);

        Assertions.assertThat(sut.removeNthFromEnd(head, 2)).isEqualTo(expect);
    }

    @Test
    public void test5() {
        LeetCode19.ListNode head = new LeetCode19.ListNode(1, new LeetCode19.ListNode(2, new LeetCode19.ListNode(3)));
        LeetCode19.ListNode expect = new LeetCode19.ListNode(1, new LeetCode19.ListNode(3));

        Assertions.assertThat(sut.removeNthFromEnd(head, 2)).isEqualTo(expect);
    }
}