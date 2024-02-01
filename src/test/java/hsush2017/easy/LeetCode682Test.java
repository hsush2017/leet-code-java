package hsush2017.easy;

import org.assertj.core.api.Assertions;
import org.junit.Before;
import org.junit.Test;

public class LeetCode682Test {
    private LeetCode682 sut;

    @Before
    public void setUp() throws Exception {
        sut = new LeetCode682();
    }

    @Test
    public void test1() {
        String[] operations = {"5", "2", "C", "D", "+"};

        int ans = sut.calPoints(operations);

        Assertions.assertThat(ans).isEqualTo(30);
    }

    @Test
    public void test2() {
        String[] operations = {"5", "-2", "4", "C", "D", "9", "+", "+"};

        int ans = sut.calPoints(operations);

        Assertions.assertThat(ans).isEqualTo(27);
    }

    @Test
    public void test3() {
        String[] operations = {"1", "C"};

        int ans = sut.calPoints(operations);

        Assertions.assertThat(ans).isEqualTo(0);
    }
}