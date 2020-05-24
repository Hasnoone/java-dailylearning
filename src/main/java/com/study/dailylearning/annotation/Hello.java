package com.study.dailylearning.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Target;

/**
 * @description:
 * @create: 下午 10:20 18/5/2020
 **/
@Target(value = {ElementType.FIELD, ElementType.METHOD})
public @interface Hello {

    String value();

}

