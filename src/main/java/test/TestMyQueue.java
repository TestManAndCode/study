package main.java.test;


import main.java.Queue.MyQueue;
import main.java.Queue.PriorityQue;

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

        System.out.println("==========有序队列=========");
        PriorityQue priorityQue= new PriorityQue(3);
        priorityQue.insert(1);
        priorityQue.insert(2);
        priorityQue.insert(3);

        System.out.println(priorityQue.peekFirst());

        System.out.println(priorityQue.remove());

        System.out.println(priorityQue.peekFirst());

        priorityQue.insert(4);
        priorityQue.insert(5);
        System.out.println(priorityQue.peekFirst());

    }
}
