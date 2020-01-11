package com.study.dailylearning.structureStudy.test;

import java.util.ArrayList;
import java.util.List;

/**
 * @program: dailylearning
 * @description:
 * @author: XuHang
 * @create: 2020-01-07
 **/
public class TestJvm {

    byte[] bytes = new byte[1024 * 100];



    public static void main(String[] args) {
        test();
    }


    public static void test() {


        Thread thread = new Thread(){
            @Override
            public void run() {
                System.out.println("123456");
            }
        };

        thread.start();

        try {  
            List list = new ArrayList();

            Thread.sleep(5000);
            for (int i = 0; i < 2000; i++) {
                Thread.sleep(100);

                list.add(new TestJvm());
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }
}

