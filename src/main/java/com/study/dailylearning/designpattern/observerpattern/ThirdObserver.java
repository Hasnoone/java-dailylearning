package com.study.dailylearning.designpattern.observerpattern;

public class ThirdObserver extends Observer {
    @Override
    protected void update(String msg) {
        System.out.println(ThirdObserver.class.getName()+":"+msg);
    }
}
