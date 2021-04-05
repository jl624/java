package com.jl.demo;

/**
 * @program:
 * @Author: JINLEI
 * @Description:
 * @Date: 2021/3/28
 * @Time: 19:56
 **/
class Base{
    public int a;
}
class Derive extends Base{
    public  int b;
}
public class TestDemo2 {
    public static void main(String[] args) {
        Derive derive = new Derive();
    }
}
