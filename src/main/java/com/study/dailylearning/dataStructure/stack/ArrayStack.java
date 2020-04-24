package com.study.dailylearning.dataStructure.stack;

import java.util.Objects;

/**
 * use array to implement a stack
 * @param <T>
 */
public class ArrayStack<T> {

    private T[] data;
    private int currentIndex;


    public ArrayStack(int capacity) {
        data = (T[]) new Object[capacity];
    }

    public boolean isFull() {
        return data.length == currentIndex;
    }

    public boolean isEmpty() {
        return 0 == currentIndex;
    }

    //insertion one element
    public void push(T element) {
        if (isFull()) {
            throw new ArrayIndexOutOfBoundsException("It is full");
        }
        data[currentIndex++] = element;
    }

    //pop a stack item
    public T pop() {
        T stackTopItem = null;
        stackTopItem = (T) data[currentIndex];
        data[currentIndex] = null;
        currentIndex--;
        return stackTopItem;
    }


    public void print() {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < data.length; i++) {
            sb.append(data[i] + ",");
        }
        System.out.println(sb.toString());
    }


    public static void main(String[] args) {
        ArrayStack<Integer> integerArrayStack = new ArrayStack<>(5);
        integerArrayStack.push(1);
        integerArrayStack.push(2);
        integerArrayStack.push(3);


        integerArrayStack.print();


        System.out.println(integerArrayStack.pop());



        integerArrayStack.print();










    }





}
