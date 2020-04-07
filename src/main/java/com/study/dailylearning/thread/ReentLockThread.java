package com.study.dailylearning.thread;

import java.util.concurrent.locks.ReentrantLock;

/**
 * @program: dailylearning
 * @description:
 * @author: XuHang
 * @create: 2020-01-14
 **/
public class ReentLockThread {


    private static ReentrantLock reentrantLock = new ReentrantLock();

    public static void main(String[] args) {

        Thread thread1=new Thread() {
            @Override
            public void run() {
                testSyn();
            }
        };

        Thread thread2=new Thread() {
            @Override
            public void run() {
                testSyn();
            }
        };

        thread1.start();
        thread2.start();


    }

    public static void testSyn() {
        String name = Thread.currentThread().getName();
        reentrantLock.lock();
        try {
            Thread.sleep(1000000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(name);
        reentrantLock.unlock();

    }

}

