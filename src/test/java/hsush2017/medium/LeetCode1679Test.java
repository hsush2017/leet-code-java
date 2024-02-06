package hsush2017.medium;

import org.assertj.core.api.Assertions;
import org.junit.Before;
import org.junit.Test;

// https://leetcode.com/problems/max-number-of-k-sum-pairs/
public class LeetCode1679Test {
    private LeetCode1679 sut;

    @Before
    public void setUp() throws Exception {
        sut = new LeetCode1679();
    }

    @Test
    public void test1() {
        Assertions.assertThat(sut.maxOperations(new int[]{1, 2, 3, 4}, 5)).isEqualTo(2);
    }

    @Test
    public void test2() {
        Assertions.assertThat(sut.maxOperations(new int[]{3, 1, 3, 4, 3}, 6)).isEqualTo(1);
    }

    @Test
    public void test3() {
        Assertions.assertThat(sut.maxOperations(new int[]{3, 5, 1, 5}, 2)).isEqualTo(0);
    }

    @Test
    public void test4() {
        Assertions.assertThat(sut.maxOperations(new int[]{4, 4, 1, 3, 1, 3, 2, 2, 5, 5, 1, 5, 2, 1, 2, 3, 5, 4}, 2)).isEqualTo(2);
    }
}