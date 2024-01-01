package hsush2017.medium;

import java.util.LinkedList;
import java.util.Queue;

public class LeetCode650 {
    public int minSteps(int n) {
        if (n == 1) {
            return 0;
        }

        Queue<Operation> queue = new LinkedList<>();
        queue.add(new Operation(1, 0, 0));

        int steps = 0;
        while (!queue.isEmpty()) {
            Operation op = queue.poll();

            if (op.total == n) {
                steps = op.steps;
                break;
            }

            if (op.cntOfCopy > 0 && op.total + op.cntOfCopy <= n) {
                queue.add(new Operation(op.total + op.cntOfCopy, op.cntOfCopy, op.steps + 1));
            }

            if (2 * op.total <= n) {
                queue.add(new Operation(2 * op.total, op.total, op.steps + 2));
            }
        }

        return steps;
    }

    static class Operation {
        int total;
        int cntOfCopy;
        int steps;

        public Operation(int total, int cntOfCopy, int steps) {
            this.total = total;
            this.cntOfCopy = cntOfCopy;
            this.steps = steps;
        }
    }
}
