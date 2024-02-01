package hsush2017.easy;

import java.util.Stack;

// https://leetcode.com/problems/baseball-game/
public class LeetCode682 {
    public int calPoints(String[] operations) {
        Stack<Integer> stack = new Stack<>();

        for (String operation : operations) {
            switch (operation) {
                case "+":
                    int a = stack.pop();
                    int b = stack.pop();
                    stack.push(b);
                    stack.push(a);
                    stack.push(a + b);
                    break;
                case "D":
                    stack.push(2 * stack.peek());
                    break;
                case "C":
                    stack.pop();
                    break;
                default:
                    stack.push(Integer.parseInt(operation));
            }
        }

        int ans = 0;
        while (!stack.isEmpty()) {
            ans += stack.pop();
        }

        return ans;
    }
}
