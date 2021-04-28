package com.jl;

/**
 * @program: BT
 * @description:
 * @author: Jinlei
 * @data: 2021/3/1
 * @time: 14:32
 */
public class TestDemo5 {
    public static void main(String[] args) {
/*
        hanoi(1,'A','B','C');
        System.out.println();
        hanoi(2,'A','B','C');
        System.out.println();
        hanoi(3,'A','B','C');
*/
        System.out.println(jumpFloor(4));
    }

    /**
     * 从pos1位置  挪到 pos2位置
     */
    public static void move(char pos1, char pos2){
        System.out.print(pos1+"->"+ pos2+" ");
    }

    /**
     * 汉诺塔问题
     * @param n  盘子个数
     * @param pos1 起始位置
     * @param pos2 中途位置
     * @param pos3 目的地位置
     */
    public static void hanoi(int n,char pos1,char pos2, char pos3){
        if (n == 1){
            move(pos1,pos3);
        }else {
            hanoi(n-1,pos1,pos3,pos2);
            move(pos1,pos3);
            hanoi(n-1,pos2,pos1,pos3);
        }

    }

    /**
     * 青蛙跳台阶（递归）
     * @param n  台阶数
     */
    public static int jumpFloor(int n){
        if (n == 1){
            return 1;
        }else if (n ==2){
            return 2;
        }else {
            return jumpFloor(n-1)+jumpFloor(n-2);
        }
    }
}
