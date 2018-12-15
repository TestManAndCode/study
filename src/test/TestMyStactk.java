package test;

import Stack.ArrayStack;
import Stack.MyStactk;

public class TestMyStactk {
    public static void main(String[] args){
        MyStactk stactk=new MyStactk(4);
        stactk.push(2);
        stactk.push(3);
        stactk.push(5);
        System.out.println(stactk.peek());
        while (!stactk.isEmpty()){
            System.out.println(stactk.pop());
        }


        ArrayStack arrayStack=new ArrayStack(3);
        arrayStack.push(1);
        arrayStack.push(2);
        arrayStack.push(3);
        arrayStack.push("abc");
        System.out.println(arrayStack.peek());
        arrayStack.pop();
        arrayStack.pop();
        arrayStack.pop();
        System.out.println(arrayStack.peek());
    }
}
