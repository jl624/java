/**
 * @author lewjin
 * @data 2020/10/20 - 21:09
 */
/*
从键盘获取不同类型的变量：需要使用Scanner类
步骤：
    1.导包: import java.util.Scanner;
    2.Scanner的实例化:Scanner scan = new Scanner(System.in);
    3.调用Scanner类的相关方法(next() / nextXxx())，来获取指定类型的变量
注意：
    需要根据相应的方法，来输入指定的值，如果输入的数据类型与要求的数据类型不匹配，会报异常：InputMisMatchException,导致程序终止

 */

import java.util.Scanner;
public class ScannerTest {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        /*
        System.out.println("请输入你的姓名：");
        String name = scan.next();
        System.out.println(name);

        System.out.println("请输入你的芳龄：");
        int age = scan.nextInt();
        System.out.println(age);

        System.out.println("请输入你的体重：");
        double weight = scan.nextDouble();
        System.out.println(weight);

        System.out.println("你是否相中我了？(true/false)");
        boolean isLove = scan.nextBoolean();
        System.out.println(isLove);

        //对于char 型的获取，Scanner没有提供相关的方法，只能获取一个字符串
        System.out.println("请输入你的姓别：(男/女)");
        String gender = scan.next();//男
        char genderChar = gender.charAt(0);//获取索引为0位置上的字符
        System.out.println(genderChar);

         */

        //练习
/*      else结构是可选的
        针对于条件表法式：
            >如果多个条件表达式之间是互斥关系，哪个判断和执行语句声明在上还是下，无所谓；
            >如果多个条件表达式之间有交集，根据实际情况，考虑哪个结构声明在上面；
            >如果多个表达式之间有包含关系，通常情况下，需要将范围小的声明在范围大的上面。否则，范围小的就不会执行。
        */
        System.out.println("请输入越小彭的期末成绩： (0-100)");
        int score = scan.nextInt();

        if (score == 100){
            System.out.println("奖励一辆BMW");
        }else if (score > 80 && score <= 99){
            System.out.println("奖励一台 iphone xs max");
        }else if (score >= 60 && score <80){
            System.out.println("奖励一个ipad");
        }else {
            System.out.println("什么都么的");
        }



    }
}
