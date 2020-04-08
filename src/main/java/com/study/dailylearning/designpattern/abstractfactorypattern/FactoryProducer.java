package com.study.dailylearning.designpattern.abstractfactorypattern;

import com.study.dailylearning.designpattern.abstractfactorypattern.factory.AbstractFactory;
import com.study.dailylearning.designpattern.abstractfactorypattern.factory.ColorFactory;
import com.study.dailylearning.designpattern.abstractfactorypattern.factory.ShapeFactory;

public class FactoryProducer {


    public static AbstractFactory  getFactory(String type) {
        if ("shape".equals(type)) {
            return new ShapeFactory();
        } else {
            return new ColorFactory();
        }
    }



}
