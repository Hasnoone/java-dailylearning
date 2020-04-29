package com.study.dailylearning.designpattern.structurePattern.decoratorPattern;

import com.study.dailylearning.designpattern.structurePattern.facade.Shape;

/**
 * @description
 * @create 2019-12-20 14:17
 */
public class Rectangle implements Shape {
    @Override
    public void draw() {
        System.out.println("Rectangle ···");
    }
}
