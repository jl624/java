package com.jl;

/**
 * @program: BT
 * @description:交换两个数（暂时没成功）
 * @author: Jinlei
 * @data: 2021/2/25
 * @time: 23:09
 */
public class TestDemo3 {

    public static void swap(int x,int y){
        int tmp = x;
        x = y;
        y = tmp;
    }
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        swap(a,b);
        System.out.println(a +" "+ b);
    }
}
