package com.study.dailylearning.spring.handlewrittenspringframework.utils;

/**
 * @description
 * @date 10:02 2020/6/12
 */
public class ClassUtil {

    /**
     * 获取类加载器
     * @return
     */
    public ClassLoader getClassLoader() {
        return this.getClass().getClassLoader();
    }
}
