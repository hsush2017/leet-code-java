package hsush2017.easy;

import org.assertj.core.api.Assertions;
import org.junit.Before;
import org.junit.Test;

public class LeetCode917Test {
    private LeetCode917 sut;

    @Before
    public void setUp() throws Exception {
        sut = new LeetCode917();
    }

    @Test
    public void test1() {
        Assertions.assertThat(sut.reverseOnlyLetters("ab-cd")).isEqualTo("dc-ba");
    }

    @Test
    public void test2() {
        Assertions.assertThat(sut.reverseOnlyLetters("a-bC-dEf-ghIj")).isEqualTo("j-Ih-gfE-dCba");
    }

    @Test
    public void test3() {
        Assertions.assertThat(sut.reverseOnlyLetters("Test1ng-Leet=code-Q!")).isEqualTo("Qedo1ct-eeLg=ntse-T!");
    }
}