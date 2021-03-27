

/**
 * @program:
 * @Author: JINLEI
 * @Description:
 * @Date: 2021/3/15
 * @Time: 11:12
 **/

class Node{
    public int data; //0
    public Node next; //null

    public Node(int data){
        this.data = data;
        this.next = null;
    }
}
public class MyLinkedList {

    public Node head; //保存单链表的头节点的引用  null

    //头插法
    public void addFirst(int data){
         Node node = new Node(data);
         if(this.head == null){
             //第一次插入数据
             this.head = node;
             return;
         }
         node.next = this.head;
         this.head = node;
    }

    //尾插法
    public void addLast(int data){
       Node node = new Node(data);
       if (this.head == null){
           this.head = node;
           return;
       }
       Node cur = this.head;
       while (cur.next != null){
           cur = cur.next;
       }
       cur.next = node;

    }

    //任意位置插入，第一个数据节点为0号下标
    public void addIndex(int index, int data){
        Node node = new Node(data);
        if (index == 0){
            addFirst(data);
            return;
        }
        if (index == this.size()){
            addLast(data);
            return;
        }
        //先找到 index 位置的前一个节点的地址
        Node cur = searchIndex(index);
        node.next = cur.next;
        cur.next = node;

    }
    private Node searchIndex(int index){

        //1、对index进行合法性检查
        if (index < 0 || index > this.size()){
            throw new RuntimeException("index位置不合法");
        }
        Node cur = this.head; //index-1
        while (index-1 != 0){
            cur = cur.next;
            index--;
        }
        return cur;
    }

    //查找是否包含关键字key是否在单链表当中
    public boolean contains(int key){
        Node cur = this.head;
        while (cur != null){
            if (cur.data ==key){
                return true;
            }
            cur = cur.next;
        }
        return false;
    }

    //查找前驱
    private Node searchPrev(int key){
        Node prev = this.head;
        while (prev.next != null){
            if (prev.next.data ==key){
                return prev;
            }else {
                prev = prev.next;
            }
        }
        return null;
    }
    //删除第一次出现的关键字为key的节点
    public void remove(int key){
        if (this.head == null){
            return;
        }
        //删除的是不是头节点
        if (this.head.data == key){
            this.head = this.head.next;
            return;
        }
        //找到删除节点的前驱
        Node prev = searchPrev(key);
        if (prev == null){
            System.out.println("没有此节点");
            return;
        }
        //开始删除
        Node del = prev.next;
        prev.next = del.next;
    }
    //删除所有值为key的节点
    public void removeAllKey(int key){
         Node prev = this.head;
         Node cur = this.head.next;  //代表要删除的节点
         while (cur != null){
             if (cur.data == key){
                 prev.next = cur.next;
                 cur = cur.next;
             }else {
                 prev = cur;
                 cur = cur.next;
             }
         }
         if (this.head.data == key){
             this.head = this.head.next;
         }
    }
    //得到单链表的长度
    public int size(){
        int count = 0;
        Node cur = this.head;
        while(cur != null){
            count++;
            cur = cur.next;
        }
        return count;
    }

    //打印单链表
    public void display(){
        Node cur = this.head;
        while (cur != null){
            System.out.print(cur.data+" ");
            cur = cur.next;
        }
        System.out.println();
    }

    //单链表的反转
    public Node reverseList(){
        Node cur = this.head;
        Node prev = null;
        Node newHeaad = null;
        while (cur != null){
            Node curNext = cur.next;
            if (curNext == null){
                newHeaad = cur;
            }
            cur.next = prev;
            prev = cur;
            cur = curNext;
        }
        return newHeaad;
    }
    //打印反转之后的链表
    public void display2(Node newHead){
        Node cur = newHead;
        while (cur != null){
            System.out.print(cur.data+" ");
            cur = cur.next;
        }
        System.out.println();
    }
    //释放内存
    public void clear(){
        this.head = null;
    }

    //返回链表的中间节点
    public Node middleNode(){
        Node fast = this.head;
        Node slow = this.head;
        while (fast != null && slow != null){
            fast = fast.next.next;
            slow = slow.next;
        }
        return slow;
    }
 
    //删除链表中的重复的节点
    public Node deleteDuplicates () {
        Node newHead = new Node(-1);  //定义一个虚拟节点
        Node tmp = newHead;  //用来串不相同的节点
        Node cur = this.head;  //遍历单链表
        while (cur != null) {
            if (cur.next != null && cur.data == cur.next.data) {
                while (cur.next != null && cur.data == cur.next.data) {
                    cur = cur.next;
                }
                cur = cur.next;  //多走一步
            } else {
                tmp.next = cur;
                tmp = tmp.next;
                cur = cur.next;
            }
        }
        tmp.next = null;
        return newHead.next;
    }

    //判断链表是否为回文结构
    public boolean chkPalindrome() {
        //单链表为空  不是回文结构
        if (this.head == null){
            return false;
        }
        //这是只有头节点  必然是回文结构
        if (this.head.next == null){
            return true;
        }
        //找到单链表的中间节点
        Node fast = this.head;
        Node slow = this.head;
        while (fast != null && fast.next != null){
            fast = fast.next.next;
            slow = slow.next;
        }
        //2、反转单链表的后半部分 slow在中间位置
        Node cur = slow.next;
        while (cur != null){
             Node curNext = cur.next;
             cur.next = slow;
             slow = cur;
             cur = curNext;
        }
        //3、slow是最后一个节点了 开始一个从头走  一个从尾走
        while (slow != this.head){
            if (slow.data != this.head.data){
                return false;
            }
            //判断偶数个节点的情况
            if (this.head.next == slow){
                return true;
            }
            slow = slow.next;
            this.head = this.head.next;
        }
        return true;
    }
    //判断环形链表
    public boolean hasCycle() {
        Node fast = this.head;
        Node slow = this.head;
        while (fast != null && fast.next != null){
            fast = fast.next.next;
            slow = slow.next;
            if (fast == slow){
                return true;
            }
        }
        return false;
    }

    //给定一个链表，返回链表开始入环的第一个节点。 如果链表无环，则返回 null
    public Node detectCycle() {
        Node fast = this.head;
        Node slow = this.head;
        while (fast != null && fast.next != null){
            fast = fast.next.next;
            slow = slow.next;
            if (fast == slow){
                break;
            }
        }
        if (fast == null || fast.next == null){
            return null;
        }
        slow = this.head;
        while (slow != fast){
            slow = slow.next;
            fast = fast.next;
        }
        return slow;
    }
}
