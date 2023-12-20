package hsush2017.medium;

import org.assertj.core.api.Assertions;
import org.junit.Before;
import org.junit.Test;

public class LeetCode1492Test {
    private LeetCode1492 sut;

    @Before
    public void setUp() {
        sut = new LeetCode1492();
    }

    @Test
    public void test1() {
        Assertions.assertThat(sut.kthFactor(12, 3)).isEqualTo(3);
    }

    @Test
    public void test2() {
        Assertions.assertThat(sut.kthFactor(7, 2)).isEqualTo(7);
    }

    @Test
    public void test3() {
        Assertions.assertThat(sut.kthFactor(4, 4)).isEqualTo(-1);
    }
}