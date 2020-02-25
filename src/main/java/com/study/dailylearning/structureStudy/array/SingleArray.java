package com.study.dailylearning.structureStudy.array;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 * @program: dailylearning
 * @description: 单项队列
 * @author: XuHang
 * @create: 2020-01-27
 **/
public class SingleArray {

    public static void main(String[] args) {

    }
}


@Setter
@Getter
@ToString
class Node<T> {
    private int head;
    private int rear;
    private int maxSize;
    private int size;
    private T[] data;

    public Node( int maxSize) {
        this.head = -1;
        this.rear = -1;
        this.maxSize = maxSize;
    }
}
