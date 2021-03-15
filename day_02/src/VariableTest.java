import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

/**
 * @author lewjin
 * @data 2020/10/18 - 11:51
 */
/*
变量的使用
    1.Java变量的格式： 数据类型 变量名 = 变量值
    2.变量必须先声明 后使用
       变量都定义在作用域内
       同一个定义域内，不可以声明两个同名的变量

 */
public class VariableTest {
    public static void main(String[] args) {

        //变量的定义
        int myAge = 12;
        //变量的使用
        System.out.println(myAge);

        //变量的声明
        int myNumber;
        //变量的赋值
        myNumber = 1002;

        System.out.println(myNumber);
        //System.out.println(myClass);
     /*
    基本数据类型之间的运算法则：(不包含boolean)
        1.自动类型提升：
            结论：当容量小的数据类型的变量与容量大的变量做运算时，结果自动提升为容量大的数据类型
            byte、char、short-->int-->long-->float-->double
        2.强制类型转换：自动运行提升运算的逆运算

     */

        double d1 = 12.45;
        int i1 = (int) d1;
        System.out.println(i1);

        long i3 = 142785L;
        System.out.println(i3);

        float f = 12.4F;
        System.out.println(f);

        //整型常量，默认类型为int型
        //浮点型常量，默认类型为double型


        //String类型变量的使用
        //1.String属于引用数据类型
        //2.声明String类型的变量是，使用一对""

        String s1 = "Hello World!";
        System.out.println(s1);

        //3.String可以和8种数据类型做运算,结果是String
        int number = 2007;
        String numberStr = "学号:";
        String info = numberStr + number;//连接运算
        boolean b1 = true;
        String info1 = info + b1;//连接运算
        System.out.println(info1);

        //*********************************************

        //练习1
        char c = 'a';//97
        int num = 10;
        String str = "Hello";
        System.out.println(c + num + str);//107Hello
        System.out.println(c + str + num);//aHello10
        System.out.println(c + (num + str));//a10Hello
        System.out.println((c + num) + str);//107Hello
        System.out.println(str + num + c);//Hello10a

        //取余运算
        //结果的符号与被模数的符号相同

        /*
        int n1 = 12;
        int n2 = 5;
        System.out.println("n1 % n2 = " + n1 % n2);
        */

        //自增不会改变数据类型
        //自增(前):先自增1，在运算
        int m1 = 10;
        int n1 = ++m1;
        System.out.println("m1 = " + m1 + "n1 = " + n1);

        //自增(后):先运算，在自增1
        int m2 = 10;
        int n2 = m2++;
        System.out.println("m2 = " + m2 + "n2 = " + n2);

        //自减(前)：先自减1，在运算
        //自减(后)：先运算，后自减1
        int a4 = 10;
        int b4 = a4--;//int b4 = --a4;
        System.out.println("a4 = " + a4 + "b4 = " + b4);

        /*
        练习：数字xxx情况如下：
                个位数：
                十位数：
                百位数：
         */
        int Num = 196;

        int bai = Num / 100;
        int shi = Num % 100 / 10;
        int ge = Num % 10;

        System.out.println("百位为：" + bai);
        System.out.println("十位为：" + shi);
        System.out.println("个位为：" + ge);

        /*
        赋值运算符：
            开发中，实现+2的方式，有几种(前提：int num = 10;)？
            ① num = num + 2;
            ② num += 2;(不会改变数据类型)

            开发中，实现+1的方式，有几种(前提：int num = 10;)？
            ① num = num + 1;
            ② num += 1;
            ③ num++;
         */

        //练习
        int m = 2;
        int n = 3;
        n *= m++;//n = n* m++
        System.out.println("m= "+ m);//3
        System.out.println("n= "+ n);//6

        /*
        比较运算符：
            结果都是boolean型(true/false)
         */

        /*
        逻辑运算符：
            都是boolean类型的变量
         */
        //区分& 与 &&：
        //  相同点：① & 和 &&的运算结果相同
        //         ②  当符号左边是true时，二者都会执行符号右边的操作
        // 不同点：当符号左边是false时，& 继续执行符号右边的运算，&&不再执行符号右边的操作

        /*
        区分| 与 ||：
            相同点：① |和 ||的运算结果相同
                   ②  符号左边是false时，二者都会执行符号右边的操作
            不同点：当符号左边是true时，| 继续执行符号右边的运算，||不再执行符号右边的操作
         */
    }
}

