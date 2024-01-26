package hsush2017.medium;

import org.assertj.core.api.Assertions;
import org.junit.Before;
import org.junit.Test;

public class LeetCode3011Test {
    private LeetCode3011 sut;

    @Before
    public void setUp() throws Exception {
        sut = new LeetCode3011();
    }

    @Test
    public void test1() {
        Assertions.assertThat(sut.canSortArray(new int[]{8, 4, 2, 30, 15})).isTrue();
    }

    @Test
    public void test2() {
        Assertions.assertThat(sut.canSortArray(new int[]{1, 2, 3, 4, 5})).isTrue();
    }

    @Test
    public void test3() {
        Assertions.assertThat(sut.canSortArray(new int[]{3, 16, 8, 4, 2})).isFalse();
    }

    @Test
    public void test4() {
        Assertions.assertThat(sut.canSortArray(new int[]{75, 34, 30})).isFalse();
    }
}