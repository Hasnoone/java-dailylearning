package com.study.dailylearning.designpattern.behaviorPattern.iteratorPattern;

/**
 * @program: dailylearning
 * @description:
 * @author: XuHang
 * @create: 2019-12-28
 **/
public class NameRepository implements Container {

    public String[] naems = {"xuhang","zhanglu"};


    @Override
    public Iterator getIterator() {
        return new NameIterator();
    }

    public class NameIterator implements Iterator{

        int index;

        @Override
        public boolean hasNext() {
            if (index < naems.length) {
                return true;
            }
            return false;
        }

        @Override
        public Object next() {
            if (this.hasNext()) {
                return naems[index++];
            }
            return null;
        }
    }

}

