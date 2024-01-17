package hsush2017.easy;

import org.assertj.core.api.Assertions;
import org.junit.Before;
import org.junit.Test;

public class LeetCode2481Test {
    private LeetCode2481 sut;

    @Before
    public void setUp() throws Exception {
        sut = new LeetCode2481();
    }

    @Test
    public void test1() {
        Assertions.assertThat(sut.numberOfCuts(1)).isEqualTo(0);
    }

    @Test
    public void test2() {
        Assertions.assertThat(sut.numberOfCuts(3)).isEqualTo(3);
    }

    @Test
    public void test3() {
        Assertions.assertThat(sut.numberOfCuts(4)).isEqualTo(2);
    }
}