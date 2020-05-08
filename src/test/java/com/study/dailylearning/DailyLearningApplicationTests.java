package com.study.dailylearning;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
@ContextConfiguration(locations = "classpath:ApplicationContext.xml")
class DailyLearningApplicationTests {


    @Value("${config.icon}")
    private String key;



    @Test
    void contextLoads() {
        System.out.println(key);
    }








}
