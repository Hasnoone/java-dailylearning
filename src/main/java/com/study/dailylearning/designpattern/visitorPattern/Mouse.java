package com.study.dailylearning.designpattern.visitorPattern;

/**
 * @description
 * @create 2020-01-07 15:55
 */
public class Mouse implements ComputerPart {
    @Override
    public void accept(ComputerPartVisitor computerPartVisitor) {
        computerPartVisitor.visit(this);
    }
}
