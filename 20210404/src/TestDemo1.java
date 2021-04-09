/**
 * @program:
 * @Author: JINLEI
 * @Description:
 * 自定义异常
 * 最好继承与Exception，必须去处理这个异常
 * @Date: 2021/4/4
 * @Time: 16:02
 **/
//自定义异常要继承父类
class MyException extends RuntimeException{
    public MyException() {
        super();
    }

    public MyException(String message) {
        super(message);
    }
}

public class TestDemo1 {
    public static void func(int x) throws MyException{
        if (x == 10){
            throw new MyException("x == 10");
        }
    }
    public static void main(String[] args) {
        try {
            func(10);
        }catch (MyException e){
            e.printStackTrace();
        }
    }
}
