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

    private Object target;

    public CligbProxy(Object target) {
        this.target = target;
    }


    @Override
    public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
        System.out.println("before invocation ···");
        Object invoke = method.invoke(target, objects);
        System.out.println("after invocation   ···");

        return invoke;
    }



    public static Object getProxy() {


        return null;
    }
}
