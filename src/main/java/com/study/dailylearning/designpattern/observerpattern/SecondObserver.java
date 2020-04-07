package com.study.dailylearning.designpattern.observerpattern;

public class SecondObserver extends Observer {
    @Override
    protected void update(String msg) {
        System.out.println(SecondObserver.class.getName()+":"+msg);
    }
}
