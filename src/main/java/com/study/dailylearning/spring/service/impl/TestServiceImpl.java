package com.study.dailylearning.spring.service.impl;

import com.study.dailylearning.spring.service.TestService;
import org.springframework.stereotype.Service;

/**
 * @program: dailylearning
 * @description:
 * @author: XuHang
 * @create: 2020-03-23
 **/
@Service
public class TestServiceImpl implements TestService {
    @Override
    public void test() {
        System.out.println("I got you!");
    }
}

