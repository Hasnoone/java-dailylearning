package com.study.dailylearning.spring.handlewrittenspringframework.annotation;


import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * @description
 * @date 09:24 2020/6/12
 */

@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.METHOD})
public @interface RequestMapping {

    //映射请求路径
    String value() default "";

    //请求方法
    RequestMethod method() default RequestMethod.GET;

}
