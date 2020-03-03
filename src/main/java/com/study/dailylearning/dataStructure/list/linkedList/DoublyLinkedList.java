package com.study.dailylearning.dataStructure.list.linkedList;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

/**
 * @program: dailylearning
 * @description:
 * @author: XuHang
 * @create: 2020-02-27
 **/
public class DoublyLinkedList {


    private DoubleNode head;
    private DoubleNode tail;

    public DoublyLinkedList() {
        this.head = null;
        this.tail = null;
    }





}

@Getter
@Setter
@ToString
@NoArgsConstructor
class DoubleNode{

    int data;
    DoubleNode pre;
    DoubleNode next;

    public DoubleNode(int data) {
        this.data = data;
    }



}