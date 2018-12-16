package Queue;

/**
 * 队列先进先出
 * 优先级队列
 */
public class PriorityQue {
    private int[] array;
    //前端
    private int front;
    //末端
    private int rear;
    //最大数量
    private int maxSize;
    //实际数量
    private int items;

    public PriorityQue() {
        front = 0;
        rear = -1;
        maxSize = 50;
        items = 0;
        array = new int[maxSize];
    }

    public PriorityQue(int length) {
        front = 0;
        rear = -1;
        maxSize = length;
        items = 0;
        array = new int[maxSize];
    }

    public boolean isFull() {
        return (items == maxSize);
    }

    public void insert(int o) {
        if (isFull()) {
            System.out.println("队列已满");
            return;
        }
        items++;
        //TODO使用插入排序从大到小的顺序排列
        if (isEmpty()) {
            array[0] = o;
        }
    }

    public boolean isEmpty() {
        return (items == 0);
    }

    public int remove() {
        if (isEmpty()) {
            System.out.println("队列为空");
            return -1;
        }
        items--;
        int o = array[front];
        array[front] = -1;
        front++;
        if (isEmpty()) {
            front = 0;
            rear = -1;
        }
        return o;
    }

    public int peekFirst() {
        return array[front];
    }

    public int getSize() {
        return items;
    }
}
