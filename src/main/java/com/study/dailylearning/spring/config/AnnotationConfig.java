package com.study.dailylearning.spring.config;

import com.study.dailylearning.spring.service.TestService;
import com.study.dailylearning.spring.service.impl.TestServiceImpl;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Configuration
@EnableAspectJAutoProxy
public class AnnotationConfig {

    public TestService testService() {
        return new TestServiceImpl();
    }



}
