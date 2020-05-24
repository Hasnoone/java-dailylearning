package com.study.dailylearning.designpattern.proxypattern.jdk;

import java.lang.reflect.Proxy;

/**
 * java.lang.reflect.Proxy:生成动态代理类和对象；
 *  java.lang.reflect.InvocationHandler（处理器接口）：可以通过invoke方法实现
 * 对真实角色的代理访问。
 *
 * 每次通过 Proxy 生成的代理类对象都要指定对应的处理器对象。
 */
public class JdkProxyDemo {
    public static void main(String[] args) {
        //真实对象
        RealSubject realSubject = new RealSubject();
        MyInvocationHandler myInvocationHandler = new MyInvocationHandler(realSubject);
        //代理对象
        Subject proxySubject = (Subject) Proxy.newProxyInstance(ClassLoader.getSystemClassLoader(), new Class[]{Subject.class}, myInvocationHandler);
        proxySubject.sellBooks();
        proxySubject.speak();
    }
}
