package com.study.dailylearning.spring.service.impl;

import com.study.dailylearning.spring.service.TestService;
import org.springframework.stereotype.Service;


@Service
public class TestServiceImpl implements TestService {
    @Override
    public void test() {
        System.out.println("I got you!");
    }
}

