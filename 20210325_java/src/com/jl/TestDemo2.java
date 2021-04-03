package com.jl;

/**
 * @program:
 *       继承：               面试题：子类继承了父类的什么？除了构造方法都被继承
 *          优点：代码复用
 * @Author: JINLEI
 * @Description:
 * @Date: 2021/3/28
 * @Time: 19:12
 **/

class Animal{
    public String name;
    public void eat(){
        System.out.println(this.name+"Animal::eat()");
    }
    public void sleep(){
        System.out.println("Animal::sleep()");
    }
}

class Cat extends Animal {
    public String name;

    public void eat() {
        System.out.println(this.name + "Cat::eat()");
    }
}

class Bird{
    public String name;
    public void eat(){
        System.out.println("Bird::eat()");
    }
    public void fly(){
        System.out.println("Bird::fly()");
    }
}

public class TestDemo2 {
    public static void main(String[] args) {
        Cat cat = new Cat();
        cat.name = "mimi";
        cat.eat();

    }
}
