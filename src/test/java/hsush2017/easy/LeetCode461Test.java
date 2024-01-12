package hsush2017.easy;

import org.assertj.core.api.Assertions;
import org.junit.Before;
import org.junit.Test;

public class LeetCode461Test {
    private LeetCode461 sut;

    @Before
    public void setUp() throws Exception {
        sut = new LeetCode461();
    }

    @Test
    public void test1() {
        Assertions.assertThat(sut.hammingDistance(1, 4)).isEqualTo(2);
    }

    @Test
    public void test2() {
        Assertions.assertThat(sut.hammingDistance(3, 1)).isEqualTo(1);
    }
}