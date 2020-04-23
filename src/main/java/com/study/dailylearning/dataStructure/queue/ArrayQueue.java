package com.study.dailylearning.dataStructure.queue;

/**
 * @program: dailylearning
 * @description: 用数组实现一个队列
 * <p>
 * 队列
 * @author: XuHang
 * @create: 2020-04-16
 **/
public class ArrayQueue<T> {

    private T[] items;
    private int head;
    private int tail;


    public ArrayQueue(int capacity) {
        items = (T[]) new Object[capacity];
    }

    public boolean isFull(ArrayQueue arrayQueue) {
        return tail== items.length-1;
    }

    public boolean isEmpty(ArrayQueue arrayQueue) {
        return head == tail;
    }


    public void enQueue(T item) {
        items[tail++] = item;
    }

    public void circleEnQueue(T item) {
        if ((tail+1)%items.length==head) {
            return;
        }
        items[tail] = item;
        tail = (tail + 1) % items.length;
    }


    public T deQueue() {
        T item = items[head++];
        return item;
    }


    public T circleDeQueue() {
        if (tail == head) {
            return null;
        }
        T returnVal = items[head];
        head = (head + 1) % items.length;
        return returnVal;
    }

    public static void main(String[] args) {
        ArrayQueue<Integer> arrayQueue = new ArrayQueue<>(10);
        arrayQueue.enQueue(1);
        arrayQueue.enQueue(2);
        arrayQueue.enQueue(3);
        arrayQueue.deQueue();
        arrayQueue.deQueue();
    }
}

