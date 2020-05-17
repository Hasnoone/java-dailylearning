package com.study.dailylearning.thread.artconcurrencyprogramming;

/**
 * @description:
 * @create: 下午 9:41 17/5/2020
 **/
public class WaitNotify {

    static boolean flag = true;

    static Object lock = new Object();


    public static void main(String[] args) {

    }


    static class Wait implements Runnable {
        @Override
        public void run() {
            //加锁  拥有lock的monitor
            synchronized (lock) {
                while (flag) {
                    //当条件满足的时候继续wait
                    try {
                        System.out.println(Thread.currentThread()+"flag is true");
                        lock.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }

                }

            }

        }
    }


    static class Notify implements Runnable {

        @Override
        public void run() {
            synchronized (lock) {
                lock.notifyAll();
                flag = false;
                try {
                    Thread.sleep(5000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }

            synchronized (lock) {

            }
        }
    }





}

