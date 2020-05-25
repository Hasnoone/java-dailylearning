package com.study.dailylearning.algorithm4th;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

/**
 * @author Daguji
 * @Description
 * @create 2020-05-25 下午 11:10
 */
@ToString
@Getter
@Setter
@NoArgsConstructor
public class Test {
    private int num;

    public Test(int num) {
        this.num = num;
    }



    public static void main(String[] args) {
        Test test = new Test();
        test.print(test);




    }

    public void print(Test test) {
        Test oldTest = test;

        test = new Test(10);


        System.out.println("test=======" + test);
        System.out.println("oldTest=======" + oldTest);
    }


}
