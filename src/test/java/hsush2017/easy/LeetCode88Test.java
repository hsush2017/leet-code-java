package hsush2017.easy;

import org.junit.Before;
import org.junit.Test;

public class LeetCode88Test {
    private LeetCode88 sut;

    @Before
    public void setUp() throws Exception {
        sut = new LeetCode88();
    }

    @Test
    public void test1() {
        sut.merge(new int[]{1, 2, 3, 0, 0, 0}, 3, new int[]{2, 5, 6}, 3);
    }

    @Test
    public void test2() {
        sut.merge(new int[]{1}, 1, new int[]{}, 0);
    }

    @Test
    public void test3() {
        sut.merge(new int[]{0}, 0, new int[]{1}, 1);
    }
}