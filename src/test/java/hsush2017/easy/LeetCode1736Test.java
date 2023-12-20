package hsush2017.easy;

import org.assertj.core.api.Assertions;
import org.junit.Before;
import org.junit.Test;

public class LeetCode1736Test {
    private LeetCode1736 sut;

    @Before
    public void setUp() {
        sut = new LeetCode1736();
    }

    @Test
    public void test1() {
        Assertions.assertThat(sut.maximumTime("2?:?0")).isEqualTo("23:50");
    }

    @Test
    public void test2() {
        Assertions.assertThat(sut.maximumTime("0?:3?")).isEqualTo("09:39");
    }

    @Test
    public void test3() {
        Assertions.assertThat(sut.maximumTime("1?:22")).isEqualTo("19:22");
    }

    @Test
    public void test4() {
        Assertions.assertThat(sut.maximumTime("??:3?")).isEqualTo("23:39");
    }
}