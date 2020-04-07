package com.study.dailylearning.designpattern.observerpattern;

import java.util.ArrayList;
import java.util.List;

/**
 * 被观察者
 */
public class Subject {


    //订阅列表
    private List<Observer> observerList = new ArrayList<>();

    //订阅
    public void subscription(Observer observer) {
        observerList.add(observer);
    }

    //notifyAll
    public void notifyAll(String msg) {
        for (Observer item : observerList) {
            item.update(msg);
        }
    }






}
