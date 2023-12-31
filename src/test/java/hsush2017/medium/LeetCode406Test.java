package hsush2017.medium;

import org.assertj.core.api.Assertions;
import org.junit.Before;
import org.junit.Test;

public class LeetCode406Test {
    private LeetCode406 sut;

    @Before
    public void setUp() throws Exception {
        sut = new LeetCode406();
    }

    @Test
    public void test1() {
        int[][] people = {{7, 0}, {4, 4}, {7, 1}, {5, 0}, {6, 1}, {5, 2}};

        Assertions.assertThat(sut.reconstructQueue(people)).isEqualTo(new int[][]{{5, 0}, {7, 0}, {5, 2}, {6, 1}, {4, 4}, {7, 1}});
    }

    @Test
    public void test2() {
        int[][] people = {{6, 0}, {5, 0}, {4, 0}, {3, 2}, {2, 2}, {1, 4}};

        Assertions.assertThat(sut.reconstructQueue(people)).isEqualTo(new int[][]{{4, 0}, {5, 0}, {2, 2}, {3, 2}, {1, 4}, {6, 0}});
    }

}