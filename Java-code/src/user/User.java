package user;

import book.BookList;
import operation.IOperation;

/**
 * @program:
 * @Author: JINLEI
 * @Description:
 * @Date: 2021/3/30
 * @Time: 18:40
 **/
public abstract class User {
    protected String name;
    protected IOperation[] operations;
    public User (String name){

        this.name = name;
    }
    public abstract int menu();
    public void doOperation(BookList bookList,int choice){
        this.operations[choice].work(bookList);
    }
}
