package hsush2017.medium;

import org.assertj.core.api.Assertions;
import org.junit.Before;
import org.junit.Test;

public class LeetCode1234Test {
    private LeetCode1234 sut;

    @Before
    public void setUp() throws Exception {
        sut = new LeetCode1234();
    }

    @Test
    public void test1() {
        Assertions.assertThat(sut.balancedString("QWER")).isEqualTo(0);
    }

    @Test
    public void test2() {
        Assertions.assertThat(sut.balancedString("QQWE")).isEqualTo(1);
    }

    @Test
    public void test3() {
        Assertions.assertThat(sut.balancedString("QQQW")).isEqualTo(2);
    }

    @Test
    public void test4() {
        Assertions.assertThat(sut.balancedString("WWQQRRRRQRQQ")).isEqualTo(4);
    }

    @Test
    public void test5() {
        Assertions.assertThat(sut.balancedString("WWEQERQWQWWRWWERQWEQ")).isEqualTo(4);
    }
}