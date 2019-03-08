package com.argsno.problems.LRUCache;

import java.util.HashMap;
import java.util.Map;

public class LRUCache {
    class Node {
        int key;
        int value;
        Node prev, next;
        Node(int k, int v) {
            key = k;
            value = v;
        }
        Node() {
            this(0, 0);
        }
    }

    private int capacity, count;
    private Map<Integer, Node> m;
    private Node head, tail;

    public LRUCache(int capacity) {
        this.capacity = capacity;
        this.count = 0;
        m = new HashMap<>();
        head = new Node();
        tail = new Node();
        head.next = tail;
        tail.prev = head;
    }

    public int get(int key) {
        Node n = m.get(key);
        if (null == n) {
            return -1;
        }
        update(n);
        return n.value;
    }

    public void put(int key, int value) {
        Node n = m.get(key);
        if (null == n) {
            n = new Node(key, value);
            m.put(key, n);
            add(n);
            ++count;
        } else {
            n.value = value;
            update(n);
        }
        if (count > capacity) {
            Node toDel = tail.prev;
            remove(toDel);
            m.remove(toDel.key);
            --count;
        }
    }

    private void update(Node node) {
        remove(node);
        add(node);
    }

    private void remove(Node node) {
        node.prev.next = node.next;
        node.next.prev = node.prev;
    }

    private void add(Node node) {
        Node after = head.next;
        head.next = node;
        node.prev = head;
        node.next = after;
        after.prev = node;
    }
}
