package hsush2017.easy;

import org.assertj.core.api.Assertions;
import org.junit.Before;
import org.junit.Test;

public class LeetCode941Test {
    private LeetCode941 sut;

    @Before
    public void setUp() throws Exception {
        sut = new LeetCode941();
    }

    @Test
    public void test1() {
        Assertions.assertThat(sut.validMountainArray(new int[]{2, 1})).isFalse();
    }

    @Test
    public void test2() {
        Assertions.assertThat(sut.validMountainArray(new int[]{3, 5, 5})).isFalse();
    }

    @Test
    public void test3() {
        Assertions.assertThat(sut.validMountainArray(new int[]{0, 3, 2, 1})).isTrue();
    }

    @Test
    public void test4() {
        Assertions.assertThat(sut.validMountainArray(new int[]{0, 1, 2, 3, 4, 5, 6, 7, 8, 9})).isFalse();
    }

    @Test
    public void test5() {
        Assertions.assertThat(sut.validMountainArray(new int[]{9, 8, 7, 6, 5, 4, 3, 2, 1, 0})).isFalse();
    }

    @Test
    public void test6() {
        Assertions.assertThat(sut.validMountainArray(new int[]{0, 1, 2, 1, 2})).isFalse();
    }
}