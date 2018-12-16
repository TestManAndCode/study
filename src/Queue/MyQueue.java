package Queue;

/**
 * 队列先进先出
 * 1.单向队列
 * 2.双向队列
 * 3.有序队列
 */
//TODO 双端队列记得找时间实现
public class MyQueue {
    private Object[] array;
    //前端
    private int front;
    //末端
    private int rear;
    //最大数量
    private int maxSize;
    //实际数量
    private int items;

    public MyQueue() {
        front = 0;
        rear = -1;
        maxSize = 50;
        items = 0;
        array = new Object[maxSize];
    }

    public MyQueue(int length) {
        front = 0;
        rear = -1;
        maxSize = length;
        items = 0;
        array = new Object[maxSize];
    }

    public boolean isFull() {
        return (items == maxSize);
    }

    public void insert(Object o) {
        if (isFull()) {
            System.out.println("队列已满");
            return;
        }
        rear++;
        items++;
        if (rear >= maxSize) {
            rear = 0;
        }
        array[rear] = o;
    }

    public boolean isEmpty() {
        return (items == 0);
    }

    public Object remove() {
        if (isEmpty()) {
            System.out.println("队列为空");
            return false;
        }
        items--;
        Object o = array[front];
        array[front] = null;
        front++;
        if (isEmpty()) {
            front = 0;
            rear = -1;
        }
        return o;
    }

    public Object peekFirst() {
        return array[front];
    }

    public int getSize() {
        return items;
    }
}
