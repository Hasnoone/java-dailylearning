package com.study.dailylearning.dataStructure.hashmap;

/**
 *
 * @description:
 * @create: 2020-03-03
 **/
public class HashhMap {


    private int size;
    private LinkedList[] linkedLists;


    public HashhMap(int size) {
        this.size = size;
        this.linkedLists = new LinkedList[size];


        for (int i = 0; i < size; i++) {
            linkedLists[i]=new LinkedList();
        }
    }


    public int hashing(int key) {
        int hash = key % size;
        if (hash < 0)
            hash += size;
        return hash;
    }


    public void put(int key) {
        int hashing = hashing(key);
        linkedLists[hashing].insert(key);
    }


    public void delete(int key) {
        int hashing = hashing(key);
        linkedLists[hashing].delete(key);
    }

















}

