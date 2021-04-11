import java.util.Arrays;

/**
 * @program:
 * @Author: JINLEI
 * @Description:
 * 栈
 * @Date: 2021/4/7
 * @Time: 10:50
 **/
public class MyStack<T> {
    public T[] elem;
    public int top; //表示当前可以存放数据元素的下标

    public MyStack(){

        this.elem = (T[])new Object[10];
    }
    public void push(T val){
        if (full()){
            this.elem  = Arrays.copyOf(this.elem,2*this.elem.length);
        }
        this.elem[this.top++] = val;
    }

    public boolean empty(){
        return this.top == 0;
    }
    public boolean full(){

        return this.top == this.elem.length;
    }
    public T pop(){
        if (empty()){
            throw new RuntimeException("栈空！");
        }
        T data = this.elem[top-1];
        this.top--;
        return data;
    }
    public T peek(){
        if (empty()){
            throw new RuntimeException("栈空！");
        }
        return  this.elem[this.top-1];
    }
    public int size(){
        return this.top;
    }
}
