import java.util.Scanner;
/**
 * @author lewjin
 * @data 2020/10/28 - 10:37
 */
/*
我家的狗5岁了,5岁的狗相当于人类多大呢?其实,
狗的前两年每年相当于人类的10.5岁,之后每增加一年就增加四岁。
那么5岁的狗相当于人类多少年龄呢?应是:10.5+10.5+4+4+4=33岁。
编写一个程序:
获取用户输入的狗的年龄,
通过程序显示其相当于人类的年龄。
如果用户输入负数,请显示一个提示信息。
 */
public class IfTest3 {
    public  static  void main(String[] args){

        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入狗狗的年龄：");
        int dogAge = scanner.nextInt();

        if (dogAge >= 0 && dogAge <2){
            System.out.println("相当于人的年龄： " + dogAge * 10.5);
        }else if (dogAge > 2){
            System.out.println("相当于人的年龄：" + (2 * 10.5 + (dogAge - 2) * 4));
        }else {
            System.out.println("狗狗还没出生呢！");
        }


        //练习：如何获取随机数：10-99
        double value = (int)(Math.random() * 90 + 10);
        System.out.println(value);
        //公式：[a,b]  : (int)(Math.random() * (b - a + 1) + a)
    }
}
