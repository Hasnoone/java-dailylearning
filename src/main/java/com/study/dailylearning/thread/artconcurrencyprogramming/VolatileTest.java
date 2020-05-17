package com.study.dailylearning.thread.artconcurrencyprogramming;

/**
 * @description:
 * @create: 下午 4:53 17/5/2020
 **/
public class VolatileTest {

    int a = 0;


    public synchronized int getA() {
        return a;
    }

    public synchronized void setA(int a) {
        this.a = a;
    }

    public static void main(String[] args) {

    }



}

