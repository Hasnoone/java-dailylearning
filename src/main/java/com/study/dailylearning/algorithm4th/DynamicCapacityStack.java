package com.study.dailylearning.algorithm4th;

import java.util.Iterator;

/**
 * @author Daguji
 * @Description
 * @create 2020-05-25 下午 5:16
 */
public class DynamicCapacityStack<T> implements Iterable<T> {

    public static void main(String[] args) {
        int[] array = new int[10];
        System.out.println(array.length);
        array[0] = 3;
        System.out.println(array.length);


    }


    private T[] a;
    private int count;

    public DynamicCapacityStack(int count) {
        this.count = count;
        a = (T[]) new Object[count];
    }

    public void resize() {
        T[] newArray = (T[]) new Object[(int) (count * (1 + 0.75))];
        for (int i = 0; i < a.length; i++) {
            newArray[i] = a[i];
        }
        a = newArray;
    }

    public int getSize() {
        return count;
    }

    public boolean isEmpty() {
        return count == 0;
    }

    public void push(T data) {
        if (count == a.length) {
            resize();
        }
        a[count++] = data;
    }

    public T pop() {
        return  a[--count];
    }

    @Override
    public Iterator<T> iterator() {
        return new ReverseArrayIterator();
    }



    private class ReverseArrayIterator<T> implements Iterator<T>{

        private int i = count;

        @Override
        public boolean hasNext() {
            return i>0;
        }

        @Override
        public T next() {
            return (T) a[--i];
        }

        @Override
        public void remove() {

        }
    }



}
