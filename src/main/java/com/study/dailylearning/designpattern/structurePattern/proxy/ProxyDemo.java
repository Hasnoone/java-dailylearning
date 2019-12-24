package com.study.dailylearning.designpattern.structurePattern.proxy;

/**
 * @description
 * @outhor xuhang
 * @create 2019-12-20 16:30
 */
public class ProxyDemo {
    public static void main(String[] args) {
        Image image = new ProxyImage("happy dunk");
        image.disPlay();
    }
}
