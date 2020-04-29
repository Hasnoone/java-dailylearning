package com.study.dailylearning.dataStructure.list;

import java.util.Iterator;

/**
 * @program: dailylearning
 * @description:
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


    //initial
    public MyLinkedList() {
        doClean();
    }

    //initial
    public void clean() {
        doClean();
    }

    //return  size
    public int size() {
        return size;
    }

    //
    public boolean isEmpty() {
        return size() == 0;
    }


    public boolean add(T data) {
        add(size(), data);
        return true;
    }


    public void add(int index, T data) {
        addBefore(getNode(index,0,size()),data);
    }

    //add an item to this collection ,at specified position node
    private void addBefore(Node node, T data) {
        Node newNode = new Node(data, node.pre, node);
        newNode.pre.next = newNode;
        size++;
        modCount++;
    }


    public Node<T> getNode(int index) {
        return getNode(index, 0, size() - 1);
    }

    public Node<T> getNode(int index, int lowerIndex, int higherIndex) {
        Node<T> node = null;
        if (index < lowerIndex || index > higherIndex) {
            throw new IndexOutOfBoundsException();
        }

        if (index < size() / 2) {
            node = beginnerNode.next;
            for (int i = 0; i < index; i++) {
                node = node.next;
            }
        } else {
            node = endNode;
            for (int i = index; i < size(); i++) {
                node = node.pre;
            }
        }
        return node;
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

