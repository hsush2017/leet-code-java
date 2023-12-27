package hsush2017.medium;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

// https://leetcode.com/problems/course-schedule/
public class LeetCode207 {
    public boolean canFinish(int numCourses, int[][] prerequisites) {
        Graph graph = new Graph(numCourses, prerequisites);

        return graph.topologicalOrdering().size() == numCourses;
    }

    static class Node {
        final int number;
        final List<Node> incomingNodes;
        final List<Node> outgoingNodes;

        Node(int number) {
            this.number = number;
            this.incomingNodes = new ArrayList<>();
            this.outgoingNodes = new ArrayList<>();
        }
    }

    static class Graph {
        final List<Node> nodes;

        Graph(int nodeCnt, int[][] edges) {
            this.nodes = new ArrayList<>();

            for (int i = 0; i < nodeCnt; i++) {
                nodes.add(new Node(i));
            }

            for (int[] edge : edges) {
                Node from = nodes.get(edge[1]);
                Node to = nodes.get(edge[0]);

                from.outgoingNodes.add(to);
                to.incomingNodes.add(from);
            }
        }

        public List<Node> topologicalOrdering() {
            List<Node> order = new ArrayList<>();
            Queue<Node> queue = new LinkedList<>();

            for (Node node : nodes) {
                if (node.incomingNodes.isEmpty()) {
                    queue.offer(node);
                }
            }

            while (!queue.isEmpty()) {
                Node node = queue.poll();

                order.add(node);

                for (Node outNode : node.outgoingNodes) {
                    outNode.incomingNodes.remove(node);

                    if (outNode.incomingNodes.isEmpty()) {
                        queue.offer(outNode);
                    }
                }
            }

            return order;
        }
    }
}