package hsush2017.medium;

import org.assertj.core.api.Assertions;
import org.junit.Before;
import org.junit.Test;

public class LeetCode809Test {
    private LeetCode809 sut;

    @Before
    public void setUp() {
        sut = new LeetCode809();
    }

    @Test
    public void test1() {
        int cnt = sut.expressiveWords("heeellooo", new String[]{"hello", "hi", "helo"});

        Assertions.assertThat(cnt).isEqualTo(1);
    }

    @Test
    public void test2() {
        int cnt = sut.expressiveWords("zzzzzyyyyy", new String[]{"zzyy", "zy", "zyy"});

        Assertions.assertThat(cnt).isEqualTo(3);
    }
}