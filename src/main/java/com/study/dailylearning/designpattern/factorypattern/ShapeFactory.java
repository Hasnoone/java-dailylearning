package com.study.dailylearning.designpattern.factorypattern;

import org.apache.poi.ss.formula.functions.T;
import org.apache.poi.xwpf.usermodel.TOC;

public class ShapeFactory {

    private static Shape shape;

    private static Object object;


    public static <T> T getTObject(Class<? extends T> clazz) {
        T tObject = null;
        try {
            tObject = (T) Class.forName(clazz.getName()).newInstance();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        return tObject;

    }



    public static Object getClass(Class<? extends Shape> clazz) {

        try {
            object = Class.forName(clazz.getName()).newInstance();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InstantiationException e) {
            e.printStackTrace();
        }
        return object;
    }









    public static Shape createShape(String type) {
        if ("circle".equals(type)) {
            shape = new CircleShape();
        }else {
            shape = new SquareShape();
        }
        return shape;
    }
}
