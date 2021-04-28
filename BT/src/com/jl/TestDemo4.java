package com.jl;

/**
 * @program: BT
 * @description:
 * 方法的重载（overload）：
 *      1、方法名相同
 *      2、返回值不做要求
 *      3、参数列表不同（参数的个数或者参数的类型不同）
 *      4、同一个类当中
 * 面试题：
 *      重载和重写的区别？
 * @author: Jinlei
 * @data: 2021/2/25
 * @time: 23:32
 */
public class TestDemo4 {

    //方法的重载
    public static void main1(String[] args) {

        int a = 20;
        int b = 30;
        double x = 12.1;
        double y = 13.1;
        System.out.println(sum(a, b));
        System.out.println(sum(x, y));
        System.out.println(sum(a, x, y));
    }

    public static int sum(int a, int b){

        return a+b;
    }
    public static double sum(double a, double b){

        return a+b;
    }
    public static double sum(double a,double b,double c){

        return a+b+c;
    }

    /**
     *  递归（条件）:
     *      1、要调用自己本身
     *      2、要有一个趋近于终止的条件
     *      3、推导出递归的公式（ 核心）
     *思考递归：横向思考（不要走进代码）
     * 代码执行：纵向
     * @param args
     */
    public static void main(String[] args) {
        //System.out.println(fac(5));
        //func1(1243);
        // System.out.println(sum1(2));
        //System.out.println(func2(123));
        //第50项的斐波那契数超过了int的取值范围  所以是负数
        System.out.println(fabonaci1(50));
    }

    //输入一个数，依次输出
    public static void func1(int n){
        //123
        if (n > 9){
            func1(n/10);
        }
        System.out.println(n%10);
    }


    //阶乘
    public static int fac(int n){
        if (n == 1) {
            return 1;
        }
        return n * fac(n-1);
    }

    //1+....+n
    public static int sum1(int n){
        if (n == 1){
            return 1;
        }
        return n + sum1(n-1);
    }

    //写一个递归方法，输入一个非负整数，返回组成他的数字之和
    //如：输入1729，返回1+7+2+9，和为19
    public static int func2(int n) {
        if (n < 10) {
            return n ;
        }
        return n%10+func2(n / 10);
    }

    //求斐波那契数列(一般情况下不用递归，用迭代)
    public static int fabonaci(int n){
        if (n==1 || n==2){
            return 1;
        }
        return fabonaci(n-1) + fabonaci(n-2);
    }

    public static int fabonaci1(int n){
        int f1 = 1;
        int f2 = 1;
        //注意：如果n是1或者0，会出问题 
        int f3 = 1;
        for (int i = 3; i <= n; i++) {
            f3 = f1 + f2;
            f1 = f2;
            f2 = f3;
        }
        return f3;
    }


}
