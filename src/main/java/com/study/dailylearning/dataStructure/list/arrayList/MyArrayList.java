package com.study.dailylearning.dataStructure.list.arrayList;

import java.util.Iterator;

/**
 * @program: dailylearning
 * @description:
 * @author: XuHang
 * @create: 2020-02-25
 **/
public class MyArrayList<T> implements Iterable<T> {

    private final static int DEFAULT_CAPACITY = 10;
    private int size;
    private T[] data;


    public MyArrayList() {
    }

    @Override
    public Iterator<T> iterator() {
        return null;
    }
}

