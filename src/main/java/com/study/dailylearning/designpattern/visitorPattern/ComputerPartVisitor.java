package com.study.dailylearning.designpattern.visitorPattern;

/**
 * @author kevin
 * @Description: TODO
 * @date
 */
public interface ComputerPartVisitor {
    void visit(KeyBoard keyBoard);
    void visit(Monitor monitor);
    void visit(Mouse mouse);

}
