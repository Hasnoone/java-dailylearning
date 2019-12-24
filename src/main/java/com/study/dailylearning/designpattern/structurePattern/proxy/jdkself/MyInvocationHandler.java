package com.study.dailylearning.designpattern.structurePattern.proxy.jdkself;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * @description
 * @outhor xuhang
 * @create 2019-12-20 16:33
 */
public class MyInvocationHandler implements InvocationHandler {

    Subject realSubject;

    public MyInvocationHandler(Subject realSubject) {
        this.realSubject = realSubject;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("调用代理类");
        if (method.getName().equals("sellBooks")) {
            int invoke = (int) method.invoke(realSubject, args);
            System.out.println("调用的是买书的方法");
            return invoke;
        } else {
            String name = (String) method.invoke(realSubject, args);
            System.out.println("调用的是说话的方法");
            return name;
        }
    }
}
