package hsush2017.easy;

import org.assertj.core.api.Assertions;
import org.junit.Before;
import org.junit.Test;

public class LeetCode944Test {
    private LeetCode944 sut;

    @Before
    public void setUp() throws Exception {
        sut = new LeetCode944();
    }

    @Test
    public void test1() {
        Assertions.assertThat(sut.minDeletionSize(new String[]{"cba", "daf", "ghi"})).isEqualTo(1);
    }

    @Test
    public void test2() {
        Assertions.assertThat(sut.minDeletionSize(new String[]{"a", "b"})).isEqualTo(0);
    }

    @Test
    public void test3() {
        Assertions.assertThat(sut.minDeletionSize(new String[]{"zyx", "wvu", "tsr"})).isEqualTo(3);
    }
}