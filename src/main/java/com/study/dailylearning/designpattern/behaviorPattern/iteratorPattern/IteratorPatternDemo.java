package com.study.dailylearning.designpattern.behaviorPattern.iteratorPattern;

/**
 * @program: dailylearning
 * @description: 这种模式用于顺序访问集合对象的元素，不需要知道集合对象的底层表示。
 * 提供一种方法顺序访问一个聚合对象中各个元素, 而又无须暴露该对象的内部表示。
 *
 *
 * @author: XuHang
 * @create: 2019-12-28
 **/
public class IteratorPatternDemo {

    public static void main(String[] args) {

        Container container = new NameRepository();

        for (Iterator it = container.getIterator(); it.hasNext(); ) {

            System.out.println(it.next());

        }




    }

}

