package com.study.dailylearning.designpattern.structurePattern.decoratorPattern;

/**
 *
 * @description:
 * @create: 2019-12-24
 **/
public abstract class ShapeDecorator implements Shape {
    protected Shape decoratorShape;


    public ShapeDecorator(Shape decoratorShape) {
        this.decoratorShape = decoratorShape;
    }

    public void draw() {
        decoratorShape.draw();
    }

}

