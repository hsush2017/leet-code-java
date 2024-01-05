package hsush2017.medium;

import org.assertj.core.api.Assertions;
import org.junit.Before;
import org.junit.Test;

public class LeetCode957Test {
    private LeetCode957 sut;

    @Before
    public void setUp() throws Exception {
        sut = new LeetCode957();
    }

    @Test
    public void test1() {
        int[] cells = {0, 1, 0, 1, 1, 0, 0, 1};
        int[] expected = {0, 0, 1, 1, 0, 0, 0, 0};

        Assertions.assertThat(sut.prisonAfterNDays(cells, 7)).isEqualTo(expected);
    }

    @Test
    public void test2() {
        int[] cells = {1, 0, 0, 1, 0, 0, 1, 0};
        int[] expected = {0, 0, 1, 1, 1, 1, 1, 0};

        Assertions.assertThat(sut.prisonAfterNDays(cells, 1000000000)).isEqualTo(expected);
    }

    @Test
    public void test3() {
        int[] cells = {1, 1, 0, 0, 0, 0, 1, 1};
        int[] expected = {0, 0, 1, 1, 1, 1, 0, 0};

        Assertions.assertThat(sut.prisonAfterNDays(cells, 7)).isEqualTo(expected);
    }
}