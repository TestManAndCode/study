package Stack;

import java.util.Arrays;

/**
 * 自动扩容增强版
 */
public class ArrayStack {
    private Object[] array;
    private int maxSize;
    private int top;

    public ArrayStack() {
        maxSize = 50;
        top = -1;
        array = new Object[maxSize];
    }

    public ArrayStack(int length) {
        if (length < 1) {
            throw new RuntimeException("输入值太小");
        }
        this.maxSize = length;
        top = -1;
        array = new Object[maxSize];
    }

    public boolean push(Object value) {
        autoGrow(top + 1);
        top++;
        array[top] = value;
        return true;
    }

    public Object pop() {
        if (top == -1) {
            throw new RuntimeException("空");
        }
        Object value = array[top];
        top--;
        return value;
    }

    public Object peek() {
        if (top == -1) {
            throw new RuntimeException("空");
        }
        return array[top];
    }

    public boolean isEmpty() {
        return (top == -1);
    }

    public void autoGrow(int minCapacity) {
        if (minCapacity >= maxSize) {
            int newCapacity = 0;
            if ((minCapacity << 1) - Integer.MAX_VALUE > 0) {
                newCapacity = Integer.MAX_VALUE;
            } else {
                newCapacity = (minCapacity << 1);
            }
            this.maxSize = newCapacity;
            this.array = Arrays.copyOf(array, maxSize);
        }
    }
}
