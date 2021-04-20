import java.lang.ref.SoftReference;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * @program:
 * @Author: JINLEI
 * @Description:
 * List集合
 * @Date: 2021/4/6
 * @Time: 15:16
 **/
public class TestMain {

    public static List<Character> func(String str1, String str2){
        List<Character> list = new ArrayList<>();
        for (int i = 0; i < str1.length(); i++) {
            char ch = str1.charAt(i);
            if (!str2.contains(ch+"")){
                list.add(ch);
            }
        }
        return list;
    }

    public static void main(String[] args) {
        String str = "welcome to bit";
        String str1 = "come";
        List<Character> ret = func(str,str1);
        for (char ch:ret) {
            System.out.print(ch);
        }
    }
    public static void main2(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(34);
        list.add(12);
        list.add(2);
        list.add(45);
        list.add(1);
        System.out.println(list);
        Collections.sort(list);
        System.out.println(list);
    }

    public static void main1(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("hello");
        list.add(0,"abc");
        System.out.println(list);
        List<String> list1 = new ArrayList<>();
        list.add("java");
        list.add("bit");
        list.addAll(list1);
        System.out.println(list);

        String ret = list.remove(0);
        System.out.println(ret);

        list.remove("bit");
        System.out.println(list);
        System.out.println("===========get============");
        ret = list.get(0);
        System.out.println(ret);//hello
        System.out.println("=========set===========");
        list.set(0,"hhh");//更新已有位置
        System.out.println(list);

        System.out.println(list.contains("hhh"));//判断是否有hhh
        System.out.println(list.indexOf("hhh"));
        list.add("hhh");//hhh   java    hhh
        //从后往前查找第一个hhh出现的位置
        System.out.println(list.lastIndexOf("hhh"));// 2
        System.out.println("============subList(浅拷贝)===============");
        List<String> retList = list.subList(0,2);
        System.out.println(retList);//  hhh  java

        retList.set(0,"jl");
        System.out.println(retList);//jl   java
        System.out.println(list);
        list.clear();
        System.out.println(list);


    }
}
