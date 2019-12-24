package com.study.dailylearning.designpattern.structurePattern.proxy.jdkself;

import java.lang.reflect.Proxy;

/**
 * @description
 * JDK 自带的动态代理
 *  java.lang.reflect.Proxy:生成动态代理类和对象；
 *  java.lang.reflect.InvocationHandler（处理器接口）：可以通过invoke方法实现
 * 对真实角色的代理访问。
 * 每次通过 Proxy 生成的代理类对象都要指定对应的处理器对象。
 * @outhor xuhang
 * @create 2019-12-20 16:42
 */
public class Demo {
    public static void main(String[] args) {
        Subject subject = new RealSubject();
        MyInvocationHandler handler = new MyInvocationHandler(subject);
        Subject proxy = (Subject) Proxy.newProxyInstance(ClassLoader.getSystemClassLoader(), new Class[]{Subject.class}, handler);

        proxy.sellBooks();

//        proxy.speak();

    }
}
