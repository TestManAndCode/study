package main.java.LinkedList;

public class TwoWayLinkedList {
    private Node head;
    private Node tail;
    private int size;

    private class Node {
        private Object data;
        private Node next;
        private Node prev;

        public Node(Object o) {
            data = o;
        }
    }

    public TwoWayLinkedList() {
        head = null;
        tail = null;
        size = 0;
    }

    public void addHead(Object o) {
        Node node = new Node(o);
        if (size == 0) {
            head = node;
            tail = node;
        }
        head.prev = node;
        node.next = head;
        head = node;
        size++;
    }

    public void addTail(Object o) {
        Node node = new Node(o);
        if (size == 0) {
            head = node;
            tail = node;
        }
        tail.next = node;
        node.prev = tail;
        tail = node;
        size++;
    }

    public Node delHead() {
        if (size == 0) {
            return null;
        }
        Node res = head;
        if (size == 1) {
            head = null;
            tail = null;
            return res;
        }
        head = head.next;
        head.prev = null;
        size--;
        return res;
    }

    public Node delTail() {
        if (size == 0) {
            return null;
        }
        Node res = tail;
        if (size == 1) {
            tail = null;
            head = null;
            return res;
        }
        tail = tail.prev;
        tail.next = null;
        size--;
        return res;
    }
}
