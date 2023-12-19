package hsush2017.easy;

import org.assertj.core.api.Assertions;
import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

public class LeetCode2363Test {
    private LeetCode2363 sut;

    @Before
    public void setUp() {
        sut = new LeetCode2363();
    }

    @Test
    public void test1() {
        int[][] items1 = {new int[]{1, 1}, new int[]{4, 5}, new int[]{3, 8}};
        int[][] items2 = {new int[]{3, 1}, new int[]{1, 5}};
        List<List<Integer>> expected = Arrays.asList(Arrays.asList(1, 6), Arrays.asList(3, 9), Arrays.asList(4, 5));

        List<List<Integer>> answer = sut.mergeSimilarItems(items1, items2);

        Assertions.assertThat(answer).isEqualTo(expected);
    }
}