package com.study.dailylearning.dataStructure.queue;

/**
 *
 * @description:
 * @create: 2020-04-18
 **/
public class LinkedQueue<T> {

    public class QNode<T> {
        T data;
        QNode next;

        public QNode(T data) {
            this.data = data;
            this.next = null;
        }
    }

    QNode front;
    QNode rear;

    public LinkedQueue() {
        front = null;
        rear = null;
    }

    public void enQueue(T data) {
        QNode newNode = new QNode(data);
        if (rear == null) {
            rear = front = newNode;
            return;
        }

        rear.next = newNode;
        rear = newNode;
    }


    public void printQueue() {
        QNode temp = front;
        while (null != temp) {
            System.out.println(temp.data);
            temp = temp.next;
        }
    }


    public void deQueue() {
        if (front == null) {
            return;
        }

        QNode temp = this.front;
        this.front = this.front.next;

        if (front == null) {
            rear = null;
        }


    }


    public static void main(String[] args) {
        LinkedQueue<Integer> queue = new LinkedQueue();

        queue.enQueue(10);
        queue.printQueue();
        System.out.println("==========");
        queue.enQueue(20);
        queue.printQueue();
        System.out.println("==========");
        queue.enQueue(30);
        queue.printQueue();
        System.out.println("==========");

        queue.deQueue();
        queue.printQueue();
        System.out.println("==========");
    }
}

