package com.study.dailylearning.spring;

import com.study.dailylearning.spring.service.TestService;
import com.study.dailylearning.spring.service.impl.TestServiceImpl;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class SpringSourceCodeAnalysis {


    public static void main(String[] args) {
//        ApplicationContext context = new ClassPathXmlApplicationContext("classpath:ApplicationContext.xml");
        ApplicationContext context = new AnnotationConfigApplicationContext(TestServiceImpl.class);
        TestService service = context.getBean("testServiceImpl", TestServiceImpl.class);
        service.test();


    }


}

