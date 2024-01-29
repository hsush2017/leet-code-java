package hsush2017.medium;

import org.assertj.core.api.Assertions;
import org.junit.Before;
import org.junit.Test;

public class LeetCode189Test {
    private LeetCode189 sut;

    @Before
    public void setUp() throws Exception {
        sut = new LeetCode189();
    }

    @Test
    public void test1() {
        int[] arr = {1, 2, 3, 4, 5, 6, 7};

        sut.rotate(arr, 3);

        Assertions.assertThat(arr).containsExactly(5, 6, 7, 1, 2, 3, 4);
    }

    @Test
    public void test2() {
        int[] arr = {-1};

        sut.rotate(arr, 2);

        Assertions.assertThat(arr).containsExactly(-1);
    }

    @Test
    public void test3() {
        int[] arr = {1, 2};

        sut.rotate(arr, 3);

        Assertions.assertThat(arr).containsExactly(2, 1);
    }

    @Test
    public void test4() {
        int[] arr = {1, 2};

        sut.rotate(arr, 5);

        Assertions.assertThat(arr).containsExactly(2, 1);
    }
}