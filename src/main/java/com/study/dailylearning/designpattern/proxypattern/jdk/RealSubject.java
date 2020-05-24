package com.study.dailylearning.designpattern.proxypattern.jdk;

public class RealSubject implements Subject {
    @Override
    public int sellBooks() {
        System.out.println("Method sellBook() ");
        return 3;
    }

    @Override
    public String speak() {
        System.out.println("Method speak()");
        return "张L";
    }



}
