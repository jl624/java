/**
 * @program:
 * @Author: JINLEI
 * @Description:
 *              无头双向链表
 * @Date: 2021/3/25
 * @Time: 15:49
 **/

class Node{
    public int data;  //数据
    public Node next;  //后继信息
    public Node prev;  //前驱信息

    public Node (int data){

        this.data = data;
    }
}
public class MyLinkedList {

    public Node head; //双向链表的头
    public Node tail; //双向链表的尾

    //无头双向链表头插法
    public void addFirst(int data){
        Node node = new Node(data);
        if (this.head == null) {
            //第一次插入数据
            this.head = node;
            this.tail = node;
        }else {
            node.next = this.head;
            this.head.prev = node;
            this.head = node;
        }
    }
    //无头双向链表尾插法
    public void addLast(int data){
        Node node = new Node(data);
        if (this.head == null){
            //第一次插入
            this.head = node;
            this.tail = node;
        }else {
            this.tail.next = node;
            node.prev = this.tail;
            this.tail = node;
        }
    }
    //打印无头双向链表
    public void display(){
        Node cur = this.head;
        while (cur != null){
            System.out.print(cur.data+ " ");
            cur = cur.next;
        }
        System.out.println();
    }
    //查找是否包含关键字key是否在双向链表中
    public boolean contains(int key){
        Node cur = this.head;
        while (cur != null ){
            if (cur.data == key) {
                return true;
            }
            cur = cur.next;
        }
        return false;
    }
    //得到双向链表的长度
    public int size(){
        int count = 0;
        Node cur = this.head;
        while (cur != null){
            count++;
            cur = cur.next;
        }
        return count;
    }
    private void checkIndex(int index){
        if (index < 0 || index > size()){
            throw new RuntimeException("index不合法");
        }
    }
    private Node searchIndex(int index){
        Node cur = this.head;
        while (index != 0){
            cur = cur.next;
            index--;
        }
        return cur;
    }
    //任意位置插入，第一个数据节点为0号下标
    public void addIndex(int index, int data){
        checkIndex(index);
        if (index == 0){
            addFirst(data);
            return ;
        }
        if (index == size()){
            addLast(data);
            return ;
        }
        Node cur = searchIndex(index);
        Node node = new Node(data);
        node.next = cur;
        node.prev = cur.prev;
        cur.prev.next = node;
        cur.prev = node;
    }
    //删除第一次出现的关键字为key的节点
    public int remove(int key){
        Node cur = this.head;
        while (cur != null){
            if (cur.data == key){
                int oldData = cur.data;
                // 删除的是头节点
                if (cur == this.head){
                    this.head = this.head.next;
                    this.head.prev = null;
                }else {
                    //不是头节点
                    cur.prev.next = cur.next;
                    //判断是不是尾节点
                    if (cur.next != null){
                        cur.next.prev = cur.prev;
                    }else {
                        this.tail = cur.prev; //删除的尾巴节点  只需要tail 前移
                    }
                }
                return oldData;
            }
            cur = cur.next;
        }
        return -1;
    }
    //删除所有值为key的节点
    public void removeAllKey(int key){
        Node cur = this.head;
        while (cur != null){
            if (cur.data == key){
                int oldData = cur.data;
                // 删除的是头节点
                if (cur == this.head){
                        this.head = this.head.next;
                    if (this.head != null) {
                        this.head.prev = null;
                    }
                }else {
                    //不是头节点
                    cur.prev.next = cur.next;
                    //判断是不是尾节点
                    if (cur.next != null){
                        cur.next.prev = cur.prev;
                    }else {
                        this.tail = cur.prev; //删除的尾巴节点  只需要tail 前移
                    }
                }
            }
            cur = cur.next;
        }
    }

    /**
     * 清除双向链表
     * 一个一个节点进行释放
     */
    public void clear(){
        while (this.head != null){
            Node cur = this.head.next;
            this.head.prev = null;
            this.head.next = null;
            this.head = cur;
        }
        this.tail = null;
    }
}
