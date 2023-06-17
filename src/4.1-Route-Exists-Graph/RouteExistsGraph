package com.company;

import java.util.PriorityQueue;
import java.util.Queue;

public class Main
{
    public static void main(String[] args)
    {
        Graph graph = new Graph();
        Node one = new Node();
        Node two = new Node();
        Node three = new Node();
        Node four = new Node();
        one.children = new Node[]{two};
        two.children = new Node[]{three};
        three.children = new Node[]{two};
        System.out.println(routeExists(one, four));

    }

    public static boolean routeExists(Node start, Node end){
        Queue queue = new PriorityQueue<Node>();
        // BFS
        if (start==end){
            return true;
        }
        queue.add(start);
        while (!queue.isEmpty()) {
            Node n = (Node) queue.remove();
            n.seen = true;
            for (Node child : n.children) {
                if (child == end) {
                    return true;
                } else {
                    if (!child.seen) {
                        queue.add(child);
                    }
                }
            }
        }
        return false;
    }

    static class Graph {
        public Node[] nodes;
    }

    static class Node {
        public String name;
        public Boolean seen;
        public Node[] children;

        public Node() {
            seen = false;
        }
    }



}

