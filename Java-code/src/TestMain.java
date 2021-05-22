import book.Book;
import book.BookList;
import user.Admin;
import user.NormalUser;
import user.User;

import java.util.Scanner;

/**
 * @program:
 * @Author: JINLEI
 * @Description:
 * @Date: 2021/3/30
 * @Time: 18:16
 **/
public class TestMain {

    public static User login(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入姓名：");
        String name = scanner.nextLine();
        System.out.println("请输入你的身份：1--> 管理员，2--> 普通用户");
        int choice = scanner.nextInt();
        if (choice == 1){
            return new Admin(name);
        }else {
            return new NormalUser(name);
        }
    }

    public static void main(String[] args) {

        //1、准备书籍
        BookList bookList  = new BookList(); 
        //2、登陆
        User user = login();
        while (true) {
            int choice = user.menu();
            //选择几 调用对应的方法
            user.doOperation(bookList, choice);
        }

    }
}
