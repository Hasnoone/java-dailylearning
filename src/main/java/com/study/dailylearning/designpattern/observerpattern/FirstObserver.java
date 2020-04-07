package com.study.dailylearning.designpattern.observerpattern;

public class FirstObserver extends Observer {
    @Override
    protected void update(String msg) {
        System.out.println(FirstObserver.class.getName()+":"+msg);
    }
}
