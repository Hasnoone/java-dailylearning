package com.study.dailylearning.designpattern.structurePattern.facade;

/**
 * @description 外观类
 * @create 2019-12-20 14:19
 */
public class ShapeMaker {
    private Shape circle;
    private Shape square;
    private Shape rectagle;

    public ShapeMaker() {
        this.circle = new Circle();
        this.square = new Square();
        this.rectagle = new Rectangle();
    }

    public void drawCircle() {
        circle.draw();
    }

    public void drawSquare() {
        square.draw();
    }

    public void drawRectangle() {
        rectagle.draw();
    }

}
