package hsush2017.easy;

import org.assertj.core.api.Assertions;
import org.junit.Before;
import org.junit.Test;

public class LeetCode69Test {
    private LeetCode69 sut;

    @Before
    public void setUp() throws Exception {
        sut = new LeetCode69();
    }

    @Test
    public void test1() {
        Assertions.assertThat(sut.mySqrt(4)).isEqualTo(2);
    }

    @Test
    public void test2() {
        Assertions.assertThat(sut.mySqrt(8)).isEqualTo(2);
    }

    @Test
    public void test3() {
        Assertions.assertThat(sut.mySqrt(1)).isEqualTo(1);
    }

    @Test
    public void test4() {
        Assertions.assertThat(sut.mySqrt(2)).isEqualTo(1);
    }

    @Test
    public void test5() {
        Assertions.assertThat(sut.mySqrt(6)).isEqualTo(2);
    }

    @Test
    public void test6() {
        Assertions.assertThat(sut.mySqrt(2147483647)).isEqualTo(46340);
    }
}