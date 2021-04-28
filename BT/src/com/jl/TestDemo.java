package com.jl;

import java.util.Scanner;

/**
 * @author jinlei
 * @data 2021/2/20 - 18:50
 * 比特java
 */
public class TestDemo {
    public static void main(String[] args) {

        //数据类型的转换int转String
/*      int a = 100;
        String ret = String.valueOf(a);

        System.out.println(ret);*/

        //数据类型的转换String转int
/*        String str = "119";
        int a = Integer.valueOf(str);
        int b = a + 1; 
        System.out.println(b);*/

/*      double a = 1.1;
        double b = 2.1;
        System.out.println(a * b);*/

/*      System.out.println(5/2);//2
        System.out.println(5.0/2);//2.5
        System.out.println((float)5/2);//2.5
        System.out.println((float) (5/2));//2.0*/

/*
        System.out.println(10%3);//1
        System.out.println(-10%3);//-1
        System.out.println(10%-3);//1
        System.out.println(-10%-3);//-1
*/

/*      int a = 10;
        int b = ++a;//a=11  b=a
        System.out.println(b);//11
        int c = a++;//c=a a=a+1  a=12
        System.out.println(c);//11*/

/*      int i = 10;
        i = i++;
        System.out.println(i);//10
*/

/*
        int a = 10;
        int b = 20;
        System.out.println(a==b);
        System.out.println(a<=b);
        System.out.println(a!=b);
*/

        //求一个数2进制中1的个数
        //第一种
/*
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
*/

/*
        int count = 0;
        for (int i = 0; i < 32; i++){
            if (((n>>i) & 1) == 1){
                count++;
            }
        }
        System.out.println("count: "+count);
*/

        //第二种
/*
        int count = 0;
        while (n != 0){
            n = n & (n-1);
            count++;
        }
        System.out.println(count);
*/
        //获取一个数二进制序列中所有的偶数位和奇数位，分别输出二进制序列
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        for (int i = 31; i >= 1; i-=2){
            System.out.print(((n>>i) & 1)+" ");
        }
        System.out.println();
        for (int i = 30; i >= 0; i -= 2){
            System.out.print(((n>>i) & 1)+" ");
        }
    }
}
