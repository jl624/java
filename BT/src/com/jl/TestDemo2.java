package com.jl;

import java.util.Scanner;

/**
 * @program: BT
 * @description:
 * 方法：功能
 * public static 返回值 方法名（形式参数列表）{方法体}
 * 方法名：小驼峰形式  maxNum
 * public static：当前所有方法写完之后会在mian方法中调用
 * mian方法是public static的
 * 返回值：可有可无  若有 返回值的类型需要和方法的返回值类型匹配
 * 形式参数列表：->形参  实参的一份拷贝
 * 方法体：具体方法的实现
 * return代表函数的结束，下面的代码不会执行
 * Java中只有按值传递，没有按地址传递
 * @author: Jinlei
 * @data: 2021/2/25
 * @time: 16:32
 */
public class TestDemo2 {

    //阶乘
    public static int factor(int n){
        //每个数字1-n
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += fac(i);
        }
        return sum;
    }

    /**
     * 求某个数字的阶乘
     * @return
     */
    public static int fac(int num){
        int ret = 1;
        for (int i = 1; i <= num; i++) {
            ret *=i;
        }
        return ret;

    }
    public static void main(String[] args) {
        System.out.println(factor(7));
    }
    //一个方法实现两个整数相加
    public static int sum(int a,int b){
        return a+b;

    }
    //获得两个数的最大值
    public static int maxNum(int num1,int num2){
        return num1 > num2 ? num1 : num2;
    }

    //求三个数的最大值
    public static int maxThreeNum(int num1, int num2, int num3){
        int max = maxNum(num1,num2);
        return maxNum(max,num3);

    }

/*
    public static void main1(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n1 = scanner.nextInt();
        int n2 = scanner.nextInt();
*/
/*      int ret = maxNum(n1,n2);
        System.out.println(ret);*//*

        int n3 = scanner.nextInt();
        System.out.println(maxThreeNum(n1, n2, n3));

        int a = 10;
        int b = 20;
        int ret1 = sum(a,b);
        System.out.println(ret1);
    }
*/

}
