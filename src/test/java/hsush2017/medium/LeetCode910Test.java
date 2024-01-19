package hsush2017.medium;

import org.assertj.core.api.Assertions;
import org.junit.Before;
import org.junit.Test;

public class LeetCode910Test {
    private LeetCode910 sut;

    @Before
    public void setUp() throws Exception {
        sut = new LeetCode910();
    }

    @Test
    public void test1() {
        Assertions.assertThat(sut.smallestRangeII(new int[]{1}, 0)).isEqualTo(0);
    }

    @Test
    public void test2() {
        Assertions.assertThat(sut.smallestRangeII(new int[]{0, 10}, 2)).isEqualTo(6);
    }

    @Test
    public void test3() {
        Assertions.assertThat(sut.smallestRangeII(new int[]{1, 3, 6}, 3)).isEqualTo(3);
        // i = 0; [-2, 0, 3]
        // i = 1; [4, 0, 3]
        // i = 2; [4, 6, 3]
    }

    @Test
    public void test4() {
        Assertions.assertThat(sut.smallestRangeII(new int[]{10, 7, 1}, 3)).isEqualTo(3);
    }

    @Test
    public void test5() {
        Assertions.assertThat(sut.smallestRangeII(new int[]{1, 2, 4, 6, 8, 8}, 2)).isEqualTo(3);
    }

    @Test
    public void test6() {
        Assertions.assertThat(sut.smallestRangeII(new int[]{7, 8, 8}, 5)).isEqualTo(1);
//        i == 0: [12, 13, 13]
//        i == 1: [12, 3, 3]
//        i == 2: [12, 13, 3]
    }
}