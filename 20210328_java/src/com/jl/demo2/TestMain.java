package com.jl.demo2;

/**
 * @program:
 * @Author: JINLEI
 *    重写/覆写/覆盖：override
 *         1、方法名相同 2、返回值相同（还可是协变类型） 3、参数列表相同   不同的类-》继承关系
 *    重载：overload
 *         1、方法名相同  2、参数列表不同（参数的个数+ 类型）3、返回值不做要求 同一个类当中
 *    重写的注意：
 *         1、需要重写的方法，不能被final修饰。被final修饰后，密封方法，不可以修改
 *         2、被重写的方法，访问修饰限定符一定不能私有
 *         3、被重写的方法，子类当中的访问修饰限定要大于等于父类的访问修饰限定
 *            private < default < protected < public
 *         4、被 static修饰的方法是不能被重写的
 *     向下转型：
 *         向下转型不安全，很少使用
 * @Description:
 * @Date: 2021/3/29
 * @Time: 9:58
 **/
public class TestMain {

    /**
     * javap -c 类名   java的反汇编
     *  其中     invokespecial  代表调用构造方法
     *          invokevirtual  代表调用方法 ，非静态方法
     * 多态
     * 运行时绑定/动态绑定：在编译的时候调用Animal的eat方法  但是在运行时，却调用Cat（）方法
     * 父类引用 引用子类对象。 同时，通过父类引用调用同名的覆盖方法
     * 此时就会发生运行时绑定
     * @param args
     */
    public static void main(String[] args) {

    }
}
