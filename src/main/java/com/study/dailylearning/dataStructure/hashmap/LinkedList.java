package com.study.dailylearning.dataStructure.hashmap;

/**
 * @program: dailylearning
 * @description:
 * @author: XuHang
 * @create: 2020-02-25
 **/
public class LinkedList {

    private Node head;
    private int size;


    public LinkedList() {
        this.head = null;
        this.size = 0;
    }


    public void insert(int data) {
        Node temp = head;
        Node newNode = new Node(data);
        if (null == temp) {
            head = newNode;
        } else {
            //默认插入链表的第一个
            newNode.next = head;
            head = newNode;

        }
    }


    public void delete(int data) {
        Node temp = head;
    }



}

