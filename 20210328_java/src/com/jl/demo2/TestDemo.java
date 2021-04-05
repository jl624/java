package com.jl.demo2;

/**
 * @program:
 * @Author: JINLEI
 * @Description:
 * 抽象类：
 * 1、抽象方法：一个方法如果被abstract修饰，那么这个方法就是抽象方法。抽象方法可以没有具体的实现
 * 2、包含抽象方法的类，抽象类。
 * 注意：
 * 1、抽象类不可以实例化。 不能 Shape shape= new Shape（）;
 * 2、类内数据成员跟普通的类没有区别
 * 3、抽象类主要就是用来被继承
 * 4、如果一个类继承了这个抽象类，那么这个类必须重写抽象类中的抽象方法
 * 5、当抽象类A 继承 抽象类B 那么A可以不重写B中的方法，但是一旦A要是再被继承
 * 那么一定还要重写这个抽象方法。
 * 6、抽象类和抽象方法一定不能被final修饰的。
 * @Date: 2021/3/29
 * @Time: 19:43
 **/

abstract class Shape1{
    public abstract void draw();
}
public class TestDemo {
    public static void main(String[] args) {

    }
}
