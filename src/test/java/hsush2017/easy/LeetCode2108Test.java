package hsush2017.easy;

import org.assertj.core.api.Assertions;
import org.junit.Before;
import org.junit.Test;

public class LeetCode2108Test {
    private LeetCode2108 sut;

    @Before
    public void setUp() throws Exception {
        sut = new LeetCode2108();
    }

    @Test
    public void test1() {
        Assertions.assertThat(sut.firstPalindrome(new String[]{"abc", "car", "ada", "racecar", "cool"})).isEqualTo("ada");
    }

    @Test
    public void test2() {
        Assertions.assertThat(sut.firstPalindrome(new String[]{"notapalindrome", "racecar"})).isEqualTo("racecar");
    }

    @Test
    public void test3() {
        Assertions.assertThat(sut.firstPalindrome(new String[]{"def", "ghi"})).isEqualTo("");
    }
}