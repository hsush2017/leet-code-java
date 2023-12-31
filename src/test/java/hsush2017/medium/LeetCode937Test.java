package hsush2017.medium;

import org.assertj.core.api.Assertions;
import org.junit.Before;
import org.junit.Test;

public class LeetCode937Test {
    private LeetCode937 sut;

    @Before
    public void setUp() throws Exception {
        sut = new LeetCode937();
    }

    @Test
    public void test1() {
        String[] logs = {"dig1 8 1 5 1", "let1 art can", "dig2 3 6", "let2 own kit dig", "let3 art zero"};
        String[] expect = {"let1 art can", "let3 art zero", "let2 own kit dig", "dig1 8 1 5 1", "dig2 3 6"};

        String[] actual = sut.reorderLogFiles(logs);

        Assertions.assertThat(actual).isEqualTo(expect);
    }

    @Test
    public void test2() {
        String[] logs = {"a1 9 2 3 1", "g1 act car", "zo4 4 7", "ab1 off key dog", "a8 act zoo"};
        String[] expect = {"g1 act car", "a8 act zoo", "ab1 off key dog", "a1 9 2 3 1", "zo4 4 7"};

        String[] actual = sut.reorderLogFiles(logs);

        Assertions.assertThat(actual).isEqualTo(expect);
    }

    @Test
    public void test3() {
        String[] logs = {"a1 9 2 3 1", "g1 act car", "zo4 4 7", "ab1 off key dog", "a8 act zoo", "a2 act car"};
        String[] expect = {"a2 act car", "g1 act car", "a8 act zoo", "ab1 off key dog", "a1 9 2 3 1", "zo4 4 7"};

        String[] actual = sut.reorderLogFiles(logs);

        Assertions.assertThat(actual).isEqualTo(expect);
    }
}