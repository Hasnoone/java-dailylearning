package com.study.dailylearning.designpattern.structurePattern.decoratorPattern;

import com.study.dailylearning.designpattern.structurePattern.facade.Shape;

/**
 * @description
 * @outhor xuhang
 * @create 2019-12-20 14:17
 */
public class Circle implements Shape {
    @Override
    public void draw() {
        System.out.println("Circle ···");
    }
}
