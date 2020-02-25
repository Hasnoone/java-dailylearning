package com.study.dailylearning.structureStudy.list.arrayList;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

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

