package hsush2017.medium;

import org.assertj.core.api.Assertions;
import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

public class LeetCode658Test {
    private LeetCode658 sut;

    @Before
    public void setUp() {
        sut = new LeetCode658();
    }

    @Test
    public void test1() {
        List<Integer> ans = sut.findClosestElements(new int[]{1, 2, 3, 4, 5}, 4, 3);

        Assertions.assertThat(ans).isEqualTo(Arrays.asList(1, 2, 3, 4));
    }

    @Test
    public void test2() {
        List<Integer> ans = sut.findClosestElements(new int[]{1, 2, 3, 4, 5}, 4, -1);

        Assertions.assertThat(ans).isEqualTo(Arrays.asList(1, 2, 3, 4));
    }

    @Test
    public void test3() {
        List<Integer> ans = sut.findClosestElements(new int[]{1, 2, 3, 4, 5}, 4, 6);

        Assertions.assertThat(ans).isEqualTo(Arrays.asList(2, 3, 4, 5));
    }
}