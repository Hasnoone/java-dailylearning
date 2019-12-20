package com.study.dailylearning.designpattern.proxy.cglib;

import org.springframework.cglib.proxy.MethodInterceptor;
import org.springframework.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

/**
 * @description
 * @outhor xuhang
 * @create 2019-12-20 16:58
 */
public class CligbProxy implements MethodInterceptor {

    Subject subject;

    public CligbProxy(Subject subject) {
        this.subject = subject;
    }



    @Override
    public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
        return null;
    }
}
