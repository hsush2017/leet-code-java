package hsush2017.easy;

import org.assertj.core.api.Assertions;
import org.junit.Before;
import org.junit.Test;

public class LeetCode202Test {
    private LeetCode202 sut;

    @Before
    public void setUp() throws Exception {
        sut = new LeetCode202();
    }

    @Test
    public void test1() {
        Assertions.assertThat(sut.isHappy(19)).isTrue();
    }

    @Test
    public void test2() {
        Assertions.assertThat(sut.isHappy(2)).isFalse();
    }
}