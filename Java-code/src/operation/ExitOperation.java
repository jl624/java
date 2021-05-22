package operation;

import book.BookList;

/**
 * @program:
 * @Author: JINLEI
 * @Description:
 * @Date: 2021/3/30
 * @Time: 18:31
 **/
public class ExitOperation implements IOperation {
    @Override
    public void work(BookList bookList) {
        System.out.println("退出系统");
        System.exit(1);
    }
}
