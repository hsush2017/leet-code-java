package hsush2017.easy;

import org.assertj.core.api.Assertions;
import org.junit.Before;
import org.junit.Test;

public class LeetCode345Test {
    private LeetCode345 sut;

    @Before
    public void setUp() throws Exception {
        sut = new LeetCode345();
    }

    @Test
    public void test1() {
        Assertions.assertThat(sut.reverseVowels("hello")).isEqualTo("holle");
    }

    @Test
    public void test2() {
        Assertions.assertThat(sut.reverseVowels("leetcode")).isEqualTo("leotcede");
    }

    @Test
    public void test3() {
        Assertions.assertThat(sut.reverseVowels("aA")).isEqualTo("Aa");
    }

    @Test
    public void test4() {
        Assertions.assertThat(sut.reverseVowels("race car")).isEqualTo("race car");
    }
}