package main.java.test;

import main.java.Array.MyArray;

;

public class TestMyArray {
    public static void main(String[] args) {
        MyArray myArray = new MyArray(5);
        myArray.add(1);
        myArray.add(2);
        myArray.add(3);
        myArray.add(4);
        myArray.add(5);
        System.out.println("===添加完毕打印信息====");
        myArray.desplay();

        System.out.println("===打印长度====");
        System.out.println(myArray.getSize());

        System.out.println("===删除数据====");
        myArray.delete(4);

        System.out.println("===修改数据====");
        myArray.modify(2, 44);
        myArray.desplay();
    }
}
