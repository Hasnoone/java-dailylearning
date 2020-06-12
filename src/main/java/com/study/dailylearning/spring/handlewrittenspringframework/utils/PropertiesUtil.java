package com.study.dailylearning.spring.handlewrittenspringframework.utils;

import org.springframework.util.ClassUtils;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

/**
 * @description
 * @date 09:32 2020/6/12
 */
public class PropertiesUtil {


    public static Properties loadProperties(String file) {
        Properties properties = null;
        InputStream inputStream = null;
        try {
            inputStream = ClassUtils.getDefaultClassLoader().getResourceAsStream(file);
            properties = new Properties();
            properties.load(inputStream);
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            if (inputStream != null) {
                try {
                    inputStream.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
        return properties;
    }

    /**
     * 获取 String 类型的属性值（默认值为空字符串）
     */
    public static String getString(Properties props, String key) {
        return getString(props, key, "");
    }

    /**
     * 获取 String 类型的属性值（可指定默认值）
     */
    public static String getString(Properties props, String key, String defaultValue) {
        String value = defaultValue;
        if (props.containsKey(key)) {
            value = props.getProperty(key);
        }
        return value;
    }

    /**
     * 获取 int 类型的属性值（默认值为 0）
     */
    public static int getInt(Properties props, String key) {
        return getInt(props, key, 0);
    }

    /**
     * 获取 int 类型的属性值（可指定默认值）
     */
    public static int getInt(Properties props, String key, int defaultValue) {
        int value = defaultValue;
        if (props.containsKey(key)) {
            value = Integer.parseInt(props.getProperty(key));
        }
        return value;
    }

    /**
     * 获取 boolean 类型属性（默认值为 false）
     */
    public static boolean getBoolean(Properties props, String key) {
        return getBoolean(props, key, false);
    }

    /**
     * 获取 boolean 类型属性（可指定默认值）
     */
    public static boolean getBoolean(Properties props, String key, boolean defaultValue) {
        boolean value = defaultValue;
        if (props.containsKey(key)) {
            value = Boolean.parseBoolean(props.getProperty(key));
        }
        return value;
    }


}
