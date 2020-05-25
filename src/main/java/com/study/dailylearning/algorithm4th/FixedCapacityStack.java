package com.study.dailylearning.algorithm4th;

/**
 * @author Daguji
 * @Description
 * @create 2020-05-25 下午 5:16
 */
public class FixedCapacityStack<T> {

    private T[] a;
    private int count;

    public FixedCapacityStack(int count) {
        this.count = count;
        a = (T[]) new Object[count];
    }

    public int getSize() {
        return count;
    }

    public boolean isEmpty() {
        return count == 0;
    }

    public void push(T data) {
        a[count++] = data;
    }

    public T pop() {
        return  a[--count];
    }

}
