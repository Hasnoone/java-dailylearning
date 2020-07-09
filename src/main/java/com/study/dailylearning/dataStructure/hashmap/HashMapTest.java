package com.study.dailylearning.dataStructure.hashmap;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;

/**
 * @description
 * @date 16:55 2020/6/29
 */
public class HashMapTest {

    public static void main(String[] args) {

        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < 15; i++) {
            map.put(i, i);
        }
    }
}
