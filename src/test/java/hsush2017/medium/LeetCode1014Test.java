package hsush2017.medium;

import org.assertj.core.api.Assertions;
import org.junit.Before;
import org.junit.Test;

public class LeetCode1014Test {
    private LeetCode1014 sut;

    @Before
    public void setUp() throws Exception {
        sut = new LeetCode1014();
    }

    @Test
    public void test1() {
        Assertions.assertThat(sut.maxScoreSightseeingPair(new int[]{8, 1, 5, 2, 6})).isEqualTo(11);
    }

    @Test
    public void test2() {
        Assertions.assertThat(sut.maxScoreSightseeingPair(new int[]{1, 2})).isEqualTo(2);
    }

    @Test
    public void test3() {
        Assertions.assertThat(sut.maxScoreSightseeingPair(new int[]{2, 2, 1})).isEqualTo(3);
    }
}