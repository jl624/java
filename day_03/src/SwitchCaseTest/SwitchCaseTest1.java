package SwitchCaseTest;

/**
 * @author lewjin
 * @data 2020/10/28 - 11:30
 */
/*
说明：
    1.switch 结构中的表达式，只能是如下的6种数据类型之一：byte、short、char、int、枚举类型、String类型
    2.case 之后只能声明常量，不能声明范围。
    3.break关键字是可选的。
    4.default:相当于if-else中的else，default结构是可选的，位置灵活。
 */
public class SwitchCaseTest1 {
    public static void main(String[] args){
  /*
  例题：
      对于学生成绩大于60分的，输出“合格”，低于60分的，输出“不合格”
  */
        int score = 70;
        switch (score / 10){
            case 0:
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
                System.out.println("不及格");
                break;
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
                System.out.println("及格");
                break;
        }

        //更优
        switch (score /60){
            case 0:
                System.out.println("不及格");
                break;
            case 1:
                System.out.println("及格");
                break;
        }

        /*
        键盘输入2019年的month和day，要求通过程序输出输入的日期为2019年的第几天
         */


    }
}
