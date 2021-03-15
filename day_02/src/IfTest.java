/**
 * @author lewjin
 * @data 2020/10/20 - 19:55
 */

/*
分支结构中的if-else
 */
public class IfTest {
    public static void main(String[] args){

        //举例1
        int heartBeats = 78;
        if (heartBeats < 60 || heartBeats > 100){
            System.out.println("需要做进一步的检察！");
        }
        System.out.println("检查结束!");

        //举例2
        int  age = 23;
        if (age < 18){
            System.out.println("你还是小孩子");
        }else {
            System.out.println("你是大孩子了");
        }

        //举例3
        if (age < 0){
            System.out.println("你输入的数据有误");
        }else if (age < 18){
            System.out.println("青少年时期");
        }else if (age <35){
            System.out.println("青壮年时期");
        }else if (age < 60){
            System.out.println("中年时期");
        }else if (age < 120){
            System.out.println("老年时期");
        }else {
            System.out.println("成仙！");
        }

        //练习1
        int num1 = 10;
        int num2 = 21;
        int num3 = -21;
        int max;
        if (num1 >= num2 && num1 >= num3){
            max = num1;
        }else if (num2 >= num1 && num2 >= num3){
            max = num2;
        }else{
            max = num3;
        }
        System.out.println("三个数中的最大值为：" +max);



    }
}
