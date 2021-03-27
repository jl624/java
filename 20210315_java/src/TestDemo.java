/**
 * @program:
 * @Author: JINLEI
 * @Description:
 *              单链表
 * @Date: 2021/3/15
 * @Time: 9:38
 **/
public class TestDemo {


    //
    public Node mergeTwoLists(Node headA, Node headB) {
        Node newHead = new Node(-1); //设置一个虚拟节点,串合并之后的链表
        Node tmp = newHead; //tmp指向 newHead
        while (headA != null && headB != null){
            if (headA.data < headB.data){
                //串A
                tmp.next = headA;
                tmp = tmp.next;
                headA = headA.next;
            }else {
                //串B
                tmp.next = headB;
                tmp = tmp.next;
                headB = headB.next;
            }
        }
        if (headA !=null){
            tmp.next = headA;
        }else {
            tmp.next = headB;
        }
        return newHead.next;
    }


    public static void createCut(Node headA, Node headB){
        headA.next = headB.next.next;
    }

    //相交链表
    public static Node getIntersectionNode(Node headA, Node headB) {
        //1、求长度、走差值步
        int lenA = 0;
        int lenB = 0;
        Node pl = headA;
        Node ps = headB;
        while (pl != null){
            lenA++;
            pl = pl.next;
        }
        while (ps != null){
            lenB++;
            ps = ps.next;
        }
        pl = headA;
        ps = headB;
        int len = lenA - lenB;
        if (len < 0){
            pl = headB;
            ps = headA;
            len = lenB - lenA;
        }
        //一定是pl指向最长的单链表
        for (int i = 0; i < len; i++) {
            pl = pl.next;
        }
        //2、ps 和 pl 一定是同一个起跑线上
        while (ps != pl && pl != null && ps != null){
            ps = ps.next;
            pl = pl.next;
        }
        if (pl == ps && pl != null){
            return pl;
        }
        return null;
    }


    public static void main(String[] args) {
        MyLinkedList myLinkedList = new MyLinkedList();
        myLinkedList.addLast(1);
        myLinkedList.addLast(2);
        myLinkedList.addLast(3);
        myLinkedList.addLast(4);
        myLinkedList.addLast(5);

        MyLinkedList myLinkedList2 = new MyLinkedList();
        myLinkedList2.addLast(11);
        myLinkedList2.addLast(21);
        myLinkedList2.addLast(13);
        myLinkedList2.addLast(34);
        myLinkedList2.addLast(54);

        createCut(myLinkedList.head,myLinkedList2.head);
        Node ret = getIntersectionNode(myLinkedList.head, myLinkedList2.head);
        System.out.println(ret.data);




        /*myLinkedList.display(); // 13 12 11 10
        Node ret = myLinkedList.reverseList();
        myLinkedList.display2(ret);*/
//        myLinkedList.addIndex(4,99);
//        myLinkedList.display();
        /*System.out.println(myLinkedList.contains(12));
        System.out.println(myLinkedList.size());*/

    }
}
