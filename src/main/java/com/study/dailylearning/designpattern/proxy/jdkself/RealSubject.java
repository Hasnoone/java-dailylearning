package com.study.dailylearning.designpattern.proxy.jdkself;

/**
 * @description
 * @outhor xuhang
 * @create 2019-12-20 16:32
 */
public class RealSubject implements Subject {
    @Override
    public int sellBooks() {
        System.out.println("卖书");
        return 1 ;
    }

    @Override
    public String speak() {
        System.out.println("说话");
        return "张三";
    }
}
