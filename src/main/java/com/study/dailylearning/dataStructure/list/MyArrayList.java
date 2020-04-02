package com.study.dailylearning.dataStructure.list;

import org.apache.commons.collections4.iterators.ArrayListIterator;

import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.Objects;

/**
 * @program: dailylearning
 * @description:
 * @author: XuHang
 * @create: 2020-04-02
 **/
public class MyArrayList<T> implements Iterable<T> {


    private static final int DEFAULT_CAPACITY = 10;

    private int size;
    private T[] data;


    public MyArrayList() {
        doClear();
    }


    public void clear() {
        doClear();
    }


    public void trimSize() {
        ensureCapacity(size());
    }

    public T get(int index) {
        if (index <= 0 || index > size) {
            throw new ArrayIndexOutOfBoundsException();
        }
        return data[index];
    }

    public void add(T data) {
        add(size(), data);
    }

    private void add(int index, T newData) {

        if (data.length == size()) {
            ensureCapacity(size() * 2 + 1);
        }
        for (int i = size; i > index; i--) {
            data[i] = data[i - 1];
        }
        data[index] = newData;
        size++;

    }


    public T remove(int index) {
        T removeData = data[index];
        for (int i = index; i < size; i++) {
            data[i] = data[i + 1];
        }
        return removeData;
    }





    public boolean isEmpty() {
        return size() == 0;
    }

    public int size() {
        return size;
    }


    private void doClear() {
        size = 0;
        ensureCapacity(DEFAULT_CAPACITY);
    }

    private void ensureCapacity(int newCapacity) {
        if (newCapacity < size) {
            return;
        }
        T[] oldItem = data;
        data = (T[]) new Objects[newCapacity];
        for (int i = 0; i < oldItem.length; i++) {
            data[i] = oldItem[i];
        }
    }

    @Override
    public Iterator<T> iterator() {


        return new MyArrayListIterator();
    }


    public class MyArrayListIterator<T> implements Iterator {


        private int current = 0;

        @Override
        public boolean hasNext() {
            return current < size();
        }

        @Override
        public T next() {
            if (!hasNext()) {
                throw new NoSuchElementException();
            }
            return (T) data[current++];
        }

        public void remove() {
            MyArrayList.this.remove(--current);
        }
    }


}

