package hsush2017.medium;

import org.assertj.core.api.Assertions;
import org.junit.Before;
import org.junit.Test;

public class LeetCode2958Test {
    private LeetCode2958 sut;

    @Before
    public void setUp() {
        sut = new LeetCode2958();
    }

    @Test
    public void test1() {
        Assertions.assertThat(sut.maxSubArrayLength(new int[]{1, 2, 3, 1, 2, 3, 1, 2}, 2)).isEqualTo(6);
    }

    @Test
    public void test2() {
        Assertions.assertThat(sut.maxSubArrayLength(new int[]{1, 2, 1, 2, 1, 2, 1, 2}, 1)).isEqualTo(2);
    }

    @Test
    public void test3() {
        Assertions.assertThat(sut.maxSubArrayLength(new int[]{5, 5, 5, 5, 5, 5, 5}, 4)).isEqualTo(4);
    }

    @Test
    public void test4() {
        Assertions.assertThat(sut.maxSubArrayLength(new int[]{2, 11}, 1)).isEqualTo(2);
    }

    @Test
    public void test5() {
        Assertions.assertThat(sut.maxSubArrayLength(new int[]{1, 2, 2, 2}, 1)).isEqualTo(2);
    }

    @Test
    public void test6() {
        Assertions.assertThat(sut.maxSubArrayLength(new int[]{1, 4, 4, 3}, 1)).isEqualTo(2);
    }

    @Test
    public void test7() {
        Assertions.assertThat(sut.maxSubArrayLength(new int[]{2, 2, 3}, 1)).isEqualTo(2);
    }
}