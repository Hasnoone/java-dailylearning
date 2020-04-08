package com.study.dailylearning.designpattern.abstractfactorypattern.factory;

import com.study.dailylearning.designpattern.abstractfactorypattern.color.Color;
import com.study.dailylearning.designpattern.abstractfactorypattern.shape.Shape;

public abstract class AbstractFactory {

    public abstract Shape getShape(String shape);
    public abstract Color getColor(String color);

}
