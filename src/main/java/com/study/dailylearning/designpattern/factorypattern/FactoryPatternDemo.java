package com.study.dailylearning.designpattern.factorypattern;


/**
 *工厂模式（Factory Pattern）是 Java 中最常用的设计模式之一。这种类型的设计模式属于创建型模式，它提供了一种创建对象的最佳方式。
 *
 * 在工厂模式中，我们在创建对象时不会对客户端暴露创建逻辑，并且是通过使用一个共同的接口来指向新创建的对象。
 * 意图：定义一个创建对象的接口，让其子类自己决定实例化哪一个工厂类，工厂模式使其创建过程延迟到子类进行。
 * 主要解决：主要解决接口选择的问题。
 * 何时使用：我们明确地计划不同条件下创建不同实例时。
 * 如何解决：让其子类实现工厂接口，返回的也是一个抽象的产品。
 *
 *
 *
 *
 * 先看一下工厂模式是用来干什么的——属于创建模式，解决子类创建问题的。换句话来说，调用者并不知道运行时真正的类名，只知道从“Circle"可以创建出一个shape接口的类，至于类的名称是否叫'Circle"，调用者并不知情。所以真正的对工厂进行扩展的方式（防止程序员调用出错）可以考虑使用一个枚举类（防止传入参数时，把circle拼写错误）。
 *
 * 如果调用者参肯定类型是Circle的话，那么其工厂没有存在的意义了！
 *
 * 比如 IShape shape = new Circle();这样不是更好？也就是说调用者有了Circle这个知识是可以直接调用的，根据DP（迪米特法则）其实调用者并不知道有一个Circle类的存在，他只需要知道这个IShape接口可以计算圆面积，而不需要知道；圆这个类到底是什么类名——他只知道给定一个”circle"字符串的参数,IShape接口可以自动计算圆的面积就可以了！
 *
 * 其实在.net类库中存在这个模式的的一个典型的。但他引入的另一个概念“可插入编程协议”。
 *
 * 那个就是WebRequest req = WebRequest.Create("http://ccc......");可以自动创建一个HttpWebRequest的对象，当然，如果你给定的是一个ftp地址，他会自动创建一个FtpWebRequest对象。工厂模式中着重介绍的是这种通过某个特定的参数，让你一个接口去干对应不同的事而已！而不是调用者知道了类！
 *
 * 比如如果圆的那个类名叫"CircleShape“呢？不管是反射还是泛型都干扰了你们具体类的生成！其实这个要说明的问题就是这个，调用者（clinet)只知道IShape的存在，在创建时给IShape一个参数"Circle",它可以计算圆的面积之类的工作，但是为什么会执行这些工作，根据迪米特法则，client是不用知道的。
 *
 * 我想问一下那些写笔记的哥们，如果你们知道了泛型，那么为什么不直接使用呢？干吗还需要经过工厂这个类呢？不觉得多余了吗？
 *
 * 如果，我只是说如果，如果所有从IShape继承的类都是Internal类型的呢？而client肯定不会与IShape一个空间！这时，你会了现你根本无法拿到这个类名！
 *
 * Create时使用注册机制是一种简单的办法，比如使用一个枚举类，把功能总结到一处。而反射也是一种最简单的办法，调用者输入的名称恰是类名称或某种规则时使用，比如调用者输入的是Circle，而类恰是CircleShape，那么可以通过输入+”Shape"字符串形成新的类名，然后从字符串将运行类反射出来！
 *
 * 工厂的创建行为，就这些作用，还被你们用反射或泛型转嫁给了调用者（clinet)，那么，这种情况下，要工厂类何用？！
 */
public class FactoryPatternDemo {

    public static void main(String[] args) {
        Shape circle = ShapeFactory.createShape("circle");
        circle.draw();

        Shape square = (Shape) ShapeFactory.getClass(SquareShape.class);
        square.draw();

        Shape square1 =  ShapeFactory.getTObject(SquareShape.class);
        square1.draw();


    }
}
