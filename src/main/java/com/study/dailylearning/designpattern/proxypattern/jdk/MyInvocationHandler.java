package com.study.dailylearning.designpattern.proxypattern.jdk;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class MyInvocationHandler implements InvocationHandler {

    Subject subject;

    public MyInvocationHandler(Subject subject) {
        this.subject = subject;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("开始调用代理类");
        if (method.getName().equalsIgnoreCase("sellBooks")) {
            Object invoke = method.invoke(subject, args);
            System.out.println("调用了sellBooks方法");
            return invoke;
        }
        else {
            String invoke = (String) method.invoke(subject, args);
            System.out.println("调用了speak方法");
            return invoke;
        }
    }
}
