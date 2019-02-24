package Stack;

/**
 * 用数组做一个固定长度的先进后出的栈
 */
public class MyStactk {
    private int[] array;
    private int maxSize;
    private int top;

    public MyStactk() {
        maxSize = 50;
        top = -1;
        array = new int[maxSize];
    }

    public MyStactk(int length) {
        if (length < 1) {
            throw new RuntimeException("输入值太小");
        }
        maxSize = length;
        top = -1;
        array = new int[maxSize];
    }

    public boolean push(int value) {
        if (top == maxSize) {
            return false;
        }
        top++;
        array[top] = value;
        return true;
    }

    public int pop() {
        if (top == -1) {
            throw new RuntimeException("空");
        }
        int value = array[top];
        top--;
        return value;
    }

    public int peek() {
        if (top == -1) {
            throw new RuntimeException("空");
        }
        return array[top];
    }

    public boolean isEmpty() {
        return (top == -1);
    }
}
