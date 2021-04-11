/**
 * @program:
 * @Author: JINLEI
 * @Description:
 * 队列
 * @Date: 2021/4/7
 * @Time: 19:32
 **/
class Node{
    public int data;
    public Node next;
    public Node(int data){
        this.data = data;
    }
}
public class MyQueue {
    public int usedSize;
    public Node front; //头
    public Node rear; //尾

    //队列中添加元素
    public boolean offer(int val){
        Node node = new Node(val);
        if (this.rear == null){
            this.front = node;
            this.rear = node;
        }else {
            this.rear.next = node;
            this.rear = node;
        }
        this.usedSize++;
        return true;
    }
    //出队且删除队头元素
    public int poll(){
        if (isEmpty()){
            throw  new RuntimeException("队列为空");
        }
        int data = this.front.data;
        this.front = this.front.next;
        return data;
    }
    //返回队列头元素
    public int peek(){
        if (isEmpty()){
            throw  new RuntimeException("队列为空");
        }
        return this.front.data;
    }
    //判断队列是否为空
    public  boolean isEmpty(){
        return this.usedSize == 0;
    }
    //返回队列长度
    public int size(){
        return this.usedSize;
    }
}
