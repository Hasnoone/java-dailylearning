package com.study.dailylearning.designpattern.decoratorpattern;

public class RedShapeDecorator extends ShapeDecorator {


    public RedShapeDecorator(Shape decoratorShape) {
        super(decoratorShape);
    }

    public void draw() {
        decoratorShape.draw();
        setRedBorder(decoratorShape);
    }

    private void setRedBorder(Shape decoratedShape){
        System.out.println("Border Color: Red");
    }
}
