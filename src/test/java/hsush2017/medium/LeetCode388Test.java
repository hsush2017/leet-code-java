package hsush2017.medium;

import org.assertj.core.api.Assertions;
import org.junit.Before;
import org.junit.Test;

public class LeetCode388Test {
    private LeetCode388 sut;

    @Before
    public void setUp() throws Exception {
        sut = new LeetCode388();
    }

    @Test
    public void test1() {
        String input = "dir\n\tsubdir1\n\tsubdir2\n\t\tfile.ext";

        Assertions.assertThat(sut.lengthLongestPath(input)).isEqualTo(20);
    }

    @Test
    public void test2() {
        String input = "dir\n\tsubdir1\n\t\tfile1.ext\n\t\tsubsubdir1\n\tsubdir2\n\t\tsubsubdir2\n\t\t\tfile2.ext";

        Assertions.assertThat(sut.lengthLongestPath(input)).isEqualTo(32);
    }

    @Test
    public void test3() {
        String input = "a";

        Assertions.assertThat(sut.lengthLongestPath(input)).isEqualTo(0);
    }

    @Test
    public void test4() {
        String input = "file1.txt\nfile2.txt\nlongfile.txt";

        Assertions.assertThat(sut.lengthLongestPath(input)).isEqualTo(12);
    }

    @Test
    public void test5() {
        String input = "a\n\tb.txt\na2\n\tb2.txt";

        Assertions.assertThat(sut.lengthLongestPath(input)).isEqualTo(9);
    }

    @Test
    public void test6() {
        String input = "a.tar.gz";

        Assertions.assertThat(sut.lengthLongestPath(input)).isEqualTo(8);
    }

    @Test
    public void test7() {
        String input = "file name with  space.txt";

        Assertions.assertThat(sut.lengthLongestPath(input)).isEqualTo(25);
    }
}