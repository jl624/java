package com.jl;

import java.util.Arrays;

/**
 * @program: BT
 * @description:
 *          数组:存放相同数据类型的集合，内存是连续的。
 *          new:实例化一个对象 内存在堆上
 *          栈上的地址是拿不到的
 *          堆上的地址是可以打印但不是真实的  但是 是可以当作是真实的，地址也是唯一的
 *
 * @author: Jinlei
 * @data: 2021/3/1
 * @time: 15:58
 */
public class TestDemo6 {

    //把数组中偶数放前，奇数置后
    public static void swap1(int[] array){
        int left = 0;
        int right = array.length-1;
        while (left < right){
            while (left < right && array[left] % 2 == 0){
                //偶数
                left++;
            }
            //left遇到奇数
            while (left < right && array[right] % 2 !=0){
                right--;
            }
            //right肯定遇到偶数
            if (left < right){
                int tmp = array[left];
                array[left] = array[right];
                array[right] = tmp;
            }
        }
    }
    public static void main(String[] args) {
        int[] array = {2,3,1,6,7};
        swap1(array);
        System.out.println(Arrays.toString(array));
    }

    //数组的逆置
    public static void reverse(int[] array){
        int left = 0;
        int right = array.length-1;
        while (left < right ){
            int tmp = array[left];
            array[left] = array[right];
            array[right] = tmp;
            left++;
            right--;
        }

    }

    public static void main15 (String[] args) {
        int[] array = {1,2,3,4,5};
        reverse(array);
        System.out.println(Arrays.toString(array));
    }

    //冒泡排序
    public static void bubbleSort(int[] array){

        for (int i = 0; i < array.length-1; i++) {
            boolean flg = false;//没有发生交换
            for (int j = 0; j < array.length-1-i; j++) {

                if (array[j] > array[j+1]){
                    int tmp = array[j];
                    array[j] = array[j+1];
                    array[j+1] = tmp;
                    flg = true;
                }
            }
           if (flg == false){
               break;
           }
        }
    }

    public static void main14(String[] args) {
        int[] array  = {1,2,3,10,5,6};
        bubbleSort(array);
        System.out.println(Arrays.toString(array));
    }




    /**
     * 判断这个数组是否是升序的
     * 是：返回true
     * 不是： 返回 false
     * @param array
     * @return
     */
    public static boolean isUp(int[] array){
        for (int i = 0; i < array.length; i++) {
            if (array[i]>array[i+1]){
                return false;
            }
        }
        return true;
    }
    public static void main13(String[] args) {
        int[] array  = {1,2,3,10,5,6};
        System.out.println(isUp(array));
    }

    /**
     * Arrays工具类中常用的方法：
     *  toString()  binarySearch()  copyOf()
     * @param args
     */
    public static void main12(String[] args) {

        int[] array = {1,21,13,41,15,61,7,8,19};

        Arrays.sort(array);//排序
        System.out.println(Arrays.toString(array));

        /*int[] array2 = {1,2,3,4,5,6,7,8,9};
        System.out.println(Arrays.equals(array, array2));*/
        //[fromIndex, toIndex) 左闭右开
        //System.out.println(Arrays.binarySearch(array, 2, 5, 6));
        //int[] ret = Arrays.copyOfRange(array,2,5);
        //System.out.println(Arrays.toString(ret));
    }

    //二分查找：折半查找 （给定一个有序序列）
    public static int binarySearch(int[] array, int key){
        int left = 0;
        int right = array.length-1;
        while (left <= right){
            count++;
            int mid = (left+right)/2;
            if(array[mid] < key){
                left = mid + 1;
            }else if (array[mid] == key){
                return mid;
            }else {
                right = mid-1;
            }
        }
        return -1;
    }


    /**
     * 顺序查找
     * @param array
     * @param key
     * @return
     */
    public static int count = 0;
    public static int find(int[] array, int key){
        for (int i = 0; i < array.length; i++) {
            //count++;
            if (array[i] == key){
                return i;
            }
        }
        return -1;//代表没有这个元素，因为数组没有-1
    }


    public static int findMax(int[] array){
        int max = array[0];
        for (int i = 1;i < array.length; i++){
            if(max<array[i]){
                max = array[i];
            }
        }
        return max;
    }

    /**
     * 找出数组中的最大元素
     * @param args
     */
    public static void main11(String[] args) {
        int[] array = new int[1_0000];
        for (int i = 0; i < array.length; i++) {
            array[i] = i;
        }
        //System.out.println(findMax(array));
        /*int ret = binarySearch(array,9999);
        System.out.println("下标: "+ ret+"找到次数："+count);*/
        System.out.println(Arrays.binarySearch(array, 9999));
    }


    /**
     * 数组的拷贝 有4种方式
     * for
     * Arrays.copyOf（底层用C/C++，native方法）
     * System.arraycopy
     * array.clone:产生了这个对象的副本，这个方法是Object的克隆方法
     * object：所有类的父类
     * 从本质来说   以上四种方法都是浅拷贝
     * 浅拷贝：数组中存放引用类型 （地址 0x99）
     * 深拷贝：数组中存放简单类型  （int）
     * @param args
     */
    public static void main9(String[] args) {
        int[] array = {1,2,3,4,5,6};
/*      int[] ret = Arrays.copyOf(array,array.length);
        System.out.println(Arrays.toString(ret));*/

        /*int[] ret = new int[array.length];
        System.arraycopy(array,0,ret,0,array.length);
        System.out.println(Arrays.toString(ret));*/

        int[] ret = array.clone();
        System.out.println(Arrays.toString(ret));
    }

    //数组的拷贝
    public static int[] copyArray(int[] array){
        int[] array2 = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            array2[i] = array[i];
        }
        return array2;
    }
    public static void main8(String[] args) {
        int[] array = {12,23,34,45};
        System.out.println(Arrays.toString(copyArray(array)));
    }

    public static void main7(String[] args) {
        int[] array = {12,14,45,65,57,87};
        System.out.println(myToString(array));
    }
    //myToString方法，输出字符串
    public static String myToString(int[] array){

        String ret = "[";
        for (int i = 0; i < array.length; i++) {
            ret += array[i];
            if (i != array.length-1) {
                ret += ",";
            }
        }
        ret += "]";
        return ret;
    }

    //输出的数组*2
    public static int[] func(int[] array){
        int[] tmp = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            tmp[i] = array[i] * 2 ;
        }
        return tmp;
    }
    public static void main6(String[] args) {
        int[] array = {1,2,3,4,5,6,7};
        int[] ret = func(array);

        //Arrays 把他叫做 操作数组的工具类
        System.out.println(Arrays.toString(ret));
    }

    public static void main5(String[] args) {
        int a = 0;
        System.out.println(a);
        int[] array = null;//array引用的是个空对象
        System.out.println(array);
    }
    public static void main1(String[] args) {
        int[] array = {1,2,3,4};
        int[] array2 = new int[]{11,22,33,44};
        int[] array3 = new int[4];//0
    }

    public static void main2(String[] args) {
         int[] array = {1,3,2,4};
        System.out.println(array[100]);//java.lang.ArrayIndexOutOfBoundsException下标越界异常
/*       int len = array.length;//属性
         System.out.println(len);*/
/*       for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]+" ");

        }
        System.out.println("==================");

        for (int val : array){
            System.out.print(val+" ");
        }*/
    }

    public static void printArray(int[] arr){
        for (int x: arr) {
            System.out.print(x+" ");
        }
    }

    public static void swap(int[] array){
        int tmp = array[0];
        array[0] = array[1];
        array[1] = tmp;
    }
    /**
     * 数组进行参数传递
     * @param args
     */
    public static void main3(String[] args) {
/*
        int[] array = {1,3,2,4};
        printArray(array);
*/
/*

        int[] array2 = {10,20};
        System.out.println(array2[0]+" "+array2[1]);
        swap(array2);
        System.out.println(array2[0]+" "+array2[1]);
*/

        int[] array = {1,2,3,4,5,6,7,8,9,10};
        //将数组  以字符串形式输出
        System.out.println(Arrays.toString(array));


    }
}
