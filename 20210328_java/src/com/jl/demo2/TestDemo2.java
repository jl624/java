package com.jl.demo2;

/**
 * @program:
 * @Author: JINLEI
 * @Description:
 * 封装：提供公有的方法，对于类的调用者来说，不需要只要具体的实现细节，只管调用这个共有的方法就好。降低了代码的管理复杂度
 * 继承：代码的复用
 * 多态：多态能让类的调用者不需要知道这个类的类型，只需要知道这个对象具有某个方法即可
 * 理解多态
 * @Date: 2021/3/29
 * @Time: 15:15
 **/

class Shape{
    public void draw(){

    }
}
class Cycle extends Shape{
    @Override
    public void draw() {
        System.out.println("画一个⚪");;
    }
}
class React extends Shape {
    @Override
    public void draw() {
        System.out.println("画一个矩形");
        ;
    }
}
public class TestDemo2 {
    /**
     * 什么是多态：
     * 前提条件
     * 1、父类引用  引用子类对象
     * 2、父类和子类有同名的覆盖方法
     * 3、通过父类引用去调用重写的方法的时候
     * 优点：
     * 1、类调用者对类的使用成本进一步降低
     * 2、能够降低代码的”圈复杂度“避免使用大量的if-else
     * 3、可扩展能力强
     * @param args
     */
    public static void main(String[] args) {
        Shape shape1 = new Cycle();
        Shape shape2 = new React();

        shape1.draw();
        shape2.draw();
    }
}
