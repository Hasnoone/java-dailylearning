package com.study.dailylearning.dataStructure.list;

import java.util.Iterator;
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
        return null;
    }
}

