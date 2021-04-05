package com.jl.demo3;

/**
 * @program:
 * @Author: JINLEI
 * @Description:
 * @Date: 2021/3/29
 * @Time: 21:10
 **/

/**
 * 接口（interface）：
 * 1、接口当中的方法，都是抽象方法
 * 2、可以有具体实现的方法,这个方法是被default修饰
 * 3、接口当中定义的成员变量，默认的是常量。
 * 4、接口当中的成员变量默认是： public static final
 * 成员方法是：public abstract
 * 5、接口不能被实例化
 * 6、接口和类之间的关系：implements
 * 7、为了解决Java单继承问题，可以实现多个接口。
 * 8、只要这个类 实现了这个接口，那么就可以进行向上转型
 */
interface Shape{
    //int a = 10;
    public abstract void draw();
    /*default void func1(){
        System.out.println("sssss");
    }*/
}
public class TestInterFace {
    public static void main(String[] args) {

    }
}
