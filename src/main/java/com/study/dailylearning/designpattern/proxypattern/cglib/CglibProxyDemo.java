package com.study.dailylearning.designpattern.proxypattern.cglib;

public class CglibProxyDemo {
    public static void main(String[] args) {
        Engineer engineer = (Engineer) CglibProxy.getProxy(new Engineer());
        engineer.eat();
        engineer.work();
    }

}
