package test;

import Queue.MyQueue;

public class TestMyQueue {
    public static void main(String[] args) {
        MyQueue queue = new MyQueue(3);
        queue.insert(1);
        queue.insert(2);
        queue.insert(3);

        System.out.println(queue.peekFirst());

        System.out.println(queue.remove());

        System.out.println(queue.peekFirst());

        queue.insert(4);
        queue.insert(5);
    }
}
