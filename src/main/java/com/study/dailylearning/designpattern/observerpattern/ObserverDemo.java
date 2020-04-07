package com.study.dailylearning.designpattern.observerpattern;

/**
 * 观察者模式
 * 当对象间存在一对多关系时，则使用观察者模式（Observer Pattern）。比如，当一个对象被修改时，则会自动通知它的依赖对象。观察者模式属于行为型模式。
 */
public class ObserverDemo {


    public static void main(String[] args) {
        FirstObserver firstObserver = new FirstObserver();
        SecondObserver secondObserver = new SecondObserver();
        ThirdObserver thirdObserver = new ThirdObserver();

        Subject subject = new Subject();
        subject.subscription(firstObserver);
        subject.subscription(secondObserver);
        subject.subscription(thirdObserver);

        subject.notifyAll("观察者模式");
    }

}
