package com.study.dailylearning.designpattern.abstractfactorypattern.factory;


import com.study.dailylearning.designpattern.abstractfactorypattern.color.Blue;
import com.study.dailylearning.designpattern.abstractfactorypattern.color.Color;
import com.study.dailylearning.designpattern.abstractfactorypattern.color.Red;
import com.study.dailylearning.designpattern.abstractfactorypattern.shape.CircleShape;
import com.study.dailylearning.designpattern.abstractfactorypattern.shape.Shape;
import com.study.dailylearning.designpattern.abstractfactorypattern.shape.SquareShape;

public class ColorFactory extends AbstractFactory {


    @Override
    public Color getColor(String color) {
        Color color1 = null;
        if ("circle".equals(color)) {
            color1 = (Color) new Red();
        } else {
            color1 = (Color) new Blue();
        }
        return color1;
    }

    @Override
    public Shape getShape(String color) {
        return null;
    }
}
