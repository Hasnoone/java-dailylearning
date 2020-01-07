package com.study.dailylearning.designpattern.visitorPattern;

/**
 * @author kevin
 * @Description: TODO
 * @date
 */
public interface ComputerPart {
    void accept(ComputerPartVisitor computerPartVisitor);
}
