package hsush2017.medium;

import org.assertj.core.api.Assertions;
import org.junit.Before;
import org.junit.Test;

public class LeetCode2059Test {
    private LeetCode2059 sut;

    @Before
    public void setUp() throws Exception {
        sut = new LeetCode2059();
    }

    @Test
    public void test1() {
        Assertions.assertThat(sut.minimumOperations(new int[]{2, 4, 12}, 2, 12)).isEqualTo(2);
    }

    @Test
    public void test2() {
        Assertions.assertThat(sut.minimumOperations(new int[]{3, 5, 7}, 0, -4)).isEqualTo(2);
    }
}