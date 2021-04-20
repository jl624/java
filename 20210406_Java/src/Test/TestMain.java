package Test;

import java.util.ArrayList;
import java.util.List;

/**
 * @program:
 * @Author: JINLEI
 * @Description:
 * @Date: 2021/4/6
 * @Time: 16:29
 **/
public class TestMain {
    public static void main(String[] args) {
        Student student = new Student("jl","普通班",60.9);
        Student student1 = new Student("gaobo","火箭班",50.9);
        List<Student> list = new ArrayList<>();
        list.add(student);
        list.add(student1);
        System.out.println(list);
    }
}
