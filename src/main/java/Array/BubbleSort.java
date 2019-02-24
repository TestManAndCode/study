package Array;

/**
 * 冒泡算法
 */
public class BubbleSort {
    /**
     * ①、比较相邻的元素。如果第一个比第二个大，就交换他们两个。
     * ②、对每一对相邻元素作同样的工作，从开始第一对到结尾的最后一对。这步做完后，最后的元素会是最大的数（也就是第一波冒泡完成）。
     * ③、针对所有的元素重复以上的步骤，除了最后一个。
     * ④、持续每次对越来越少的元素重复上面的步骤，直到没有任何一对数字需要比较
     */
    public static int[] sort(int[] array) {
        //自己脑海的冒泡
        int count=0;
        for (int i = array.length - 1; i > 0; i--) {
            for (int j = i - 1; j > -1; j--) {
                int temp = array[i];
                if (array[i] < array[j]) {
                    array[i] = array[j];
                    array[j] = temp;
                }
                count++;
            }
        }
        System.out.println("运算了"+count+"次");
        return array;
    }

    public static int[] sort2(int[] array){
        //读了冒泡之后的冒泡
        int count=0;
        for(int i=1;i<array.length;i++){
            for(int j=0;j<array.length-i;j++){
                int temp=array[j];
                if(array[j]>array[j+1]){
                    array[j]=array[j+1];
                    array[j+1]=temp;
                }
                count++;
            }
        }
        System.out.println("运算了"+count+"次");
        return array;

    }


    public static int[] sort3(int[] array){
        //优化后的冒泡
        int count=0;
        for(int i=1;i<array.length;i++){
            boolean flag=true;
            for(int j=0;j<array.length-i;j++){
                int temp=array[j];
                if(array[j]>array[j+1]){
                    array[j]=array[j+1];
                    array[j+1]=temp;
                    flag=false;
                }
                count++;
            }
            //如果没有交换提前结束遍历
            if(flag){
                break;
            }
        }
        System.out.println("运算了"+count+"次");
        return array;

    }
    public static void display(int array[]) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println("");
    }

    public static void main(String[] args) {
        int[] a = {1, 34, 56, 2, 3, 56, 78, 9, 23};

        int[] newArray = sort(a);
        display(newArray);
        System.out.println("====自己理解的冒泡====");
        int[] a2 = {1, 34, 56, 2, 3, 56, 78, 9, 23};
        int[] newArray2 = sort2(a2);
        display(newArray2);

        System.out.println("====优化后的冒泡====");
        int[] a3 = {1, 34, 56, 2, 3, 56, 78, 9, 23};
        int[] newArray3 = sort3(a3);
        display(newArray3);
    }
}
