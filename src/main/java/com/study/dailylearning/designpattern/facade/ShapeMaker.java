package com.study.dailylearning.designpattern.facade;

/**
 * @description 外观类
 * @outhor xuhang
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



}
