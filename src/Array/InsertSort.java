package Array;

/**
 * 直接插入排序
 */
public class InsertSort {
    /**
     * 　直接插入排序基本思想是每一步将一个待排序的记录，插入到前面已经排好序的有序序列中去，直到插完所有元素为止。
     * 　插入排序还分为直接插入排序、二分插入排序、链表插入排序、希尔排序等等，这里我们只是以直接插入排序讲解，后面讲高级排序的时候会将其他的
     */
    public static void sort(int array[]) {
        int count = 0;
        for (int i = 1; i < array.length - 1; i++) {
            //获得要比对的值
            int temp = array[i];
            //设置开始比对的下标
            int j = i;
            //如果以排序元素从右往左遍历查询，比对比值小则往后挪一位
            while (j > 0 && temp < array[j - 1]) {
                //元素往后挪移一位
                array[j] = array[j - 1];
                //记录腾出的位置
                j--;
                count++;
            }
            //将腾出的位置插入要比对的值
            array[j] = temp;
        }
        System.out.println("循环次数为:"+count);
    }
    public static void main(String[] args){
        int[] a = {1, 34, 56, 2, 3, 56, 78, 9, 23};
        sort(a);
        ChoiceSort.display(a);
    }
}
