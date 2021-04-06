package com.jl.demo;

/**
 * @program:
 * @Author: JINLEI
 * @Description:
 * 深拷贝、浅拷贝
 * @Date: 2021/3/30
 * @Time: 15:47
 **/
class Money implements Cloneable{
    double money = 12.5;

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
class Person implements Cloneable{
    public int age;
    Money money = new Money();

    //重写了父类的clone方法
    @Override
    protected Object clone() throws CloneNotSupportedException {
        //return super.clone();
        //1、克隆person
        Person p = (Person) super.clone();
        //2、克隆当前的Money对象
        p.money = (Money) this.money.clone();
        return p;
    }
}

public class TestDemo {
    public static void main(String[] args) throws CloneNotSupportedException {
        Person person1 = new Person();
        Person person2 = (Person) person1.clone();
        System.out.println(person1.money.money);
        System.out.println(person2.money.money);

        System.out.println("================修改==============");
        person2.money.money = 99.9;
        System.out.println(person1.money.money);
        System.out.println(person2.money.money);

    }

    public static void main1(String[] args) throws CloneNotSupportedException {
        Person person1 = new Person();
        Person person2 = (Person) person1.clone();
        person2.age = 99;
        System.out.println(person1.age);
        System.out.println(person2.age);
    }
}
