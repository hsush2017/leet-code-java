package hsush2017.easy;

import org.assertj.core.api.Assertions;
import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;
import java.util.Collections;

public class LeetCode2942Test {
    private LeetCode2942 sut;

    @Before
    public void setUp() throws Exception {
        sut = new LeetCode2942();
    }

    @Test
    public void test1() {
        Assertions.assertThat(sut.findWordsContaining(new String[]{"leet", "code"}, 'e')).isEqualTo(Arrays.asList(0, 1));
    }

    @Test
    public void test2() {
        Assertions.assertThat(sut.findWordsContaining(new String[]{"abc", "bcd", "aaaa", "cbc"}, 'a')).isEqualTo(Arrays.asList(0, 2));
    }

    @Test
    public void test3() {
        Assertions.assertThat(sut.findWordsContaining(new String[]{"abc", "bcd", "aaaa", "cbc"}, 'z')).isEqualTo(Collections.emptyList());
    }
}