/**
 * @program:
 * @Author: JINLEI
 * @Description:
 * @Date: 2021/4/8
 * @Time: 15:52
 **/
public class MyCircularQueue {

        public int[] elem;
        public  int front;
        public int rear;


        public MyCircularQueue(int k) {
                this.elem = new int[k];
        }
        //入队列
        public boolean enQueue(int value) {
                if(isFull()){
                        return false;
                }
                this.elem[this.rear] = value;
                this.rear = (this.rear+1)%this.elem.length;
                return false;
        }
        //出队列
        public boolean deQueue() {
                if (isEmpty()){
                        return false;
                }
                this.front = (this.front+1)%this.elem.length;
                return true;
        }
        //返回队列的头部元素
        public int Front() {
                if (isEmpty()){
                        return -1;
                }
                return this.elem[this.front];
        }
        //返回队尾元素
        public int Rear() {
                if (isEmpty()){
                        return -1;
                }
                int index = this.rear == 0 ? this.elem.length-1 : this.rear-1;
                return this.elem[index];
        }
        //判断队列是否为空
        public boolean isEmpty() {
                return this.rear == this.front;
        }
        //循环队列是否是满的
        public boolean isFull(){
                if ((this.rear+1)%this.elem.length == this.front){
                        return true;
                }
                return false;
        }


}
