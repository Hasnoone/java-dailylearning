package com.study.dailylearning.dataStructure.stack;

import com.sun.corba.se.spi.orbutil.threadpool.NoSuchWorkQueueException;

import java.util.LinkedList;
import java.util.Queue;

public class StackUsingTwoQueues {

    Queue<Integer> queue1;
    Queue<Integer> queue2;

    public StackUsingTwoQueues() {
        this.queue1 = new LinkedList<>();
        this.queue2 = new LinkedList<>();
    }




    //remove value from the beginning of the list to demonstrating behaviour of stack
    //queue first in first out
    //stack last in first out
    public void push(int data) {
        if (queue1.size() == 0) {
            queue1.add(data);
        } else {
            //copy element from queue1 to queue2
            for (int i = 0; i < queue1.size(); i++) {
                queue2.add(queue1.remove());
            }
            queue2.add(data);

            //copy element from queue2 to queue1
            for (int i = 0; i < queue2.size(); i++) {
                queue1.add(queue2.remove());
            }
        }
    }



    public int pop() {
        if (queue1.size() == 0) {
            throw new QueueEmptyException("There is no elements in the stack,Underflow Exception");
        }
        return queue1.remove();
    }


    public class QueueEmptyException extends RuntimeException {
        public QueueEmptyException(){
            super();
        }

        public QueueEmptyException(String message) {
            super(message);
        }

    }


    public static void main(String[] args) {
        StackUsingTwoQueues stack = new StackUsingTwoQueues();
        stack.push(20);
        stack.push(40);
        stack.push(70);
        stack.push(50);
        stack.push(90);
        stack.push(110);
        stack.push(30);
        System.out.println("Removed element : "+ stack.pop());
        stack.push(170);
        System.out.println("Removed element : "+ stack.pop());
    }




}
