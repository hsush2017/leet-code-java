package hsush2017.easy;

import org.assertj.core.api.Assertions;
import org.junit.Before;
import org.junit.Test;

public class LeetCode1323Test {
    private LeetCode1323 sut;

    @Before
    public void setUp() {
        sut = new LeetCode1323();
    }

    @Test
    public void test1() {
        Assertions.assertThat(sut.maximum69Number(9669)).isEqualTo(9969);
    }
}