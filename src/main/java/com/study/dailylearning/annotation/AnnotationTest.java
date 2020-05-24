package com.study.dailylearning.annotation;

import java.lang.reflect.Method;

/**
 * @description:
 * @create: 下午 10:21 18/5/2020
 **/
public class AnnotationTest {

    @Hello(value = "hello")
    public static void main(String[] args) throws NoSuchMethodException {
        Class<AnnotationTest> clazz = AnnotationTest.class;
        Method main = clazz.getMethod("main", String[].class);


        Hello annotation = main.getAnnotation(Hello.class);

    }
}

