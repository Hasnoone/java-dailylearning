package com.study.dailylearning.designpattern.strategypattern;


/**
 * 在策略模式（Strategy Pattern）中，一个类的行为或其算法可以在运行时更改。这种类型的设计模式属于行为型模式
 *在策略模式中，我们创建表示各种策略的对象和一个行为随着策略对象改变而改变的 context 对象。策略对象改变 context 对象的执行算法。
 * 在有多种算法相似的情况下，使用 if...else 所带来的复杂和难以维护。
 *
 *
 *
 */
public class StrategyPatternDemo {


    public static void main(String[] args) {
        OperationMultiply multiply = new OperationMultiply();
        OperationSubstract substract = new OperationSubstract();


        Context context = new Context(substract);


        int result = context.doOperation(1, 2);


        System.out.println("result is "+result);


    }

}
