package com.study.dailylearning.dataStructure.list;

import java.util.Iterator;

/**
 * @program: dailylearning
 * @description:
 * @author: XuHang
 * @create: 2020-04-03
 **/
public class MyLinkedList<T> implements Iterable {


    public static class Node<T> {
        public Node(Object data, Node<T> pre, Node<T> next) {
            this.data = data;
            this.pre = pre;
            this.next = next;
        }

        private Object data;
        private Node<T> pre;
        private Node<T> next;
    }


    private int size = 0;
    private int modCount = 0;
    private Node<T> beginnerNode;
    private Node<T> endNode;


    public MyLinkedList() {
        doClean();
    }

    public void clean() {
        doClean();
    }

    public int size() {
        return size;
    }

    public boolean isEmpty() {
        return size() == 0;
    }



    private void doClean() {
        beginnerNode = new Node<>(null, null, null);
        endNode = new Node<>(null, beginnerNode, null);
        beginnerNode.next = endNode;
        size = 0;
        modCount++;
    }




    @Override
    public Iterator iterator() {
        return null;
    }
}

