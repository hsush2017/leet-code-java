package hsush2017.easy;

import org.assertj.core.api.Assertions;
import org.junit.Before;
import org.junit.Test;

public class LeetCode1Test {
    private LeetCode1 sut;

    @Before
    public void setUp() {
        sut = new LeetCode1();
    }

    @Test
    public void test1() {
        Assertions.assertThat(sut.twoSum(new int[]{-3, 4, 3, 90}, 0)).isEqualTo(new int[]{0, 2});
    }
}