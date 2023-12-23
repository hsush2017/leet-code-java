package hsush2017.easy;

import org.junit.Before;
import org.junit.Test;

public class LeetCode108Test {
    private LeetCode108 sut;

    @Before
    public void setUp() {
        sut = new LeetCode108();
    }

    @Test
    public void test1() {
        LeetCode108.TreeNode tree = sut.sortedArrayToBST(new int[]{-10, -3, 0, 5, 9});

        System.out.println(tree);
    }

    @Test
    public void test2() {
        LeetCode108.TreeNode tree = sut.sortedArrayToBST(new int[]{1, 3});

        System.out.println(tree);
    }
}