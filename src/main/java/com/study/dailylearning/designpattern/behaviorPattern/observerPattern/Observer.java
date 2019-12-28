package com.study.dailylearning.designpattern.behaviorPattern.observerPattern;

/**
 * @program: dailylearning
 * @description:
 * @author: XuHang
 * @create: 2019-12-28
 **/
public abstract class Observer {
    protected Subject subject;
    public abstract void update();
}

