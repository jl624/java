/**
 * @program:
 * @Author: JINLEI
 * @Description:
 * @Date: 2021/3/25
 * @Time: 15:50
 **/
public class TestDemo {
    public static void main(String[] args) {
        MyLinkedList myLinkedlist = new MyLinkedList();
        myLinkedlist.addLast(6);
        myLinkedlist.addLast(7);
        myLinkedlist.addLast(8);
        myLinkedlist.addLast(9);
        myLinkedlist.addLast(10);
        myLinkedlist.display();

        System.out.println(myLinkedlist.contains(9));
        System.out.println(myLinkedlist.size());
    }
}
