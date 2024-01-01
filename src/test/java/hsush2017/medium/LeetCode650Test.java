package hsush2017.medium;

import org.assertj.core.api.Assertions;
import org.junit.Before;
import org.junit.Test;

public class LeetCode650Test {
    private LeetCode650 sut;

    @Before
    public void setUp() throws Exception {
        sut = new LeetCode650();
    }

    @Test
    public void test1() {
        Assertions.assertThat(sut.minSteps(1)).isEqualTo(0);
    }

    @Test
    public void test2() {
        Assertions.assertThat(sut.minSteps(2)).isEqualTo(2);
    }

    @Test
    public void test3() {
        Assertions.assertThat(sut.minSteps(3)).isEqualTo(3);
    }

    @Test
    public void test4() {
        Assertions.assertThat(sut.minSteps(4)).isEqualTo(4);
    }
}