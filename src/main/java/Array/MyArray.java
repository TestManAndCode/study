package Array;

/**
 * 假设操作人是不会添加重复元素的，
 * 这里没有考虑重复元素，如果添加重复元素了，
 * 后面的查找，删除，修改等操作只会对第一次出现的元素有效。
 */
public class MyArray {
    //数组最大长度
    private int length;
    //数组实际有效长度
    private int elemns;
    private int[] initArray;

    //初始化长度
    public MyArray(int initLength) {
        this.elemns = 0;
        this.length = initLength;
        initArray = new int[length];
    }

    public MyArray() {
        this.elemns = 0;
        this.length = 50;
        initArray = new int[length];
    }

    public boolean add(int value) {
        //长度已满不能添加
        if (length  == elemns) {
            return false;
        } else {
            initArray[elemns] = value;
            elemns++;
            return true;
        }
    }

    public int find(int value) {
        for (int i = 0; i < elemns; i++) {
            if (value == initArray[i]) {
                return i;
            }
        }
        return -1;
    }

    public void desplay() {
        for (int i = 0; i < elemns; i++) {
            System.out.println(initArray[i]);
        }
    }

    public int getSize() {
        return elemns;
    }

    public boolean delete(int value) {
        int index = find(value);
        if (index == -1) {
            return false;
        } else {
            if(index==elemns){
                elemns--;
                return true;
            }
            for (; index < elemns-1; index++) {
                initArray[index] = initArray[index + 1];
            }
            elemns--;
            return true;
        }
    }

    public boolean modify(int oldValue, int newValue) {
        int index = find(oldValue);
        if (index == -1) {
            return false;
        } else {
            initArray[index] = newValue;
            return true;
        }
    }
}
