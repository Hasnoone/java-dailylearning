package com.study.dailylearning.dataStructure.stack;

/**
 *
 * @description:
 * @create: 2020-04-25
 **/

public class LinkedListStack<T> {
    Node head;
    int size;
    int capacity;

    class Node<T> {
        T data;
        Node nextNode;


        Node(T data) {
            this.data = data;
            nextNode = null;
        }



    }


    LinkedListStack(int capacity) {
        this.size = 0;
        this.capacity = capacity;
        this.head = null;
    }


    public void push(T data) {
        Node newNode = new Node(data);
        Node temp = head;
        head = newNode;
        head.nextNode = temp;
        size++;
    }


    public T pop() {
        T value = null;
        value = (T) head.data;
        head = head.nextNode;
        return value;
    }



    public void printList() {
        Node temp = head;
        StringBuilder sb = new StringBuilder();

        while (null != temp) {
            sb.append(temp.data + ",");
            temp = temp.nextNode;
        }
        System.out.println(sb.toString());

    }



    public boolean isEmpty() {
        return size == 0;
    }
    public boolean idFull() {
        return size == capacity;
    }


    public static void main(String[] args) {
        LinkedListStack<Integer> lls = new LinkedListStack<>(10);
        lls.push(20);
        lls.push(50);
        lls.push(80);
        lls.push(40);
        lls.push(60);
        lls.push(75);
        System.out.println("Element removed from LinkedList: "+lls.pop());
        System.out.println("Element removed from LinkedList: "+lls.pop());
        lls.push(10);
        System.out.println("Element removed from LinkedList: "+lls.pop());
        lls.printList();
    }



}

