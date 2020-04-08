package com.study.dailylearning.designpattern.observerpattern;

/**
 * 观察者模式
 * 当对象间存在一对多关系时，则使用观察者模式（Observer Pattern）。比如，当一个对象被修改时，则会自动通知它的依赖对象。观察者模式属于行为型模式。
 * 意图：定义对象间的一种一对多的依赖关系，当一个对象的状态发生改变时，所有依赖于它的对象都得到通知并被自动更新。
 * 主要解决：一个对象状态改变给其他对象通知的问题，而且要考虑到易用和低耦合，保证高度的协作。
 * 何时使用：一个对象（目标对象）的状态发生改变，所有的依赖对象（观察者对象）都将得到通知，进行广播通知。
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
