package hsush2017.medium;

import org.assertj.core.api.Assertions;
import org.junit.Before;
import org.junit.Test;

public class LeetCode720Test {
    private LeetCode720 sut;

    @Before
    public void setUp() throws Exception {
        sut = new LeetCode720();
    }

    @Test
    public void test1() {
        String[] words = {"w", "wo", "wor", "worl", "world"};

        String ans = sut.longestWord(words);

        Assertions.assertThat(ans).isEqualTo("world");
    }

    @Test
    public void test2() {
        String[] words = {"a", "banana", "app", "appl", "ap", "apply", "apple"};

        String ans = sut.longestWord(words);

        Assertions.assertThat(ans).isEqualTo("apple");
    }

    @Test
    public void test3() {
        String[] words = {"b", "br", "bre", "brea", "break", "breakf", "breakfa", "breakfas", "breakfast", "l", "lu", "lun", "lunc", "lunch", "d", "di", "din", "dinn", "dinne", "dinner"};

        String ans = sut.longestWord(words);

        Assertions.assertThat(ans).isEqualTo("breakfast");
    }

    @Test
    public void test4() {
        String[] words = {"m", "mo", "moc", "moch", "mocha", "l", "la", "lat", "latt", "latte", "c", "ca", "cat"};

        String ans = sut.longestWord(words);

        Assertions.assertThat(ans).isEqualTo("latte");
    }

    @Test
    public void test5() {
        String[] words = {"m", "ma", "mat", "math", "s", "sc", "sci", "scie", "scien", "scienc", "science", "a", "ar", "art"};

        String ans = sut.longestWord(words);

        Assertions.assertThat(ans).isEqualTo("science");
    }

    @Test
    public void test6() {
        String[] words = {"yo", "ew", "fc", "zrc", "yodn", "fcm", "qm", "qmo", "fcmz", "z", "ewq", "yod", "ewqz", "y"};

        String ans = sut.longestWord(words);

        Assertions.assertThat(ans).isEqualTo("yodn");
    }

    @Test
    public void test7() {
        String[] words = {"k", "lg", "it", "oidd", "oid", "oiddm", "kfk", "y", "mw", "kf", "l", "o", "mwaqz", "oi", "ych", "m", "mwa"};

        String ans = sut.longestWord(words);

        Assertions.assertThat(ans).isEqualTo("oiddm");
    }

    @Test
    public void test8() {
        String[] words = {"rac", "rs", "ra", "on", "r", "otif", "o", "onpdu", "rsf", "rs", "ot", "oti", "racy", "onpd"};

        String ans = sut.longestWord(words);

        Assertions.assertThat(ans).isEqualTo("otif");
    }
}