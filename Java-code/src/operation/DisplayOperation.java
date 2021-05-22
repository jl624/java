package operation;

import book.Book;
import book.BookList;

/**
 * @program:
 * @Author: JINLEI
 * @Description:
 * @Date: 2021/3/30
 * @Time: 18:30
 **/
public class DisplayOperation implements IOperation{
    @Override
    public void work(BookList bookList) {
        System.out.println("显示图书");
        for (int i = 0; i < bookList.getUsedSize(); i++) {
            Book book = bookList.getBook(i);
            System.out.println(book);
        }
    }
}
