package com.study.dailylearning.dto;

import org.springframework.beans.BeanUtils;

/**
 * @program: dailylearning
 * @description:
 * @author: XuHang
 * @create: 2020-01-22
 **/
public class Test {
    public static void main(String[] args) {
        User user = new User();
        user.setAge(25);
        user.setName("张露");

        UserInputDTO userInputDTO=new UserInputDTO();

        BeanUtils.copyProperties(user, userInputDTO);




    }
}

