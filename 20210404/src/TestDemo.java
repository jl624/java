/**
 * @program:
 * @Author: JINLEI
 * @Description:
 *              异常
 * @Date: 2021/4/4
 * @Time: 15:46
 **/

public class TestDemo {

    /**
     * 抛出异常:
     * throw 一般抛出想要抛出的异常
     * @param args
     */
    public static void main(String[] args) {
        int x = 0;
        if (x == 0){
            throw new UnsupportedOperationException("x == 0");
        }
    }
}
