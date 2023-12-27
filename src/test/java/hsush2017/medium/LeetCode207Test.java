package hsush2017.medium;

import org.assertj.core.api.Assertions;
import org.junit.Before;
import org.junit.Test;

public class LeetCode207Test {
    private LeetCode207 sut;

    @Before
    public void setUp() throws Exception {
        sut = new LeetCode207();
    }

    @Test
    public void test1() {
        int numCourses = 2;
        int[][] prerequisites = {{1, 0}};

        boolean answer = sut.canFinish(numCourses, prerequisites);

        Assertions.assertThat(answer).isEqualTo(true);
    }

    @Test
    public void test2() {
        int numCourses = 2;
        int[][] prerequisites = {{1, 0}, {0, 1}};

        boolean answer = sut.canFinish(numCourses, prerequisites);

        Assertions.assertThat(answer).isEqualTo(false);
    }

    @Test
    public void test3() {
        int numCourses = 5;
        int[][] prerequisites = {{1, 4}, {2, 4}, {3, 1}, {3, 2}};

        boolean answer = sut.canFinish(numCourses, prerequisites);

        Assertions.assertThat(answer).isEqualTo(true);
    }

    @Test
    public void test4() {
        int numCourses = 3;
        int[][] prerequisites = {{1, 0}, {2, 0}, {0, 2}};

        boolean answer = sut.canFinish(numCourses, prerequisites);

        Assertions.assertThat(answer).isEqualTo(false);
    }
}