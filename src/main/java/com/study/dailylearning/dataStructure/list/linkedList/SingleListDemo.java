package com.study.dailylearning.dataStructure.list.linkedList;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

/**
 * @program: dailylearning
 * @description:
 * @author: XuHang
 * @create: 2020-01-27
 **/
public class SingleListDemo {

    public static void main(String[] args) {
        SinglyLinkedList list = new SinglyLinkedList();

        list.insert(1);
        list.insert(3);
        list.insert(2);


//        list.insertSorted(2);
//        list.insertSorted(3);
//        list.insertSorted(2);


        list.priElements();
        System.out.println(list.getSize());


        list.deleteElement(1);
        list.priElements();
        System.out.println(list.getSize());


        list.insertSpecificPosition(12, 1);
        list.insertSpecificPosition(13, 2);
//        list.insertSpecificPosition(11, 7);//failure
        list.priElements();
        System.out.println(list.getSize());

    }

}


@Getter
@Setter
class SinglyLinkedList {
    private Node head;
    private int size;

    public void priElements() {
        StringBuilder sb = new StringBuilder();
        Node temp = head.getNext();
        while (temp != null) {
            sb.append(temp.getData() + ",");
            temp = temp.getNext();
        }

        System.out.println(sb.toString());
    }


    public SinglyLinkedList() {
        this.head = new Node();
        this.size = 0;
    }

    public SinglyLinkedList(Node head, int size) {
        this.head = head;
        this.size = size;
    }

    public void insert(int data) {
        Node temp = head;
        while (temp.getNext() != null) {
            temp = temp.getNext();
        }

        Node newNode = new Node(data);
        temp.setNext(newNode);
        size++;
    }


    public void insertSorted(int data) {
        Node temp = head;
        while (temp.getNext() != null && data > temp.getNext().getData()) {
            temp = temp.getNext();
        }

        Node childNode = temp.getNext();
        Node newNode = new Node(data);
        newNode.setNext(childNode);
        temp.setNext(newNode);
        size++;
    }


    public void deleteElement(int position) {
        Node temp = head;

        for (int i = 0; i < position-1; i++) {
            temp = temp.getNext();
        }

        Node removeNode = temp.getNext().getNext();
        temp.setNext(temp.getNext().getNext());
        removeNode = null;
        size--;

    }


    public void insertSpecificPosition(int data, int position) {
        Node temp = head;
        for (int i = 0; i < position-1; i++) {
            temp = temp.getNext();
        }

        Node newNode = new Node(data);
        newNode.setNext(temp.getNext());
        temp.setNext(newNode);




    }
}


@Getter
@Setter
@ToString
@NoArgsConstructor
class Node {

    private int data;
    private Node next;

    public Node(int data) {
        this(data, null);
    }

    public Node(int data, Node next) {
        this.data = data;
        this.next = next;
    }
}

