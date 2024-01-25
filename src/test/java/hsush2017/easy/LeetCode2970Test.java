package hsush2017.easy;

import org.assertj.core.api.Assertions;
import org.junit.Before;
import org.junit.Test;

public class LeetCode2970Test {
    private LeetCode2970 sut;

    @Before
    public void setUp() throws Exception {
        sut = new LeetCode2970();
    }

    @Test
    public void test1() {
        Assertions.assertThat(sut.incremovableSubarrayCount(new int[]{1, 2, 3, 4})).isEqualTo(10);
    }

    @Test
    public void test2() {
        Assertions.assertThat(sut.incremovableSubarrayCount(new int[]{6, 5, 7, 8})).isEqualTo(7);
    }

    @Test
    public void test3() {
        Assertions.assertThat(sut.incremovableSubarrayCount(new int[]{8, 7, 6, 6})).isEqualTo(3);
    }

    @Test
    public void test4() {
        Assertions.assertThat(sut.incremovableSubarrayCount(new int[]{3, 5, 3, 5})).isEqualTo(6);
    }
}