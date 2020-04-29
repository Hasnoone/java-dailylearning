package com.study.dailylearning.dataStructure.queue;

import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Random;

/**
 *
 * @description: 优先级队列
 * @create: 2020-04-19
 **/
public class ArrayPriorityQueue<T extends Comparable> {

        int head;
        int tail;
        T[] items;

        public ArrayPriorityQueue(int capacity) {
            head = tail = 0;
            items = (T[]) new Object[capacity];
        }


    public void enQueue(T item) {
        items[tail++] = item;
        return;
    }


    public <T> T deQueue() {
        int index = 0;
        for (int i = 0; i < items.length; i++) {
            if ((items[index].compareTo(items[i])) > 0) {
                index = i;
            }
        }
        T returnItem = (T) items[index];
        head--;


        return returnItem;


    }






    public static void main(String[] args) {


        Queue<Integer> priorityQueue = new PriorityQueue<>(7);


        Random random = new Random();
        for (int i = 0; i < 7; i++) {
            priorityQueue.add(new Integer(random.nextInt(100)));
        }




    }



}

