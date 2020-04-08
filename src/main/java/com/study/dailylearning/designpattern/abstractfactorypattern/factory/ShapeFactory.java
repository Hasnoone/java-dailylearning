package com.study.dailylearning.designpattern.abstractfactorypattern.factory;


import com.study.dailylearning.designpattern.abstractfactorypattern.color.Color;
import com.study.dailylearning.designpattern.abstractfactorypattern.shape.CircleShape;
import com.study.dailylearning.designpattern.abstractfactorypattern.shape.Shape;
import com.study.dailylearning.designpattern.abstractfactorypattern.shape.SquareShape;

public class ShapeFactory extends AbstractFactory {


    @Override
    public Shape getShape(String shape) {
        if ("circle".equals(shape)) {
            return new CircleShape();
        } else {
            return new SquareShape();
        }
    }

    @Override
    public Color getColor(String color) {
        return null;
    }
}
