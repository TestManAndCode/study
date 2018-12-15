package Array;

/**
 * 选择排序
 */
public class ChoiceSort {
    /**
     * ①、从待排序序列中，找到关键字最小的元素
     * ②、如果最小元素不是待排序序列的第一个元素，将其和第一个元素互换
     * ③、从余下的 N - 1 个元素中，找出关键字最小的元素，重复(1)、(2)步，直到排序结束
     */
    public static void sort(int[] array) {
        //自己理解的选择排序算法
        int count=0;
        long begin=System.currentTimeMillis();
        for (int i = 0; i < array.length-1; i++) {
            int minIndex=i;
            for (int j = i + 1; j<array.length;j++){
                if(array[minIndex]>array[j]){
                    minIndex=j;
                }
                count++;
            }
            if(minIndex!=i){
                int temp=array[i];
                array[i]=array[minIndex];
                array[minIndex]=temp;
            }
        }
        System.out.println("用时"+(System.currentTimeMillis()-begin));
        System.out.println("循环次数为:"+count);
    }

    public static void display(int array[]) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println("");
    }
    public static void main(String[] args){
        int[] a = {1, 34, 56, 2, 3, 56, 78, 9, 23};

        sort(a);
        display(a);
    }
}
