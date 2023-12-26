package hsush2017.easy;

import org.assertj.core.api.Assertions;
import org.junit.Before;
import org.junit.Test;

public class LeetCode2418Test {
    private LeetCode2418 sut;

    @Before
    public void setUp() throws Exception {
        sut = new LeetCode2418();
    }

    @Test
    public void test1() {
        String[] answer = sut.sortPeople(new String[]{"Alice", "Bob", "Bob"}, new int[]{155, 185, 150});

        Assertions.assertThat(answer).isEqualTo(new String[]{"Bob", "Alice", "Bob"});
    }
}