package com.study.dailylearning.dataStructure.stack;

/**
 * @program: dailylearning
 * @description:
 * @author: XuHang
 * @create: 2020-04-25
 **/
public class StuckCustom<T> {

    int size;
    T[] array ;
    int top;



    StuckCustom(int size) {
        this.size = size;
        array = (T[]) new Object[size];
        top = -1;
    }

    public boolean isEmpty() {
        return (top == -1);
    }

    public boolean isFull() {
        return (size - 1 == top);
    }



    public void push(T element) {
        if (!isFull()) {
            array[++top] = element;
        }
    }

    public T pop() {
        if (!isEmpty()) {
            return array[top--];
        } else {
            return null;
        }
    }











}

