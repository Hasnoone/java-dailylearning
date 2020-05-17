package com.study.dailylearning.thread.artconcurrencyprogramming;

/**
 * @description:
 * @create: 下午 9:32 17/5/2020
 **/
public class Synchronized {


    public static void main(String[] args) {
        synchronized (Synchronized.class) {
            m();
        }

    }



    public static synchronized void m() {

    }

}

