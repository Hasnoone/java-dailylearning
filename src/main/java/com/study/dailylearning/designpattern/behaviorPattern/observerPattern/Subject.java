package com.study.dailylearning.designpattern.behaviorPattern.observerPattern;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @description:
 * @create: 2019-12-28
 **/
public class Subject {
    public List<Observer> observers = new ArrayList<>();


    private int state;

}

